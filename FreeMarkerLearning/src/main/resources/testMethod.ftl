${testBean.url}
${testBean.name}
${testBean.testMethod()}

<#list map?keys as key>
		${key}: <#t>
		<#if key != "obj">
			${map[key]}<#t>
		<#else>
			${map.obj.url}&${map.obj.name}<#t>
		</#if>

</#list>
