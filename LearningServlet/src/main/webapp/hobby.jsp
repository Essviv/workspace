<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The friends who share your hobby of <%= request.getAttribute("hobby") %> are:<br />
	<%
		List<String> szNames =(List<String>) request.getAttribute("friendNames");
		for(String szName : szNames){
			out.println(szName + "<br />");
		}
	%>
	
	<%!
		public void jspInit(){
		ServletContext context = getServletContext();
		context.setAttribute("attributeWithinContext", "Attribute set within context");
	}
	%>
	
	<%= "<br />" + application.getAttribute("attributeWithinContext") %>
</body>
</html>