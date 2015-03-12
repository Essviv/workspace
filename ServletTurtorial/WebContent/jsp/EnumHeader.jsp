<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enumeration header</title>
</head>
<body>
	<h2>Example</h2>
	<table width="90%" border="1" align="center">
		<tr bgcolor="#949494">
			<th>Header Name</th>
			<th>Header Value</th>
		</tr>
		
		<%
			Enumeration<String> szNames=request.getHeaderNames();
			while(szNames.hasMoreElements())
			{
				String szName=szNames.nextElement();
				
				out.println("<tr>");
				out.println("<td>");
				out.println(szName);
				out.println("</td>");
				/* out.println("</tr>");
				
				out.println("<tr>"); */
				out.println("<td>");
				out.println(request.getHeader(szName));
				out.println("</td>");
				out.println("</tr>");
			}
			
			out.println("<br />");
			Enumeration<String> szParams=request.getParameterNames();
			while(szParams.hasMoreElements())
			{
				String szName=szParams.nextElement();
				
				out.println("<tr>");
				out.println("<td>");
				out.println(szName);
				out.println("</td>");
				/* out.println("</tr>");
				
				out.println("<tr>"); */
				out.println("<td>");
				out.println(request.getParameter(szName));
				out.println("</td>");
				out.println("</tr>");
			}
		%>
	</table>
</body>
</html>