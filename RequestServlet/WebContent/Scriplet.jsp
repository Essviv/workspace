<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"    
%>
    
<%!
	//ÕâÊÇÈ«¾Ö±äÁ¿
	private String sayHello()
	{
		return "Hello world!";
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ÑÝÊ¾</title>
</head>
<body>
	<%
		int nNum=10;
		int nCount=1;
		
		int nLoop=nNum;
		while(nLoop>1)
		{
			nCount*=nLoop--;
		}
		
	//	out.println(nNum + "µÄ½×³ËÎª:" + nCount);
	%>
	
	<%-- 
		ÕâÊÇ×¢ÊÍ²âÊÔ
		¿ÉÒÔ¶àÐÐ×¢ÊÍ
	--%>
	<%= nNum %> µÄ½×³ËÎª: <%= nCount %>
	<br />
	
	<%= sayHello() %>
</body>
</html>