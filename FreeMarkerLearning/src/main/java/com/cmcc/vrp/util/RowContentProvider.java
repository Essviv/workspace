/**
 * @Title: 	RowContentProvider.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月20日 下午2:16:01 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: RowContentProvider
 * @Description: 行内容提供者
 * @author: sunyiwei
 * @date: 2015年3月20日 下午2:16:01
 * 
 */
public class RowContentProvider<T> {
	private List<ICellContentProvider<T>> cellContentProviders = new ArrayList<ICellContentProvider<T>>();

	public String getString(T t) {
		StringBuilder stringBuilder = new StringBuilder();
		for (ICellContentProvider<T> cellContentProvider : cellContentProviders) {
			stringBuilder.append("<td>" + cellContentProvider.getString(t)+ "</td>");
		}

		return stringBuilder.toString();
	}

	public List<ICellContentProvider<T>> getColumnContentProviders() {
		return cellContentProviders;
	}

	public void setColumnContentProviders(
			List<ICellContentProvider<T>> cellContentProviders) {
		this.cellContentProviders = cellContentProviders;
	}
}
