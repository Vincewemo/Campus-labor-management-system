<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已选择的志愿页面</title>
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
					查看:
					<s:property value="#session.sn"/>
					的志愿劳动
				</h1>
				<p>
				学生应积极参加劳动
				</p>
				<p>
					 <a class="layui-btn" href="/jiemian/student/xueshengshouye.jsp">返回</a>
					 <a class="layui-btn" href="zhiyuan1">继续选择志愿劳动</a>
					 
				</p>
			</div>
		</div>
	</div>
</div>
</div>



<form action="zhiyuan3" >
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>志愿名称</th>
      <th>是否核实</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.ccjz">
    <tr>
     <th><s:property value="zyname"/></th>
      <th><s:property value="zyheshi"/></th>
    </tr>
    </s:iterator>
    <tr>
 
    </tr>
  </tbody>
</table>
<div align="center">
 <input  	class="layui-btn" type="submit" value="刷新" />
 </div>
</form>



<hr class="layui-bg-black">
<div align = "center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					取消志愿劳动
				</h1>
				<p>
				学生自行取消志愿劳动
				</p>
			</div>
		</div>
	</div>
</div>
</div>
<form action="zhiyuan4">
<div class="layui-form-item" style="margin-left:42%">
    <label class="layui-form-label">取消框</label>
    <div class="layui-input-inline">
      <input  name="qxzym" required lay-verify="required" placeholder="请输入已选择的志愿名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">请输入取消的志愿名称</div>
  </div>
  <div style="margin-left:50%">
  <input  	class="layui-btn" type="submit" value="提交" />
  </div>
</form>





</body>
</html>