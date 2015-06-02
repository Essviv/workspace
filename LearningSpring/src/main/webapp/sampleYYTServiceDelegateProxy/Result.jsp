<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleYYTServiceDelegateProxyid" scope="session" class="com.jthb.ws.YYTServiceDelegateProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleYYTServiceDelegateProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleYYTServiceDelegateProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleYYTServiceDelegateProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.jthb.ws.YYTServiceDelegate getYYTServiceDelegate10mtemp = sampleYYTServiceDelegateProxyid.getYYTServiceDelegate();
if(getYYTServiceDelegate10mtemp == null){
%>
<%=getYYTServiceDelegate10mtemp %>
<%
}else{
        if(getYYTServiceDelegate10mtemp!= null){
        String tempreturnp11 = getYYTServiceDelegate10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg016");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        java.lang.String gettoken13mtemp = sampleYYTServiceDelegateProxyid.gettoken(arg0_1idTemp);
if(gettoken13mtemp == null){
%>
<%=gettoken13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(gettoken13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        java.lang.String getchecktoken18mtemp = sampleYYTServiceDelegateProxyid.getchecktoken(arg0_2idTemp);
if(getchecktoken18mtemp == null){
%>
<%=getchecktoken18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getchecktoken18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>