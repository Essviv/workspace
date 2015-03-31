<html>

	<body>
		<table>
			<#list users as user>
				<tr>
					<#include "bean.ftl">
				</tr>
			</#list>
		</table>
	</body>

</html>