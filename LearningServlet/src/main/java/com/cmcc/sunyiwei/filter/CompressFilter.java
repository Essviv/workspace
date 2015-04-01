package com.cmcc.sunyiwei.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmcc.sunyiwei.CompressResponse;

public class CompressFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Compress filter init...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Compress filter doFilter...");

		HttpServletRequest request2 = (HttpServletRequest) request;
		if (request2.getHeader("Accept-Encoding").indexOf("gzip") > -1) {
			CompressResponse compressResponse = new CompressResponse(
					(HttpServletResponse) response);

			((HttpServletResponse) response).setHeader("Content-Encoding",
					"gzip");
			chain.doFilter(request, compressResponse);
			compressResponse.getCompressOutputStream().finish();
		} else {
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Compress filter destroy...");
	}

}
