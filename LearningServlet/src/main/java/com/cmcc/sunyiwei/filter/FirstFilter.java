/**
 * @Title: 	FirstFilter.java 
 * @Package com.cmcc.sunyiwei.filter 
 * @author:	sunyiwei
 * @date:	2015年3月31日 上午8:53:31 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 
 * @ClassName:	FirstFilter 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月31日 上午8:53:31 
 *  
 */
public class FirstFilter implements Filter {

	/** 
	 * @Title: init 
	 * @Description: TODO
	 * @param filterConfig
	 * @throws ServletException 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig) 
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("First filter init...");
	}

	/** 
	 * @Title: doFilter 
	 * @Description: TODO
	 * @param request
	 * @param response
	 * @param chain
	 * @throws IOException
	 * @throws ServletException 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) 
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("First filter doFilter...");
		chain.doFilter(request, response);
		System.out.println("First filter doFilter after chain");
	}

	/** 
	 * @Title: destroy 
	 * @Description: TODO 
	 * @see javax.servlet.Filter#destroy() 
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("First filter destory...");
	}

}
