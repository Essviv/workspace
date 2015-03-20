/**
 * @Title: 	HrefObject.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 上午10:44:47 
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

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/** 
 * @ClassName:	HrefObject 
 * @Description:  超链接对象
 * @author:	sunyiwei
 * @date:	2015年3月20日 上午10:44:47 
 *  
 */
public class HrefObject {
	private String text;
	private String callback;
	private Map<String, Object> queryCriteria = new HashMap<String, Object>();
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public Map<String, Object> getQueryCriteria() {
		return queryCriteria;
	}
	public void setQueryCriteria(Map<String, Object> queryCriteria) {
		this.queryCriteria = queryCriteria;
	}	
	
	/** 
	 * @Title: toString 
	 * @Description: 转化成字符串
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		Configuration configuration  = new Configuration();
		
		try {
			configuration.setDirectoryForTemplateLoading(new File("src/main/resources/"));
		} catch (IOException e1) {
			return null;
		}
		
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		Map<String, Object> mainParams = new HashMap<String, Object>();
		mainParams.put("hrefObject", this);
		
		Template template;
		try {
			template = configuration.getTemplate("href.ftl");
		} catch (IOException e) {
			return null;
		}
		
		OutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		try {
			template.process(mainParams, writer);
		} catch (TemplateException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
		
		return outputStream.toString();
	}
}
