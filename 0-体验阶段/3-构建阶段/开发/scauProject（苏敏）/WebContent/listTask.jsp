<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>运输任务单管理</title>
  <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/css/bootstrap.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/css/buttons.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/css/stylesheet.css" type="text/css" rel="stylesheet" media="screen" />
  <link href="<%=request.getContextPath()%>/css/font-awesome.min.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/js/summernote/summernote.css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/js/datetimepicker/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet" media="screen" />
  <script src="<%=request.getContextPath()%>/js/jquery-2.1.1.min.js" type="text/javascript" type="text/javascript"></script>
  <script src="<%=request.getContextPath()%>/js/bootstrap.min.js" type="text/javascript" type="text/javascript"></script>
  <script src="<%=request.getContextPath()%>/js/summernote/summernote.js" type="text/javascript" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/datetimepicker/moment.js" type="text/javascript" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/datetimepicker/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
	

</head>
<body>

	<div id="content">
		<div class="page-header">
			<div class="container-fluid">
				<div class="pull-right">
					<a href="<%=request.getContextPath()%>/task/taskadd.action" data-toggle="tooltip" title="新增"
						class="btn btn-primary"><i class="fa fa-plus"></i></a>
				</div>
				<h1>运输任务单管理</h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						<i class="fa fa-list"></i>任务单列表
					</h3>
				</div>

				<div class="table-responsive">
					<table class="table table-bordered table-hover table-striped">
						<thead>
							<tr>
								<td>任务单名称</td>
								<td>发布时间</td>
								<td>结束时间</td>
								<td>状态</td>
								<td class="text-right">操作</td>
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${list}" var="u">
								<tr>
									<td class="text-left"><a href="<%=request.getContextPath()%>/task/taskcontent.action?taskID=${u.taskID}">${u.name }</a></td>
									<td>${u.taskDate.toString() }</td>
									<td>${u.endDate }</td>
									<td>${u.status }</td>
									<td class="text-right">
										<a href="<%=request.getContextPath()%>/TaskIssueServlet?type=edit&taskID=${u.taskID}" data-toggle="tooltip" title="修改" class="btn btn-primary">
											<i class="fa fa-pencil"></i></a>
										<button type="button" data-toggle="tooltip" title="删除" class="btn btn-danger"
										onclick="confirm('确定吗？') ? true : false;">
											<i class="fa fa-trash-o"></i>
										</button>
									</td>
								</tr>
							</c:forEach>


						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>
</body>
</html>