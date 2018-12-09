<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示工具页</title>
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
					查看 :<s:property value="#session.sn" /> 借出的工具
				</h1>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>

<hr class="layui-bg-black">

<form action="tool3" >
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>工具名称</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.bbtl">
    <tr>
    <th><s:property value="btm" /></th>
    </tr>
  </s:iterator>
  </tbody>
</table>

<input	class="layui-btn" type="submit" value="刷新" />

</form>





</body>
</html>