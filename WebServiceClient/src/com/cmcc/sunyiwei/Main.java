/**
 * @Title: 	Main.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年5月22日 上午8:36:22 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/** 
 * @ClassName:	Main 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年5月22日 上午8:36:22 
 *  
 */
public class Main {
	public static void main(String[] args) {
		CalculateServiceProxy csp = new CalculateServiceProxy("http://localhost:8080/WebService/services/CalculateService");

		try {

		System.out.println(csp.add(100, 23));

		} catch (Exception e) {

		// TODO: handle exception

		}
	}
}
