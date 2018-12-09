<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<title>查看出勤</title>
</head>
<body>

<div align="center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					<s:property value="#session.sn" /><br>一周的出勤情况
				</h1>
				
				<p>
					 <a class="layui-btn layui-btn-lg" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>

<hr class="layui-bg-blue">

<table class="layui-table">
  <colgroup>
   
    <col width="300">
    <col width="300">
    <col width="300">
    <col width="300">
    <col width="300">
    <col width="300">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>周一</th>
      <th>周二</th>
      <th>周三</th>
      <th>周四</th>
      <th>周五</th>
    </tr> 
  </thead>
  
  
  <s:iterator value="#request.llc" status="stat">
  <tbody>
    <tr>
     <th><s:property value="Monday" /></th>
      <th><s:property value="Tuesday" /></th>
       <th><s:property value="Wednesday" /></th>
        <th><s:property value="Thursday" /></th>
         <th><s:property value="Friday" /></th>
    </tr>
  </tbody>
  
  </s:iterator>
  
  
</table>


</body>
</html>