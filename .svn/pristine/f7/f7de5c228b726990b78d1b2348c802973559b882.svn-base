<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/user/queryUser.action"
		method="post">
		<table>
			<tr>
				<td>姓名:<input type="text" name="uname" value="${uname}"><input
					type="submit" value="查询"></td>
				<td><a href="<%=request.getContextPath()%>/addUser.jsp">添加</a></td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>密码</td>
			<td>操作</td>
		</tr>
		<!-- EL表达式    jstl标签 -->
		<c:forEach items="${uList}" var="u">
			<tr>
				<td>${u.username }</td>
				<td>${u.age }</td>
				<td>${u.password }</td>
				<td><a
					href="<%=request.getContextPath()%>/user/loadEdit.action?userid=${u.userid}">编辑</a>
					&nbsp;&nbsp;<a
					href="<%=request.getContextPath()%>/user/viewUser.action?userid=${u.userid}">查看</a>
					&nbsp;&nbsp; <a href="javascript:deleteUser(${u.userid })">删除</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>

<script type="text/javascript" language="javascript">
	function deleteUser(id) {
		if (confirm("你确定要删除当前选择的信息吗?")) {
           window.location.href='<%=request.getContextPath()%>/user/deleteUser.action?userid='+id;
		}
	}
</script>

