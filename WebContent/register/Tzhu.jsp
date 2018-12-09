<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师注册</title>
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
<body  class="layui-layout-body" background="/jiemian/images/jiaoshi.jpg">
<!-- 300,60 -->

<div class="container" >
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#00CCCC">
				<h1 align="center" style="color:#FFFFFF">
					教师注册
				</h1 >
				<br> <br><br><br><br>
				<p align="center" style="color:#FFFFFF">
				    (教师注册需要填写秘钥信息)
					请填写正确的用户名密码,已有账号请返回登录
					</p>
				<p align="center">
					 <a  class="layui-btn layui-btn-lg" href="/jiemian/Login.jsp">返回登录</a>
					  <a  class="layui-btn layui-btn-lg" href="/jiemian/index.jsp">返回首页</a>
				</p>
				
			</div>
		</div>
	</div>
</div>

<form  class="layui-form" action="RT" method="post">
   <div class="layui-form-item"  style="margin-left: 150px">
    <label class="layui-form-label"  style="margin-left: 30%;color:#ffffff">用户名</label>
    <div class="layui-input-inline" style="margin-left: 1%">
      <input type="text" name="Tn" required  lay-verify="required" placeholder="输入账号名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  
  
  <div class="layui-form-item" style="margin-left: 150px">
    <label class="layui-form-label" style="margin-left: 30%;color:#ffffff">密码</label>
    <div class="layui-input-inline" style="margin-left: 1%">
      <input type="password" name="Tp" required lay-verify="required" placeholder="输入账号密码" autocomplete="off" class="layui-input">
    </div>
    </div>
      
  <div class="layui-form-item" style="margin-left: 150px">
    <label class="layui-form-label" style="margin-left: 30%;color:#ffffff">秘钥</label>
    <div class="layui-input-inline" style="margin-left: 1%">
      <input type="password" name="Tm" required lay-verify="required" placeholder="输入秘钥信息" autocomplete="off" class="layui-input">
    </div>

  </div>
    <input class="layui-btn layui-btn-lg" type="submit" value="确定"  style="margin-left: 44%"/>
  
</form>
</body>
</html>