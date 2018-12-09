<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生请假页面</title>
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
					请假信息页
				</h1>
				<p>
				学生应填写请假理由并等待教师核实信息
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>
<hr class="layui-bg-black">

<form action="leave1" method="post">

<div class="layui-form-item layui-form-text" style="margin-left:20%;margin-right:20%">
    <label class="layui-form-label"><p style="font-size:25px;color:#DC143C">原因</p></label>
    <div class="layui-input-block">
      <textarea name="qjly" placeholder="请输入请假理由" class="layui-textarea"></textarea>
    </div>
  </div>
<div align="center">
<input 	 class="layui-btn" type="submit" value="提交" />
 </div>
</form>



<hr class="layui-bg-black">

<form action="leave2">
<table class="layui-table">
  <colgroup>
    <col width="500">
    <col width="200">
       <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>请假理由</th>
      <th>是否批准</th>
      <th>请假之后需要参加的劳动</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.sqj">
    <tr>
     <td><s:property value="liyou"/></td>
    <td><s:property value="qjheshi"/></td>
    <td><s:property value="xind"/></td>
    </tr>
    </s:iterator>
    <tr>
    </tr>
  </tbody>
</table>
<input  class="layui-btn" type="submit" value="刷新">
</form>
<hr class="layui-bg-black">

<form action="leave3">
<div align="center">
<input  class="layui-btn" type="submit" value="撤销请假">
</div>
</form>






</body>
</html>