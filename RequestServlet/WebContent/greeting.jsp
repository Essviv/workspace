<%@ page language="java" import="java.util.*" 
	contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    
<%
	Locale locale=request.getLocale();
	Calendar calendar=Calendar.getInstance(locale);
	int nHour=calendar.get(Calendar.HOUR_OF_DAY);
	
	String szGreeting="";
	if(nHour<=6)
		szGreeting="Áè³¿ºÃ£¬Äú¸ÃË¯¾õÁË¡£";
	else if(nHour<=9)
		szGreeting="ÔçÉÏºÃ£¬Äú¸Ã³ÔÒ©ÁË¡£";
	else if(nHour<=12)
		szGreeting="ÉÏÎçºÃ£¬Äú¸Ã¹¤×÷ÁË¡£";
	else if(nHour<=18)
		szGreeting="ÏÂÎçºÃ£¬Äú¸ÃÏÂ°àÁË¡£";
	else if(nHour<=24)
		szGreeting="ÍíÉÏºÃ£¬Äú¸ÃÐÝÏ¢ÁË¡£";
	else
		;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>»¶Ó­Ò³Ãæ</title>
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