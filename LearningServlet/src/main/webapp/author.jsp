<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Author: <%= request.getAttribute("author") %> --%>
	<jsp:useBean id="author" 
				class="com.cmcc.sunyiwei.Author"
				scope="request">
		<jsp:setProperty property="*" name="author"/>
	</jsp:useBean>
	
	Name: <jsp:getProperty property="name" name="author"/><br />
	Email: <jsp:getProperty property="email" name="author"/>
</body>
</html>