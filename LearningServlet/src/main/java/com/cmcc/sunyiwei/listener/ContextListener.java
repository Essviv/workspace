/**
 * @Title: 	ContextListener.java 
 * @Package com.cmcc.sunyiwei.listener 
 * @author:	sunyiwei
 * @date:	2015年3月30日 下午8:06:08 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/** 
 * @ClassName:	ContextListener 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月30日 下午8:06:08 
 *  
 */
public class ContextListener implements ServletContextListener {

	/** 
	 * @Title: contextInitialized 
	 * @Description: TODO
	 * @param sce 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent) 
	 */
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context initialized...");
	}

	/** 
	 * @Title: contextDestroyed 
	 * @Description: TODO
	 * @param sce 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent) 
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context destroyed...");
	}

}
