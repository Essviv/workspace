/**
 * @Title: 	RowContentProvider.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午2:16:01 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import freemarker.log.Logger;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * @ClassName: RowContentProvider
 * @Description: 行内容提供接口，利用模板实现
 * @author: sunyiwei
 * @date: 2015年3月20日 下午2:16:01
 * 
 */
public class RowContentProvider<T> implements IContentProvider<T> {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	/**
	 * 每一行内容的输出模板路径
	 */
	private String ftlRowPatternPath = null;

	/**
	 * 表头内容的输出模板路径
	 */
	private String ftlHeaderPath = null;

	

	public RowContentProvider(String ftlHeaderPath, String ftlRowPatternPath, 
			Map<String, Object> params) {
		this.ftlRowPatternPath = ftlRowPatternPath;
		this.ftlHeaderPath = ftlHeaderPath;
		
		if(params == null){
			params = new HashMap<String, Object>();
		}
		this.params = params;
	}

	public String getFtlPath() {
		return ftlRowPatternPath;
	}

	public void setFtlPath(String ftlPath) {
		this.ftlRowPatternPath = ftlPath;
	}

	

	@Override
	public String getHeaderText() {
		return templateToContent(ftlHeaderPath, params);
	}

	@Override
	public String getRowString(T t) {
		params.put(t.getClass().getSimpleName().toLowerCase(), t);
		return templateToContent(ftlRowPatternPath, params);
	}

	/**
	 * 
	 * @Title:templateToContent
	 * @Description: 利用模板文件和参数，生成实际的数据
	 * @param templatePath
	 * @param params
	 * @return
	 * @throws
	 * @author: sunyiwei
	 */
	private String templateToContent(String templatePath,
			Map<String, Object> params) {
		Configuration configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
		try {
			configuration.setDirectoryForTemplateLoading(new File(this.getClass().getResource("/freeMarker/").getFile()));
		} catch (IOException e1) {
			return null;
		}
		
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		Template template;
		try {
			template = configuration.getTemplate(templatePath);
		} catch (IOException e) {
			logger.error(e.getMessage());
			return null;
		}

		OutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		try {
			template.process(params, writer);
		} catch (TemplateException e) {
			logger.error(e.getMessage());
			return null;
		} catch (IOException e) {
			logger.error(e.getMessage());
			return null;
		}

		return outputStream.toString();
	}
}
