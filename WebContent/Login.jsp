<!DOCTYPE html>
<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
<head>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/jiemian/css/layui.css"  media="all">
<meta charset="utf-8">

 <script src="/jiemian/js/layer.js"></script>
<link rel="stylesheet" href="/jiemian/css/layui.css">
</head>
<body  bgcolor="#009999">

<!-- <br><br><br><br><br><br> -->
<!-- <a href="book">to NewFile</a> -->

<!-- <br><br><br><br><br><br> -->
<!-- <a href="test">to NewFile1</a> -->



<!-- <br><br><br><br><br><br> -->
<!-- <a href="rew">to jiaoshishouye.jsp</a> -->


<div class="layui-collapse" style="text-align:center;">
  <div  class="layui-colla-item" style="text-align:center">
    <h2 class="layui-colla-title"  style="text-align:center">教师登录</h2>
    <div class="layui-colla-content ">
    
    <form class="layui-form" action="log0" method="post">
      <div class="layui-form-item" style="text-align:center" >
    <label class="layui-form-label" color="blue"></label>
    <div class="layui-input-block" style="text-align:center">
      <input type="text" name="jssname" 
      required  lay-verify="required" 
      placeholder="请输入用户名" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
    
       <div class="layui-form-item">
    <label class="layui-form-label"></label>
    <div class="layui-input-block">
      <input type="password" name="jsspassword" 
      required  
      lay-verify="required" 
      placeholder="请输入密码" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
  
    <input  right = "60px" type="submit" value="确定" 	class="layui-btn layui-btn-warm">
  </form>
    
    </div>
  </div>
  <div class="layui-colla-item">
    <h2 class="layui-colla-title">管理员登录</h2>
    <div class="layui-colla-content ">
     <form class="layui-form" action="log1" method="post">
        <div class="layui-form-item">
    <label class="layui-form-label"></label>
    <div class="layui-input-block">
      <input type="text" name="gname" 
      required  lay-verify="required" 
      placeholder="请输入用户名" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
    
       <div class="layui-form-item">
    <label class="layui-form-label"></label>
    <div class="layui-input-block">
      <input type="password" name="gpassword" 
      required  
      lay-verify="required" 
      placeholder="请输入密码" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
  <input  right = "60px" type="submit" value="确定"	class="layui-btn layui-btn-warm">
    </form>
    
    
    
    
    
    </div>
  </div>
  <div class="layui-colla-item">
    <h2 class="layui-colla-title">学生登录</h2>
    <div class="layui-colla-content ">
      <form class="layui-form" action="log2" method="post">
        <div class="layui-form-item">
    <label class="layui-form-label" ></label>
    <div class="layui-input-block">
      <input type="text" name="sname" 
      required  lay-verify="required" 
      placeholder="请输入用户名" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
    
       <div class="layui-form-item">
    <label class="layui-form-label"></label>
    <div class="layui-input-block">
      <input type="password" name="spassword" 
      required  
      lay-verify="required" 
      placeholder="请输入密码" 
      autocomplete="off" 
      class="layui-input">
    </div>
  </div>
     <input  right = "60px" type="submit" value="确定" 	class="layui-btn layui-btn-warm">
    
    </form>
    
    
    </div>
  </div>
</div>
<br><br><br><br><br>
<div align="center" >

 <a  href="index.jsp" 	class="layui-btn layui-btn-lg layui-btn-normal">返回引导页</a>

</div>












  <div class="layui-footer" align="center">
      © 哈尔滨华德学院
  </div>


<script src="/jiemian/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('element', function(){
 	  var element = layui.element;
	  
	  
	});
</script>

</body>
</html>