<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/RoleServlet" method="get">
	<table>
		<tr>
			<td>用户姓名:</td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td>登陆名:</td>
			<td><input type="text" name="loginName"></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="保存"></td>
		</tr>
	</table>
</form>
</body>
</html>