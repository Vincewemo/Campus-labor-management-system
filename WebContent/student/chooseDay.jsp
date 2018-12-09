<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 这里管理员应该设置哪天的签到日期可以选择 用js,暂时不会 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>签到时间页面</title>
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
					请选择签到的日期
				</h1>
				
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/Monday.jsp">周一签到</a>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/Tuesday.jsp">周二签到</a>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/Wednesday.jsp">周三签到</a>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/Thursday.jsp">周四签到</a>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/Friday.jsp">周五签到</a>
				</p>
					<p>
					 <a class="btn btn-primary btn-large" href="javascript:history.go(-1)">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>


</div>
</body>
</html>