<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"    
%>
    
<%!
	//����ȫ�ֱ���
	private String sayHello()
	{
		return "Hello world!";
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>��ʾ</title>
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
		
	//	out.println(nNum + "�Ľ׳�Ϊ:" + nCount);
	%>
	
	<%-- 
		����ע�Ͳ���
		���Զ���ע��
	--%>
	<%= nNum %> �Ľ׳�Ϊ: <%= nCount %>
	<br />
	
	<%= sayHello() %>
</body>
</html>