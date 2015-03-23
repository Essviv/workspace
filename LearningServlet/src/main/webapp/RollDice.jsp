<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="com.cmcc.sunyiwei" prefix="myFunction" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	Number: ${myFunction: roll() }
	<%-- <%@ include file="footer.jsp" %> --%>
	<jsp:include page="footer.jsp">
		<jsp:param name="author" value="sunyiwei"/>
		<jsp:param name="organization" value="CMCC"/>
	</jsp:include>
</body>
</html>