/**
 * @Title: 	HelloWorld.java 
 * @Package com.cmcc.sunyiwei.springframework 
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午7:18:30 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.springframework;


/** 
 * @ClassName:	HelloWorld 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午7:18:30 
 *  
 */
public class HelloWorld {
	private String name;

	public String getName() {
		System.out.println("GetName: " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init(){
		System.out.println("initializing helloWorld...");
	}
	
	public void after(){
		System.out.println("destructing helloWorld...");
	}
}
