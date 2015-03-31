/**
 * @Title: 	IRowContentProvider.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午4:05:51 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;


/** 
 * @ClassName:	IContentProvider 
 * @Description:  行内容提供接口
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午4:05:51 
 *  
 */
public interface IContentProvider<T> {
	/**
	 * 
	* @Title:getHeaderText 
	* @Description: 得到表头数据
	* @param t
	* @return
	* @throws
	* @author:	sunyiwei
	 */
	public String getHeader();
	
	/**
	 * 
	* @Title:getRowString 
	* @Description: 根据传入的模型数据，生成行数据
	* @param t
	* @return
	* @throws
	* @author:	sunyiwei
	 */
	public String getRow(T t);
}
