<%-- <%@ attribute name="visitor" required="true" rtexprvalue="true" %>
<h1>hello ${visitor }, welcome to my website!</h1> --%>


<%-- <h1>
	<jsp:doBody />
</h1> --%>

<%@ tag body-content = "empty" %>
<%@ attribute name="author" required = "true" rtexprvalue="true" %>

<h1>good evening, ${author }</h1>