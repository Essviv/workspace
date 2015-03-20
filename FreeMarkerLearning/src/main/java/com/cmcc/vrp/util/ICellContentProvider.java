/**
 * @Title: 	ICellContentProvider.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午2:49:02 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

/** 
 * @ClassName:	ICellContentProvider 
 * @Description:  单元内容提供者
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午2:49:02 
 *  
 */
public interface ICellContentProvider<T>{
	public String getString(T t);
}
