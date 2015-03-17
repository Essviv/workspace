/**
 * @Title: 	EasyMockMatcherUnderTest.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:41:07 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/** 
 * @ClassName:	EasyMockMatcherUnderTest 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:41:07 
 *  
 */
public class ClassUnderTest {
	ServiceToMock service;
	
	public void operateDouble(Double dbValue){
		service.operateDouble(dbValue);
	}
	
	public void operateObject(Car car){
		service.operateCar(car);
	}
}
