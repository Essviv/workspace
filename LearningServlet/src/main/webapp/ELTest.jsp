<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>名字</th>
			<th>邮箱</th>
			<th>兴趣</th>
		</tr>
		
		<tr>
			<td>${param.name }</td>
			<td>${param.email }</td>
			<td>${paramValues.hobby[0] }&nbsp;&nbsp;${paramValues.hobby[1] }</td>
			<td>${nonExist }</td>
			<td>${8 + nonExist }</td>
			<td>${8 - nonExist }</td>
			<td>${8 * nonExist }</td>
			<td>${8 / nonExist }</td>
			<td>${true && nonExist }</td>
			<td>${true ||  nonExist }</td>
			<td>${!nonExist }</td>
			<%-- <td>${8 % nonExist }</td> --%>
		</tr>
	</table>
</body>
</html>