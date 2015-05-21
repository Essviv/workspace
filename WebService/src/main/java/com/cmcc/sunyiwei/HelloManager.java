/**
 * @Title: 	HelloManager.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年5月20日 上午8:52:39 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ClassName: HelloManager
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年5月20日 上午8:52:39
 * 
 */

@WebService
public class HelloManager {
	@WebMethod
	public String sayHello(String name, int age) {
		return "hello " + name + ", you are " + age + "years old.";
	}

	@WebMethod
	public List<Integer> sayHelloToPerson(TestObject to) {
		return new ArrayList<Integer>() ;
	}
}
