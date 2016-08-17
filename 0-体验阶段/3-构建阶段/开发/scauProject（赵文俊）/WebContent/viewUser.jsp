<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>

<script type="text/javascript" src="js/JScript.js"></script>


</head>
<body>

	<table>
		<tr>
			<td>姓名:</td>
			<td>${uEntity.username }</td>
		</tr>
		<tr>
			<td>年龄:</td>
			<td>${uEntity.age }</td>
		</tr>
		<tr>
			<td>密码:</td>
			<td>${uEntity.password }</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button" onclick="window.location.href='<%=request.getContextPath() %>/user/queryUser.action'"
				value="返回"></td>
		</tr>
	</table>
</body>
</html>