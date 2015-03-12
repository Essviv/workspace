package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandler extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		Throwable exception=
				(Throwable)req.getAttribute("javax.servlet.error.exception");
		
		Integer statusCode=
				(Integer) req.getAttribute("javax.servlet.error.status_code");
		
		String szServletNameString=
				(String)req.getAttribute("javax.servlet.error.servlet_name");
		
		String szRequestURI=
				(String)req.getAttribute("javax.servlet.error.request_uri");
		
		resp.setContentType("text/html");
		
		String szTitle="Error/Exception Information";
		String szDocType="<!DOCTYPE html public \"-//w3c//dtd html 4.0 transitional//en\">";
		PrintWriter pWriter=resp.getWriter();
		pWriter.println(szDocType);
		pWriter.println("<html>");
		pWriter.println("<head>");
		pWriter.println("<title bgcolor=#F00>");
		pWriter.println(szTitle);
		pWriter.println("</title>");
		pWriter.println("</head>");
		pWriter.println("<body>");
		pWriter.println("Status Code: " + statusCode + "<br />");
		pWriter.println("Servlet Name: " + szServletNameString + "<br />");
		pWriter.println("Request URI: " + szRequestURI + "<br />");
		pWriter.println("</body>");
		pWriter.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req, resp);
	}
}
