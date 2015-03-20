/**
 * @Title: 	HrefContentProvider.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午1:45:36 
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
 * @ClassName:	HrefCellContentProvider 
 * @Description:  超链接内容提供者
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午1:45:36 
 *  
 */
public class HrefCellContentProvider implements ICellContentProvider{
	private HrefObject hrefObject =null;
	
	public HrefCellContentProvider(HrefObject hrefObject)
	{
		this.hrefObject = hrefObject;
	}
	
	public String getString() {
		try {
			return getStringFromHref(hrefObject);
		} catch (IOException e) {
			return "";
		} catch (TemplateException e) {
			return "";
		}
	}
	
	/** 
	 * @Title: getString 
	 * @Description: 由超链接对象生成超链接字符串
	 * @param t
	 * @return 
	 * @see com.cmcc.vrp.util.ICellContentProvider#getString(java.lang.Object) 
	 */
	public String getString(Object t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	/**
	 * 
	* @Title:getStringFromHref 
	* @Description: 由超链接对象生成超链接字符串
	* @param hrefObject
	* @return
	* @throws IOException
	* @throws TemplateException
	* @throws
	* @author:	sunyiwei
	 */
	private String getStringFromHref(HrefObject hrefObject) throws IOException, TemplateException{
		Configuration configuration  = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File("src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		Map<String, Object> mainParams = new HashMap<String, Object>();
		mainParams.put("hrefObject", hrefObject);
		
		Template template = configuration.getTemplate("href.ftl");
		OutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		template.process(mainParams, writer);
		
		return writer.toString();
	}

	public HrefObject getHrefObject() {
		return hrefObject;
	}

	public void setHrefObject(HrefObject hrefObject) {
		this.hrefObject = hrefObject;
	}
}
