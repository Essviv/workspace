/**
 * @Title: 	PageResult.java 
 * @Package com.cmcc.vrp.util 
 * @author:	sunyiwei
 * @date:	2015年3月12日 上午9:41:30 
 * @version	V1.0   
 */
package com.cmcc.vrp.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName:	PageResult 
 * @Description:  页面分页类
 * @author:	sunyiwei
 * @date:	2015年3月12日 上午9:41:30 
 *  
 */
public class PageResult implements Serializable {
	private static final long serialVersionUID = 14722321653620721L; 
	
	/**
	 * 当前页
	 */
    private int currentPage = 1;
    
    /**
     * 每页显示的最大数量 
     */
    private int pageSize = 10;
    
    /**
     * 总页数
     */
    private int pageCount = 0;
    
    /**
     * 记录总数
     */
    private int totalCount = 0;
    
    /**
     * 页面参数， 用于生成queryString
     */
    private Map<String, String> params = new HashMap<String, String>();
    
    /**
     * 回调地址
     */
    private String callbackURL;

    
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int nTotalCount) {
		this.totalCount = nTotalCount;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public String getCallbackURL() {
		return callbackURL;
	}

	public void setCallbackURL(String callbackURL) {
		this.callbackURL = callbackURL;
	}
    
    
    
}
