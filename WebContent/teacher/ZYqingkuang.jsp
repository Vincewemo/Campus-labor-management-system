<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生志愿劳动情况页</title>
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
					学生志愿劳动表单
				</h1>
				<p>
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian//teacher/jiaoshishouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>

<hr class="layui-bg-blue">
<form action="zhiyuan7"">
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
     <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>学生姓名</th>
      <th>学生志愿劳动</th>
      <th>管理员是否核实</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.Txzh">
    <tr>
    <th><s:property value="name" /></th>
    <th><s:property value="zyname" /></th>
    <th><s:property value="zyheshi" /></th>
    </tr>
    </s:iterator>
    <tr>
    </tr>
  </tbody>
</table>
<input 	class="layui-btn" type="submit" value="刷新" />
</form>
















</body>
</html>