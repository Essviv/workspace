/**   
 * @FileName: MyContextListener.java 
 * @Package:com.cmcc.sunyiwei 
 * @Description: TODO
 * @author: sunyiwei  
 * @date:2015年3月11日 下午11:30:17 
 * @version V1.0   
 */
package com.cmcc.sunyiwei;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName: MyContextListener 
 * @Description: TODO
 * @author: sunyiwei
 * @date:2015年3月11日 下午11:30:17 
 */
public class MyContextListener implements ServletContextListener {

	/* 
	 * @param arg0 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent) 
	 */  
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Servlet context is destroyed...");
	}

	/* 
	 * @param arg0 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent) 
	 */  
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext context = arg0.getServletContext();
		String name = context.getInitParameter("name");
		String email = context.getInitParameter("email");
		
		Author author = new Author();
		author.setName(name);
		author.setEmail(email);
		
		context.setAttribute("author", author);
	}

}
