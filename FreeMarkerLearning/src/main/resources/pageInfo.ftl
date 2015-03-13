<table class="table table-bordered table-hover definewidth m10">
	    <tbody>
			<tr>
				<td>
					总记录数${pageResult.totalCount} 条，总页数 ${pageResult.pageCount}页，每页显示${pageResult.pageSize} 条，当前是第${pageResult.currentPage}页。
					<#if pageResult.currentPage == 1><#-- 第一页 -->
						<a href="<@getQueryString pageResult pageResult.currentPage+1 />">下一页</a>&nbsp;  
						<a href="<@getQueryString pageResult pageResult.pageCount />">最后一页</a>&nbsp;
					<#elseif pageResult.currentPage== pageResult.pageCount><#-- 最后一页 -->
						<a href="<@getQueryString pageResult pageResult.currentPage-1 />">上一页</a>&nbsp;  
						<a href="<@getQueryString pageResult 1 />">第一页</a>&nbsp;
					<#else><#-- 中间页 -->
						<a href="<@getQueryString pageResult 1 />">第一页</a>&nbsp;
						<a href="<@getQueryString pageResult pageResult.currentPage-1 />">上一页</a>&nbsp;
						<a href="<@getQueryString pageResult pageResult.currentPage+1 />">下一页</a>&nbsp;  
						<a href="<@getQueryString pageResult pageResult.pageCount />">最后一页</a>&nbsp;					
					</#if>
				</td>
				
				<td align="left" width="400">
					<form name="frmGoPage" 
							action="${pageResult.callbackURL}" 
							method="get" 
							onsubmit="return checkFrmPage(${pageResult.pageCount});">

						<#list pageResult.params?keys as key>
							<input name="${key}" value="${pageResult.params[key]}" type="hidden" />
						</#list>
							<input name="pageCount" value="2" type="hidden">	
							去第<input name="currentPage" value="${pageResult.currentPage}" style="width: 50px;" maxlength="5">页&nbsp;&nbsp;
						
							<button type="submit">跳转</button>&nbsp;&nbsp;
							<span class="hide pagenum">页数不能为空</span>
					</form>
				</td>
			</tr>
				
			<script>
				function checkFrmPage(totalPage){
					var page=$(":text[name='currentPage']").val();
					page=page.trim();
					
					var reg = new RegExp("^[1-9]+[0-9]*$");
					if(page == null || page==''){
						$(".pagenum").html('页数不能为空');
						$(".pagenum").show();
						
						return false;
					}else if(!reg.test(page)){
						$(".pagenum").html('请输入合法页数');
						$(".pagenum").show();
						
						return false;
					}else if(page>totalPage){
						$(".pagenum").html('输入数字不能大于最大页数'+totalPage);
						$(".pagenum").show();
						
						return false;
					}
					
					return true;
				}
			</script>
    </tbody>
</table>

<#-- 连接字符串,生成查询字符串 -->
<#macro getQueryString pageResult currentPageIndex>
		${pageResult.callbackURL}?currentPage=${currentPageIndex}&pageCount=${pageResult.pageCount}<#t>
		<#list pageResult.params?keys as key>
			&${key}=${pageResult.params[key]}<#t>
		</#list>
</#macro>