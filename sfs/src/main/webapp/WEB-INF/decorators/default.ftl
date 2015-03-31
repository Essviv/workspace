[#ftl]
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property="title"/></title>
<sitemesh:write property="head"/>
</head>
<body>
<div style="margin:0 auto;width:600px;background-color:#c1c1c1;">
<div style="width:600px;height:100px;background-color:#ccc;float:left;">
	<h3>Showing a demo!一个演示！name=${name}</h3>
</div>
<div style="width:200px;height:500px;float:left;background-color:#fe00df;">
	[#include "left.ftl"]
</div>
<div style="width:398px;float:left;border:1px solid #fefefe;">
<sitemesh:write property="body"/>
</div>
</div>
</body>
</html>