/**
 * @Title: 	HelloService.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年5月20日 上午8:52:39 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年5月20日 上午8:52:39
 * 
 */

@WebService
public class HelloService {
	@WebMethod
	public String sayHello(String name, int age) {
		return "hello " + name + ", you are " + age + "years old.";
	}

//	@WebMethod
//	public List<Integer> sayHelloToPerson(TestObject to) {
//		return new ArrayList<Integer>() ;
//	}
}
