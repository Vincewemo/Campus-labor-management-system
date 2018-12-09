<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有账号信息</title>
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
			<div class="jumbotron well" style="background:#ADD8E6">
				<h1>
					查看所有用户信息!
				</h1>
				<p>
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/index.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>


<hr class="layui-bg-black">

<form action="findalls">
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
  </colgroup>
  <thead>
    <tr>
      <th>学生名</th>
      <th>学生密码</th>
    </tr> 
    
  </thead>
  <tbody>
  <s:iterator value="#request.ssl">
    <tr>
    <td><s:property value="Susername"/></td>
     <td><s:property value="Suserpassword"/></td>
    </tr>
    </s:iterator>
  </tbody>
</table>

<input 	class="layui-btn"  type="submit" value="刷新" />

</form>

<hr class="layui-bg-black">
<form action="findallg" method="post">
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>管理员名</th>
      <th>管理员密码</th>
    </tr> 
    
  </thead>
  <tbody>
  
   <s:iterator value="#request.ggl">
    <tr>
    <td><s:property value="Gusername"/></td>
     <td><s:property value="Gpassword"/></td>
    </tr>
    </s:iterator>
    
  </tbody>
</table>



 <div class="layui-form-item">
    <label class="layui-form-label">秘钥</label>
    <div class="layui-input-inline" >
      <input type="password" name="gmy" required  lay-verify="required" placeholder="请输入管理员秘钥信息" autocomplete="off" class="layui-input">
    </div>
  </div>




<input 	class="layui-btn"  type="submit" value="刷新" />

</form>


<hr class="layui-bg-black">
<form action="findallt" method="post">
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>教师名</th>
      <th>教师密码</th>
    </tr> 
    
  </thead>
  <tbody>
  
     <s:iterator value="#request.ttl">
    <tr>
    <td><s:property value="Tusername"/></td>
     <td><s:property value="Tuserpassword"/></td>
    </tr>
    </s:iterator>
    
  </tbody>
</table>
 <div class="layui-form-item">
    <label class="layui-form-label">秘钥</label>
    <div class="layui-input-inline" >
      <input type="password" name="tmy" required  lay-verify="required" placeholder="请输入教师秘钥信息" autocomplete="off" class="layui-input">
    </div>
  </div>

<input 	class="layui-btn"  type="submit" value="刷新" />

</form>

</body>
</html>