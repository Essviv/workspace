<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body><br />
	<jsp:useBean id="person" 
		class="com.cmcc.sunyiwei.Person"
		scope="page" />
		
	<jsp:setProperty name="person" property="*" />
	
<div align="center">
	<form action="method.jsp" method="get">
		<fieldset style='width: 300'>
			<legend>你填写的个人信息</legend>
			<table align="center" width="400px">
				<tr>
					<td align="right" style="font-weight:bold;">姓名:</td>
					<td>
						<jsp:getProperty name="person" property="name" />
					</td>
				</tr>
				
				<tr>
					<td align="right" style="font-weight:bold;">年龄:</td>
					<td>
						<jsp:getProperty name="person" property="age" />
					</td>
				</tr>
				
				<tr>
					<td align="right" style="font-weight:bold;">性别:</td>
					<td>
						<jsp:getProperty name="person" property="sex" />
					</td>
				</tr>
				
				<tr>
					<td align="right" style="font-weight:bold;"></td>
					<td>
						<input type="button" onclick="history.go(-1)" 
							value="返回" class="button">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</div>
</body>
</html>