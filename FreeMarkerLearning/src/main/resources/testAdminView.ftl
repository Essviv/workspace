<!DOCTYPE html>
<html>
<head>
	<title>管理员查询</title>
	<meta charset="UTF-8">
</head>

<body>
	<form class="form-inline definewidth m20" id="table_validate"
			action="<%=request.getContextPath()%>/manage/userManagerController/index.html" method="POST">
		用户名称：
		<input type="text" 
				name="userName" 
				id="userName"
				class="abc input-default" 
				placeholder="" 
				value="${userName }"
				maxlength="64">&nbsp;&nbsp;  
    	<button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp;
    	
		<button type="button" 
				class="btn btn-success" 
				id="addnew"
				href = "<%=request.getContextPath()%>/manage/userManagerController/add.html">
			新增用户
		</button>&nbsp;&nbsp;
		<span class='empty hide'>查询字符串长度不能超过64</span>
	</form>
	
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>用户名称</th>
				<th>手机号码</th>
				<th>电子邮箱</th>
				<th>用户身份</th>
				<th>操作</th>
			</tr>
		<thead />
		
		<#list admins as admin>
			<tr>
				<td>${admin.userName}</td>
				<td>${admin.mobilePhone}</td>
				<td>${admin.email}</td>
				<td>
					${admin.getTypeName()}
				</td>
					
				<td>
					<a href="<%=request.getContextPath()%>/manage/userManagerController/delete.html?id=${admin.id}&userName=${userName}&currentPage=${pageResult.currentPage}&pageCount=${pageResult.pageCount }">
						删除
					</a>&nbsp;&nbsp;
					
					<a href="<%=request.getContextPath()%>/manage/userManagerController/delete.html?id=${admin.id}&userName=${userName}&currentPage=${pageResult.currentPage}&pageCount=${pageResult.pageCount }">
						编辑	
					</a>
				</td>
			</tr>
		</#list>
	</table>
		
    <#include "pageInfo.ftl">
</body>
</html>