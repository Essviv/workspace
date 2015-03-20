<#-- 从Map对象生成queryString, 生成的queryString以“?”开始 -->
<#macro mapToQueryString mapObject>
	?<#t>
	<#list mapObject?keys as key>
		${key}=${mapObject[key]}<#if key_has_next>&</#if><#t>
	</#list>
</#macro>

<#-- 利用hrefObject生成<a>对象 -->
<#macro getHref hrefObject>
	<a href="${hrefObject.callback}<@mapToQueryString hrefObject.queryCriteria />">${hrefObject.text}</a>
</#macro>

<#-- 根据表格对象生成表格 -->
<#macro getTable tableObject>
	<table border="1">
		<@getTableHeader tableObject.headerTextList />
		<@getContentBody tableObject.dataList tableObject.rowContentProvider />
	</table>
</#macro>


<#-- 利用List生成表头信息 -->
<#macro getTableHeader headerList>
	<thead>
		<tr>
			<#list headerList as header>
					<th>${header}</th>
			</#list>
		<tr>
	</thead>
</#macro>

<#-- 得到表格体内容 -->
<#macro getContentBody dataList contentProvider>
	<#list dataList as data>
		<tr>
			${contentProvider.getString(data)}
		</tr><br />
	</#list>
</#macro>