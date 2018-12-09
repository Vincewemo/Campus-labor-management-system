<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>志愿页面</title>
  <link href="/jiemian/css/bootstrap.min.css" rel="stylesheet">
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <link rel="stylesheet" href="/jiemian/css/layui.css">
    <link rel="stylesheet" href="/jiemian/css/bootstrap.min.css">  
  
<script src="/jiemian/WebContent/layui.js"></script>
  <script src="/jiemian/js/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="/jiemian/js/bootstrap.min.js"></script>
</head>
<body>


<div align="center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					查看所有志愿
				</h1>
				<p style="color:#DC143C">
				学生可以自主选择志愿页面,选择一个志愿积5分,多余4个志愿积20分,获得积分需要等待管理员核实
				</p>
				<p>
					 <a class="layui-btn layui-btn-lg" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>
<form action="zhiyuan1">
<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>志愿ID号</th>
      <th>志愿名称</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.xzy">
    <tr>
      <th><s:property value="ID"/></th>
       <th><s:property value="zymc"/></th>
    </tr>
  </s:iterator>
    <tr>
   
    </tr>
  </tbody>
</table>
<input class="layui-btn" type="submit" value="刷新" />
</form>
<hr class="layui-bg-red">

<form action="zhiyuan2" method="post">
 <div class="layui-form-item">
    <label class="layui-form-label">志愿框</label>
    <div class="layui-input-inline">
      <input  name="zyh" required lay-verify="required" placeholder="请输入表中的志愿ID号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">积极参加志愿劳动可以增加学分</div>
  </div>
<input class="layui-btn" type="submit" value="确定">

</form>



















</body>
</html>