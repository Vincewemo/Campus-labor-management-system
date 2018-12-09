<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生出勤信息</title>
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
					学生成绩与核实信息页
				</h1>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/teacher/jiaoshishouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>
<hr class="layui-bg-blue">

<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
     <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>是否核实</th>
      <th>成绩</th>
      <th>出勤次数</th>
        <th>姓名</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.qqllcc">
    <tr>
   <th><s:property value="isHeshi" /></th>
    <th><s:property value="grade" /></th>
      <th><s:property value="chuqinCount" /></th>
       <th><s:property value="name" /></th>
    </tr>
  </s:iterator>
    <tr>
 
    </tr>
  </tbody>
</table>












</body>
</html>