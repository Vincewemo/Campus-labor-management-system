<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
					学生出勤信息
				</h1>
				<p>
				管理员应根据具体情况核实劳动出勤信息并在表中查看学生劳动信息
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="javascript:history.go(-1)">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>
<hr class="layui-bg-cyan">

<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>学生姓名</th>
      <th>周一签到</th>
        <th>周二签到</th>
          <th>周三签到</th>
            <th>周四签到</th>
              <th>周五签到</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.cq">
    <tr>
         <th><s:property value="Sxingming"/></th>
         <th><s:property value="Monday"/></th>
         <th><s:property value="Tuesday"/></th>
         <th><s:property value="Wednesday"/></th>
         <th><s:property value="Thursday"/></th>
         <th><s:property value="Friday"/></th>
    </tr>
    </s:iterator>
   
  </tbody>
</table>
















</body>
</html>