/**   
 * @FileName: TestRequestListener.java 
 * @Package:com.cmcc.sunyiwei 
 * @Description: TODO
 * @author: sunyiwei  
 * @date:2015��3��12�� ����9:47:24 
 * @version V1.0   
 */
package com.cmcc.sunyiwei.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @ClassName: TestRequestListener 
 * @Description: TODO
 * @author: sunyiwei
 * @date:2015��3��12�� ����9:47:24 
 */
public class TestRequestListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		
	}

	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("Request comes...");
	}

}
