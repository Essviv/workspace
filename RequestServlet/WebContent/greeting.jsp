<%@ page language="java" import="java.util.*" 
	contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    
<%
	Locale locale=request.getLocale();
	Calendar calendar=Calendar.getInstance(locale);
	int nHour=calendar.get(Calendar.HOUR_OF_DAY);
	
	String szGreeting="";
	if(nHour<=6)
		szGreeting="�賿�ã�����˯���ˡ�";
	else if(nHour<=9)
		szGreeting="���Ϻã����ó�ҩ�ˡ�";
	else if(nHour<=12)
		szGreeting="����ã����ù����ˡ�";
	else if(nHour<=18)
		szGreeting="����ã������°��ˡ�";
	else if(nHour<=24)
		szGreeting="���Ϻã�������Ϣ�ˡ�";
	else
		;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>��ӭҳ��</title>
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