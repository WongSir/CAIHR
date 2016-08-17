<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
  <title>新增任务单</title>
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
        <button type="submit" form="myform" data-toggle="tooltip" title="保存" class="btn btn-primary"><i class="fa fa-save"></i></button>
        <a href="<%=request.getContextPath()%>/task/taskaddsave.action" data-toggle="tooltip" title="取消" class="btn btn-default"><i class="fa fa-reply"></i></a>
      </div>
      <h1>新增任务单</h1>
    </div>
  </div>
  
  <div class="container-fluid">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title"><i class="fa fa-pencil"></i> 基本信息</h3>
      </div>
      <div class="panel-body" >
        <form id="myform" action="<%=request.getContextPath()%>/task/taskaddsave.action" method="post" enctype="multipart/form-data" class="form-horizontal">
        <div class="form-group required">
          <label class="col-sm-2 control-label">任务单名称</label>
          <div class="col-sm-10">
            <input type="text" name="name" value="" placeholder="任务单名称" id="" class="form-control" />
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="">任务完成期限</label>
          <div class="col-sm-10">
            <div class="input-group datetime">
              <input type="text" name="endDate" value="" data-date-format="YYYY-MM-DD HH:mm" id="input-option220" class="form-control" />
              <span class="input-group-btn">
                <button type="button" class="btn btn-default"><i class="fa fa-calendar"></i></button>
              </span>
            </div>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">货物编号</label>
          <div class="col-sm-10">
            <select name="goodID" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">任务类型</label>
          <div class="col-sm-10">
            <select name="taskType" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
              <option value="驻勤">驻勤</option>
              <option value="临配">临配</option>
              <option value="包产">包产</option>
              <option value="出租">出租</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">等级</label>
          <div class="col-sm-10">
            <select name="level" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">计量方式</label>
          <div class="col-sm-10">
            <select name="measureMethod" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="台班">台班</option>
                <option value="吨">吨</option>
                <option value="方">方</option>
                <option value="件">件</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-name1">数量</label>
          <div class="col-sm-10">
            <input type="text" name="weightNumber" value="" placeholder="数量" id="" class="form-control" />
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-name1">单价</label>
          <div class="col-sm-10">
            <input type="text" name="price" value="" placeholder="单价" id="" class="form-control" />
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-name1">已收费用</label>
          <div class="col-sm-10">
            <input type="text" name="hasSum" value="" placeholder="已收费用" id="" class="form-control" />
          </div>
        </div>
        <div class="form-group">
          <label class="col-sm-2 control-label" for="input-meta-title1">支付方式</label>
          <div class="col-sm-10">
            <select name="payMethod" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="现金支付">现金支付</option>
                <option value="网银支付">网银支付</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">客户单位</label>
          <div class="col-sm-10">
            <select name="companyID" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="4">1</option>
                <option value="3">2</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">收货单位</label>
          <div class="col-sm-10">
            <select name="receiveCompID" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="4">1</option>
                <option value="3">2</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">起运地</label>
          <div class="col-sm-10">
            <select name="startPlaceID" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="4">4</option>
                <option value="3">3</option>
                <option value="1">1</option>
                <option value="2">2</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">止运地</label>
          <div class="col-sm-10">
            <select name="endPlaceID" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="4">4</option>
                <option value="3">3</option>
                <option value="1">1</option>
                <option value="2">2</option>
            </select>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">运距类型</label>
          <div class="col-sm-10">
            <select name="distanceType" id="" class="form-control">
              <option value="distanceType">--- 请选择 --- </option>
                <option value="市内">市内</option>
                <option value="市间">市间</option>
                <option value="跨省">跨省</option>
                <option value="省内">省内</option>
            </select>
          </div>
        </div>
        <div class="form-group">
          <label class="col-sm-2 control-label" for="input-meta-description1">任务单描述</label>
          <div class="col-sm-10">
            <textarea name="description" rows="5" placeholder="描述" id="" class="form-control"></textarea>
          </div>
        </div>
        <div class="form-group required">
          <label class="col-sm-2 control-label" for="input-meta-title1">状态</label>
          <div class="col-sm-10">
            <select name="status" id="" class="form-control">
              <option value="">--- 请选择 --- </option>
                <option value="启用">启用</option>
                <option value="禁用">禁用</option>
            </select>
          </div>
        </div>
        </form>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
$('.datetime').datetimepicker({
  pickDate: true,
  pickTime: true
});

</script>
</body>
</html>


    