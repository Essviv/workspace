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

	/**
	 * 输出模板的参数设置, 默认会有以T类名为key的变量
	 */
	private Map<String, Object> params = new HashMap<String, Object>();

	public RowContentProvider(String ftlHeaderPath, String ftlRowPatternPath,
			Map<String, Object> params) {
		this.ftlRowPatternPath = ftlRowPatternPath;
		this.ftlHeaderPath = ftlHeaderPath;

		if (params == null) {
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

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public String getFtlHeaderPath() {
		return ftlHeaderPath;
	}

	public void setFtlHeaderPath(String ftlHeaderPath) {
		this.ftlHeaderPath = ftlHeaderPath;
	}

	/** 
	 * @Title: getHeaderText 
	 * @Description: TODO
	 * @return 
	 * @see com.cmcc.vrp.util.IContentProvider#getHeaderText() 
	 */
	public String getHeader() {
		return ftlHeaderPath;
	}

	/** 
	 * @Title: getRowString 
	 * @Description: TODO
	 * @param t
	 * @return 
	 * @see com.cmcc.vrp.util.IContentProvider#getRowString(java.lang.Object) 
	 */
	public String getRow(T t) {
		return ftlRowPatternPath;
	}
}
