<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui-1.8.18.custom.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/JScript.js"></script>

<script type="text/javascript">
	function validateUser() {
		var userName = $("#username").val();
		if (userName == "") {
			alert("用户姓名不能为空!");
			return false;
		}

		var age = $("#age").val();
		if (age == "") {
			alert("年龄不能为空!");
			return false;
		} else {
			if ($valid($("#age"), "正整数", false, "年龄:") == false) {
				return false;
			}
		}

		return true;
	}
	
	

</script>

</head>
<body>
	<form id="editForm" onsubmit="return validateUser();"
	action="<%=request.getContextPath()%>/user/editUser.action" method="post" >
		<table>
			<tr>
				<td>姓名:</td>
				<td><input type="text" id="username" name="username"
					value="${uEntity.username }"></td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type="text" id="age" name="age"
					value="${uEntity.age }"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="保存"> <input
					type="hidden" name="userid" value="${uEntity.userid}"></td>
			</tr>
		</table>
	</form>
</body>
</html>