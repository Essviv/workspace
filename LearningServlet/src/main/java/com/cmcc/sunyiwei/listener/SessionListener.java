/**
 * @Title: 	Sessionlistener.java 
 * @Package com.cmcc.sunyiwei.listener 
 * @author:	sunyiwei
 * @date:	2015年3月30日 下午8:17:47 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/** 
 * @ClassName:	Sessionlistener 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月30日 下午8:17:47 
 *  
 */
public class SessionListener implements HttpSessionListener{

	/** 
	 * @Title: sessionCreated 
	 * @Description: TODO
	 * @param se 
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent) 
	 */
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session created...");
	}

	/** 
	 * @Title: sessionDestroyed 
	 * @Description: TODO
	 * @param se 
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent) 
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session destroyed...");
	}

}
