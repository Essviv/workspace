package com.cmcc.sunyiwei;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cmcc.vrp.util.PageResult;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;


public class Main {
	public static void main(String[] args) throws IOException, TemplateException {
		testPageResult();
//		testMethod();
//		testAdminView();
	}	
	
	private static void testAdminView() throws IOException, TemplateException{
		Configuration configuration  = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File("src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		//设置用户名
		String szUserName = "sunyiwei";
		
		//设置用户列表
		int nCount = 10;
		List<Administer> admins = new ArrayList<Administer>();
		for(int i=0;i<nCount; i++){
			Administer administer = new Administer();
			administer.setId(i);
			administer.setUserName("sunyiwei" + i);
			administer.setEmail("sunyiwei" + i + "@chinamobile.com");
			administer.setMobilePhone("1886710210" + i);
			
			admins.add(administer);
		}
		
		//设置分页信息
		PageResult pageResult = new PageResult();
		pageResult.setCallbackURL("www.baidu.com");
		
		Map params = new HashMap<String, Object>();
		params.put("userName", szUserName);
		params.put("admins", admins);
		params.put("pageResult", pageResult);
		
		Template template = configuration.getTemplate("testAdminView.ftl");
//		Writer writer = new OutputStreamWriter(System.out);
		Writer writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\out.html"));
		template.process(params, writer);
		
		System.out.println("OK");
	}
	
	private static void testMethod() throws IOException, TemplateException
	{
		Configuration configuration  = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File("src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
				
		TestBean testBean = new TestBean();
		testBean.setUrl("www.baidu.com");
		testBean.setName("sunyiwei");
		
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("name", "sunyiwei");
		map.put("obj", testBean);
		
		Map params = new HashMap<String, Object>();
		params.put("testBean", testBean);
		params.put("map", map);
		
		Template template = configuration.getTemplate("testMethod.ftl");
		Writer writer = new OutputStreamWriter(System.out);
		template.process(params, writer);
	}
	
	private static void testPageResult() throws IOException, TemplateException{
		Configuration configuration  = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File("src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		PageResult pageResult = new PageResult();
		pageResult.setPageSize(10);
		pageResult.setPageCount(10);
		pageResult.setCurrentPage(3);
		pageResult.setTotalCount(97);
		pageResult.setCallbackURL("www.baidu.com");
		
		Map params = new HashMap<String, Object>();
		params.put("entId", 432);
		params.put("prdId", "43");
//		params.put("author", "sunyiwei");
		
		pageResult.setParams(params);
		
		//设置dataModel
		Map mainParams = new HashMap<String, Object>();
		mainParams.put("pageResult", pageResult);
		
		Template template = configuration.getTemplate("index.ftl");
		Writer writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\out.html"));
		template.process(mainParams, writer);
		
		System.out.println("OK");
	}
	
	private static void testIndex() throws IOException, TemplateException{
		
	}
}
