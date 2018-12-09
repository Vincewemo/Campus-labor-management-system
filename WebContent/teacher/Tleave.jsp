<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假信息页</title>
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
					学生请假信息
				</h1>
				<p>
				教师应审核学生的请假信息
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian//teacher/jiaoshishouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>
<hr class="layui-bg-black">
<form action="leave4">
<table class="layui-table">
  <colgroup>
    <col width="50">
    <col width="50">
    <col width="100">
     <col width="300">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>学生名</th>
      <th>是否批准</th>
      <th>新任务</th>
      <th>请假理由</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.tqjinfo">
    <tr>
      <td><s:property value="xsname"/></td>
       <td><s:property value="qjheshi"/></td>
        <td><s:property value="xind"/></td>
         <td><s:property value="liyou"/></td>
    </tr>
    </s:iterator>
  </tbody>
</table>
<input 	class="layui-btn" type="submit" value="刷新"/>
</form>



<hr class="layui-bg-black">

<form action="leave5" method="post">
 <div class="layui-form-item">
    <label class="layui-form-label">学生名</label>
    <div class="layui-input-inline">
      <input name="qjxsm" required lay-verify="required" placeholder="请输入已有的学生名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">请输入学生名</div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">批准</label>
    <div class="layui-input-inline">
      <input  name="pz" required lay-verify="required" placeholder="请输入'批准'" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">请不要输入'批准'以外的字符</div>
  </div>
  <input 	class="layui-btn" type="submit" value="提交"/>

</form>

<hr class="layui-bg-black">











</body>
</html>