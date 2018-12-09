<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生参加志愿页</title>
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
					学生志愿劳动
				</h1>
				<p>
				管理员应核实学生参加的志愿劳动
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/Admin/Adminshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>





<hr class="layui-bg-black">

<form action="heshi2">

<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>学生名</th>
      <th>参加志愿劳动</th>
      <th>是否核实</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.clh">
    <tr>
     <th><s:property value="name"/></th>
     <th><s:property value="zyname"/></th>
     <th><s:property value="zyheshi"/></th>
    </tr>
    </s:iterator>
    <tr>
    </tr>
  </tbody>
</table>


<input 	class="layui-btn" type="submit" value="刷新" />

</form>





<hr class="layui-bg-black">

<form action="heshi3" method="post">

<div class="layui-form-item">
    <label class="layui-form-label">姓名框</label>
    <div class="layui-input-inline">
      <input name="zxm" required lay-verify="required" placeholder="请输入学生名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">输入学生姓名</div>
  </div>


<div class="layui-form-item">
    <label class="layui-form-label">核实框</label>
    <div class="layui-input-inline">
      <input  name="zhs" required lay-verify="required" placeholder="请输入'核实'" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">要核实信息请输入'核实'字符</div>
  </div>

<div>
<input 	class="layui-btn" type="submit" value="提交" />
</div>

</form>






</body>
</html>