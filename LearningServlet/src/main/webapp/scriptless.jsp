<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 当useBean在搜索域里没有找到相应的bean时，会自动创建 --%>
	<%-- <jsp:useBean id="author" class="com.cmcc.sunyiwei.Author" scope="request">
		<jsp:setProperty name="author" value="sunyiwei" property="name" />
	</jsp:useBean>
	
	<jsp:getProperty property="name" name="author"/> --%>
	
	<%-- class和type至少要有一个 --%>
	<%-- 只有class时，这个类必须是可实例化的 --%>
	<%--Error: <jsp:useBean id="person" class="com.cmcc.sunyiwei.Person"> --%>
	<jsp:useBean id="author" class="com.cmcc.sunyiwei.Author">
		<jsp:setProperty name="author" value="sunyiwei" property="name" />
	</jsp:useBean>
	
	<jsp:getProperty name="author" property="name" />
	
	<%-- 只有type时，这个对象必须已经存在，即不能为新创建对象 --%>
	<%-- <jsp:useBean id="person" type="com.cmcc.sunyiwei.Person" scope="request">
		Error: 这行代码永远不会执行
		<jsp:setProperty name="person" property="gender" value="whatever" />
	</jsp:useBean><br />
	Person: <jsp:getProperty name="person" property="gender" /><br /> --%>
	
	<%-- class和type都指定的时候，class用来指定object class， type用来指定reference type --%>
	<jsp:useBean id="anotherPerson" type="com.cmcc.sunyiwei.Person"
		class="com.cmcc.sunyiwei.Author">
		<jsp:setProperty name="anotherPerson" property="gender" value="female" />
		<jsp:setProperty name="anotherPerson" property="name" value="lisa" />
	</jsp:useBean>
	
	AnotherPerson: <jsp:getProperty name="anotherPerson" property="name" /><br />
	AnotherPerson: <jsp:getProperty name="anotherPerson" property="gender" /><br />
	
	<%-- setProperty可以通过value或者param来指定 --%>
	<%-- <jsp:setProperty name="anotherPerson" property="name" value="whatever" /> --%>
	<%-- <jsp:setProperty name="anotherPerson" property="name" param="nameFromHtml" /> --%>
	
	<%-- 如果是直接从html跳转到jsp的，还可以通过自动匹配参数（前提是name必须一致) --%>
	<jsp:setProperty name="anotherPerson" property="name"/>
	AnotherPerson: <jsp:getProperty name="anotherPerson" property="name" />
</body>
</html>