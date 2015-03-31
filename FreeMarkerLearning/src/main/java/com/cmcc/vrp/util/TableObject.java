/**
 * @Title: 	TableListObject.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 上午9:30:52 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/** 
 * @ClassName:	TableListObject 
 * @Description:  通用列表显示模板
 * @author:	sunyiwei
 * @date:	2015年3月20日 上午9:30:52 
 *  
 */
public class TableObject<T> {
	/**
	 * 要显示的数据
	 */
	private List<T> listData = null;
	
	/**
	 * 对于每一个数据，根据特定的规则显示成一行
	 */
	private IContentProvider<T> contentProvider = null;


	public TableObject(List<T> data, IContentProvider<T> contentProvider){
		this.listData = data;
		this.contentProvider = contentProvider;
	}
	
	public List<T> getListData() {
		return listData;
	}
	public void setListData(List<T> listData) {
		this.listData = listData;
	}
	public IContentProvider<T> getContentProvider() {
		return contentProvider;
	}
	public void setContentProvider(IContentProvider<T> contentProvider) {
		this.contentProvider = contentProvider;
	}
	
	
}

