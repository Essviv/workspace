<html>
	<head>
		<meta charset="utf-8" />
	</head>
	
	<body>
		<table>
			<tr>
				<#list heads?keys as key>
					<th>${heads[key]}</th><#rt>
				</#list>
			</tr>
	
			<#list beans as bean>
				<tr>
				<#--
					<#list heads?keys as key>
						<td>${bean[key]}</td><#rt>	
					
					</#list>
				-->
				<td>${bean.getName()}</td>
				<td>${bean.getUrl()}</td><#rt>
				</tr>
			</#list>
		</table>
	</body>
</html>