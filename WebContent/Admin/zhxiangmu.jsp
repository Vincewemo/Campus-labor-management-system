<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>志愿项目页面</title>
 <link href="/jiemian/css/bootstrap.min.css" rel="stylesheet">
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <link rel="stylesheet" href="/jiemian/css/layui.css">
    <link rel="stylesheet" href="/jiemian/css/bootstrap.min.css">  
  
<script src="/jiemian/WebContent/layui.js"></script>
  <script src="/jiemian/js/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
</head>
<body>
<div align="center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
				志愿劳动信息
				</h1>
				<h2>
				管理员可以添加志愿劳动信息
				</h2>
				<p>
				    
					 <a class="btn btn-primary btn-large" href="/jiemian/Admin/Adminshouye.jsp">返回</a>
					
				</p>
			</div>
		</div>
	</div>
</div>

</div>
<hr class="layui-bg-black">



<form action="zhiyuan5">
<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>志愿劳动编号</th>
      <th>志愿劳动名称</th>
    
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.gzz">
    <tr>
    <th><s:property value="bianhao" /></th>
     <th><s:property value="zymc" /></th>
    </tr>
    </s:iterator>
    <tr>
    </tr>
  </tbody>
</table>

<input	class="layui-btn" type="submit" value="刷新" />
</form>


<hr class="layui-bg-black">




<div align="center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					添加新志愿劳动
				</h1>

			</div>
		</div>
	</div>
</div>

</div>

<form action="zhiyuan6">
 <div class="layui-form-item"  style="margin-left:40%">
    <label class="layui-form-label">志愿名</label>
    <div class="layui-input-inline">
      <input name="gxzym" required lay-verify="required" placeholder="请输入新志愿名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写志愿劳动名</div>
  </div>
  
  
  
  
   <div class="layui-form-item"  style="margin-left:40%">
    <label class="layui-form-label">任务号</label>
    <div class="layui-input-inline">
      <input name="gxzyh" required lay-verify="required" placeholder="请输入新志愿编号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写志愿编号</div>
  </div>
  
  
<div style="margin-left:45%">
<input class="layui-btn" type="submit" value="提交" />

</div>


</form>



</body>
</html>