<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="common/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui-1.8.18.custom.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/JScript.js"></script>

<script type="text/javascript">
	function validateUser() {
		var userName = document.getElementById("username").value;
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
	<!--核心显示区-->
	<section id='content'>
	<div class='container-fluid'>
		<div class='row-fluid' id='content-wrapper'>
			<!--第一部分-->
			<div class='row-fluid'>
				<div class='span12'>
					<div class='page-header'>
						<h1 class='pull-left'>
							<i class='icon-edit'></i> <span>用户管理</span>
						</h1>
					</div>
				</div>
			</div>

			<!--页面内标签-->
			<div class='row-fluid'>
				<div class='span12 box' style='margin-bottom: 0'>
					<div class='box-header blue-background'>
						<div class='title'>添加用户</div>
						<div class='actions'>
							<a href="#" class="btn box-remove btn-mini btn-link"><i
								class='icon-remove'></i> </a> <a href="#"
								class="btn box-collapse btn-mini btn-link"><i></i> </a>
						</div>
					</div>
					<div class='box-content'>
						<form id="userForm" onsubmit="return validateUser()"
							action="<%=request.getContextPath()%>/user/addUser.action"
							method="post">
							<div class='control-group'>
								<label class='control-label' for='inputText1'>姓名：</label>
								<div class='controls'>
									<input type="text" id="username" name="username">

								</div>
							</div>
							<div class='control-group'>
								<label class='control-label' for='inputText1'>年龄：</label>
								<div class='controls'>
									<input type="text" id="age" name="age">
								</div>
							</div>
							<hr class='hr-normal' />

							<div class='control-group'>
								<label class='control-label' for='inputSelect'>密码：</label>
								<div class='controls'>
									<input type="password" name="password">
								</div>
							</div>
							<div class='control-group'>
								<label class='control-label'>专业划分</label>
								<div class='controls'>
									<label class='radio inline'> <input type='radio'
										value='专业大类' name="mCategory" /> 专业大类
									</label> <label class='radio inline'> <input type='radio'
										value='其他' name="mCategory" /> 其他
									</label>
								</div>
							</div>

							<!--保存重置-->
							<div class='form-actions'>
								<button class='btn btn-primary'
									onclick="$('#userForm').submit()" type="button">
									<i class='icon-save'></i> 保存
								</button>
								<button class='btn' type="reset">重置</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
</body>
</html>