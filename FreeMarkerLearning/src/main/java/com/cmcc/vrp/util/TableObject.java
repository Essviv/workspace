/**
 * @Title: 	TableListObject.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 上午9:30:52 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

import java.util.ArrayList;
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
	private List<T> dataList = new ArrayList<T>();
	
	/**
	 * 显示的表头名称
	 */
	private List<String> headerTextList = new ArrayList<String>();
	
	/**
	 * 对于每一个数据，根据特定的规则显示成一行
	 */
	private RowContentProvider<T> rowContentProvider = null;
	
	public List<String> getHeaderTextList() {
		return headerTextList;
	}
	public void setHeaderTextList(List<String> headerTextList) {
		this.headerTextList = headerTextList;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	public RowContentProvider<T> getRowContentProvider() {
		return rowContentProvider;
	}
	public void setRowContentProvider(RowContentProvider<T> contentProvider) {
		this.rowContentProvider = contentProvider;
	}
}

