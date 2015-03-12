<%@ page language="java" import="java.util.*" 
	contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    
<%
	Locale locale=request.getLocale();
	Calendar calendar=Calendar.getInstance(locale);
	int nHour=calendar.get(Calendar.HOUR_OF_DAY);
	
	String szGreeting="";
	if(nHour<=6)
		szGreeting="凌晨好，您该睡觉了。";
	else if(nHour<=9)
		szGreeting="早上好，您该吃药了。";
	else if(nHour<=12)
		szGreeting="上午好，您该工作了。";
	else if(nHour<=18)
		szGreeting="下午好，您该下班了。";
	else if(nHour<=24)
		szGreeting="晚上好，您该休息了。";
	else
		;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>欢迎页面</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<%= szGreeting %>
			</td>
		</tr>
	</table>
</body>
</html>