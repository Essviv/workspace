/**
 * @Title: 	SecondFilter.java 
 * @Package com.cmcc.sunyiwei.filter 
 * @author:	sunyiwei
 * @date:	2015年3月31日 上午8:54:26 
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
 * @ClassName:	SecondFilter 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月31日 上午8:54:26 
 *  
 */
public class SecondFilter implements Filter {

	/** 
	 * @Title: init 
	 * @Description: TODO
	 * @param filterConfig
	 * @throws ServletException 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig) 
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Second filter init...");
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
		System.out.println("Second filter doFilter...");
		chain.doFilter(request, response);
		System.out.println("Second filter doFilter after chain");
	}

	/** 
	 * @Title: destroy 
	 * @Description: TODO 
	 * @see javax.servlet.Filter#destroy() 
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Second filter destory...");
	}

}
