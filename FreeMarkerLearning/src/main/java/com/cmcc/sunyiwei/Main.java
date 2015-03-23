package com.cmcc.sunyiwei;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cmcc.vrp.util.HrefObject;
import com.cmcc.vrp.util.PageResult;

import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class Main {
	public static void main(String[] args) throws IOException,
			TemplateException {
		// testPageResult();
		// testMethod();
		 testAdminView();
//		testTableListObject();
		// testMapToQueryString();
		// testGetHref();
//		System.out.println(new Administer().getClass().getName());
//		System.out.println(new Administer().getClass().getSimpleName());
	}

	private static void testAdminView() throws IOException, TemplateException {
		Configuration configuration = new Configuration();
//		configuration.setDirectoryForTemplateLoading(new File(
//				"src/main/resources/"));
		configuration.setClassForTemplateLoading(Main.class, "/");
		
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// 设置用户名
		String szUserName = "sunyiwei";

		// 设置用户列表
		int nCount = 10;
		List<Administer> admins = new ArrayList<Administer>();
		for (int i = 0; i < nCount; i++) {
			Administer administer = new Administer();
			administer.setId(i);
			administer.setUserName("sunyiwei" + i);
			administer.setEmail("sunyiwei" + i + "@chinamobile.com");
			administer.setMobilePhone("1886710210" + i);

			admins.add(administer);
		}

		// 设置分页信息
		PageResult pageResult = new PageResult();
		pageResult.setCallbackURL("www.baidu.com");

		Map params = new HashMap<String, Object>();
		params.put("userName", szUserName);
		params.put("admins", admins);
		params.put("pageResult", pageResult);

		Template template = configuration.getTemplate("testAdminView.ftl");
		// Writer writer = new OutputStreamWriter(System.out);
		Writer writer = new OutputStreamWriter(new FileOutputStream(
				"C:\\Users\\Lenovo\\Desktop\\out.html"));
		template.process(params, writer);

		System.out.println("OK");
	}

	private static void testMethod() throws IOException, TemplateException {
		Configuration configuration = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		TestBean testBean = new TestBean();
		testBean.setUrl("www.baidu.com");
		testBean.setName("sunyiwei");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "sunyiwei");
		map.put("obj", testBean);

		Map params = new HashMap<String, Object>();
		params.put("testBean", testBean);
		params.put("map", map);

		Template template = configuration.getTemplate("testMethod.ftl");
		Writer writer = new OutputStreamWriter(System.out);
		template.process(params, writer);
	}

	private static void testTableListObject() throws IOException,
			TemplateException {
		Configuration configuration = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		TableObject<Administer> tableObject = new TableObject<Administer>();

		List<String> headerList = new ArrayList<String>();
		headerList.add("用户名");
		headerList.add("手机号");
		headerList.add("邮箱");
		headerList.add("其它");
		tableObject.setHeaderTextList(headerList);

		List<Administer> administers = new ArrayList<Administer>();
		for (int i = 0; i < 10; i++) {
			Administer administer = new Administer();
			administer.setUserName("sunyiwei_" + i);
			administer.setMobilePhone("1886710210" + i);
			administer.setEmail("sunyiwei_" + i + "@chinamobile.com");
			administers.add(administer);
		}
		tableObject.setDataList(administers);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("url", "http://www.baidu.com");
		params.put("text", "测试");
		
		IRowContentProvider<Administer> rowContentProvider = new RowContentProvider<Administer>(params, "admin.ftl");
		tableObject.setRowContentProvider(rowContentProvider);

		// 设置dataModel
		Map mainParams = new HashMap<String, Object>();
		mainParams.put("tableObject", tableObject);

		Template template = configuration.getTemplate("test.ftl");
		Writer writer = new OutputStreamWriter(new FileOutputStream(
				"C:\\Users\\Lenovo\\Desktop\\table.html"));
		template.process(mainParams, writer);

		System.out.println("OK");
	}

	private static void testMapToQueryString() throws IOException,
			TemplateException {
		Configuration configuration = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// 设置dataModel
		Map<String, String> params = new HashMap<String, String>();
		params.put("author", "name");
		params.put("email", "sunyiwei@chinamobiel.com");

		Map mainParams = new HashMap<String, Object>();
		mainParams.put("params", params);

		Template template = configuration.getTemplate("mapToQueryString.ftl");
		Writer writer = new OutputStreamWriter(new FileOutputStream(
				"C:\\Users\\Lenovo\\Desktop\\mapToQueryString.html"));
		template.process(mainParams, writer);

		System.out.println("OK");
	}

	private static void testGetHref() throws IOException, TemplateException {
		Configuration configuration = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// 设置dataModel
		Map<String, Object> queryParam = new HashMap<String, Object>();
		queryParam.put("author", "sunyiwei");
		queryParam.put("id", 50);

		HrefObject hrefObject = new HrefObject();
		hrefObject.setCallback("http://www.baidu.com");
		hrefObject.setText("Click me");
		hrefObject.setQueryCriteria(queryParam);

		Map mainParams = new HashMap<String, Object>();
		mainParams.put("hrefObject", hrefObject);

		Template template = configuration.getTemplate("href.ftl");

		OutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		template.process(mainParams, writer);

		System.out.println(outputStream);
		System.out.println("OK");
	}

	private static void testPageResult() throws IOException, TemplateException {
		Configuration configuration = new Configuration();
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/resources/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration
				.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		PageResult pageResult = new PageResult();
		pageResult.setPageSize(10);
		pageResult.setPageCount(10);
		pageResult.setCurrentPage(3);
		pageResult.setTotalCount(97);
		pageResult.setCallbackURL("www.baidu.com");

		Map params = new HashMap<String, Object>();
		params.put("entId", 432);
		params.put("prdId", "43");
		// params.put("author", "sunyiwei");

		pageResult.setParams(params);

		// 设置dataModel
		Map mainParams = new HashMap<String, Object>();
		mainParams.put("pageResult", pageResult);

		Template template = configuration.getTemplate("index.ftl");
		Writer writer = new OutputStreamWriter(new FileOutputStream(
				"C:\\Users\\Lenovo\\Desktop\\out.html"));
		template.process(mainParams, writer);

		System.out.println("OK");
	}

	private static void testIndex() throws IOException, TemplateException {

	}
}
