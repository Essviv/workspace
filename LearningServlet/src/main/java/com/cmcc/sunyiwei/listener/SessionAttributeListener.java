/**
 * @Title: 	SessionAttributeListener.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 下午7:50:14 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/** 
 * @ClassName:	SessionAttributeListener 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月16日 下午7:50:14 
 *  
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {

	/** 
	 * @Title: attributeAdded 
	 * @Description: TODO
	 * @param se 
	 * @see javax.servlet.http.HttpSessionAttributeListener#attributeAdded(javax.servlet.http.HttpSessionBindingEvent) 
	 */
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println(se.getName() + ": This attribute is bind to session..." );
	}

	/** 
	 * @Title: attributeRemoved 
	 * @Description: TODO
	 * @param se 
	 * @see javax.servlet.http.HttpSessionAttributeListener#attributeRemoved(javax.servlet.http.HttpSessionBindingEvent) 
	 */
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println(se.getName() + ": This attribute is removed from session...");
	}

	/** 
	 * @Title: attributeReplaced 
	 * @Description: TODO
	 * @param se 
	 * @see javax.servlet.http.HttpSessionAttributeListener#attributeReplaced(javax.servlet.http.HttpSessionBindingEvent) 
	 */
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println(se.getName() + ": This attribute is replaced within session");
	}

}
