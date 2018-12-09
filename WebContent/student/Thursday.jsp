<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="/jiemian/css/bootstrap.min.css" rel="stylesheet">
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <link rel="stylesheet" href="/jiemian/css/layui.css">
    <link rel="stylesheet" href="/jiemian/css/bootstrap.min.css">  
  
<script src="/jiemian/WebContent/layui.js"></script>
  <script src="/jiemian/js/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="/jiemian/js/bootstrap.min.js"></script>
<title>签到页</title>
</head>
<body>

<div class="container" align="center">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					签到页面
				</h1>
			<p>周四签到,请在签到框和姓名框中输入正确的信息</p>
				
				
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

<form action="mark3" method = "post">

<div style="margin-left: 40%">

 <div class="layui-form-item" >
    <label class="layui-form-label">签到框</label>
    <div class="layui-input-inline">
      <input name="qd4" placeholder="请输入'签到'" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">签到请输入'签到'</div>
  </div>
  

</div>
<div align="center">
<input 	class="layui-btn layui-btn-lg layui-btn-normal" type="submit" value="提交" />
</div>
</form>

<div align="center">
<!-- <a href="/jiemian/student/Friday.jsp">下一天</a> -->

</div>


</body>
</html>