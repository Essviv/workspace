/**
 * @Title: 	PatialMockClassUnderTest.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:17:15 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/** 
 * @ClassName:	PatialMockClassUnderTest 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:17:15 
 *  
 */
public class PartialMockClassUnderTest {
	public void execute(){
		sayHello();
		sayWorld();
	}
	
	public void sayHello(){
		System.out.println("Hello ");
	}
	
	/**
	 * 
	* @Title:sayWorld 
	* @Description: 这里准备把这个方法mock掉，以便测试execute方法
	* @throws
	* @author:	sunyiwei
	 */
	public void sayWorld(){
		System.out.println("world!");
	}
}
