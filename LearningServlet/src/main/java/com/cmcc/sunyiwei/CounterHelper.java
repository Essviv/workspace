/**
 * @Title: 	CounterHelper.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月17日 下午6:35:00 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/** 
 * @ClassName:	CounterHelper 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月17日 下午6:35:00 
 *  
 */
public class CounterHelper {
	private static int count = 0;
	
	public static int getCount(){
		return ++count;
	}
}
