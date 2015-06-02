/**
 * @Title: 	HelloWorld.java 
 * @Package com.cmcc.sunyiwei.pojo 
 * @author:	sunyiwei
 * @date:	2015年6月2日 上午8:25:58 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.pojo;

/** 
 * @ClassName:	HelloWorld 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年6月2日 上午8:25:58 
 *  
 */
public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "My name is: " + name;
	}
	
	
}
