package com.cmcc.sunyiwei;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		resp.setContentType("text/html");
		
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter pWriter=resp.getWriter();
		pWriter.println("<html>");
		pWriter.println("<body>");
		pWriter.println("Hello world!");
		pWriter.println(req.getSession());
		
		Enumeration<String> names=req.getHeaderNames();
		while(names.hasMoreElements())
		{
			pWriter.println("<p>");
			String szNameString=names.nextElement();
			pWriter.print("<b>" + szNameString + ": " + "</b>");
			pWriter.print(req.getHeader(szNameString));
			pWriter.println("</p>");
		}
		
		pWriter.println("<br />");
		
		Enumeration<String>paramsEnumeration=req.getParameterNames();
		while(paramsEnumeration.hasMoreElements())
		{
			pWriter.println("<p>");
			String szNameString=paramsEnumeration.nextElement();
			pWriter.print("<b>" + szNameString + ": " + "</b>");
			pWriter.print(req.getParameter(szNameString));
			pWriter.println("</p>");
		}
		
		pWriter.println("</body>");
		pWriter.println("</html>");
		pWriter.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	}
}
