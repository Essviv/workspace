/**
 * @Title: 	BeanBindToSession.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 下午7:48:39 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/** 
 * @ClassName:	BeanBindToSession 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月16日 下午7:48:39 
 *  
 */
public class BeanBindToSession implements HttpSessionBindingListener{
	private String szName;

	public BeanBindToSession(String name){
		szName = name;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println(szName + ": " + "I'm bind to session...");
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println(szName + ": " +"I'm unbind to session...");
	}

	public String getSzName() {
		return szName;
	}

	public void setSzName(String szName) {
		this.szName = szName;
	}
	
	
}
