<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	Name: ${pageScope.my} <br />
	Name: ${my}<br />
	Name: ${param.my}<br />
	Name: ${requestScope.my}<br />
	Email: ${param.email }<br />
	Hobby: ${paramValues.hobby[0] }<br />
	Hobby: ${paramValues.hobby[1] }<br />
	
	<%-- <my:header visitor="patrick"/> --%>
	<%-- <jsp:include page="header.jsp">
		<jsp:param value="sunyiwei" name="userName"/>
		<jsp:param value="sunyiwei@chinamobile.com" name="email" />
	</jsp:include> --%>
	<%-- <my:header>
		这个是出现在body中的内容，可以使用&lt;jsp:doCopy /&gt;来插入到相应的地方
	</my:header> --%>
	
	<%-- <my:header author="sunyiwei">
		这是不能出现的body
	</my:header> --%>
	
	<table border="1">
	
	<jsp:include page="header.jsp" />
	
	</table>
</body>
</html>