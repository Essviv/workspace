package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

public class IPFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String ipAddresString=arg0.getRemoteAddr();
		System.out.println("IP: " + ipAddresString);
		System.out.println("Agent: " + arg0.getContentType());
		System.out.println("Timd: " + new Date());
		
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		String testParamString=arg0.getInitParameter("test-param");
		System.out.println("Test param: " + testParamString);
	}
}
