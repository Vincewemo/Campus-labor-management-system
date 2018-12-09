<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="/jiemian/css/bootstrap.min.css" rel="stylesheet">
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <link rel="stylesheet" href="/jiemian/css/layui.css">
    <link rel="stylesheet" href="/jiemian/css/bootstrap.min.css">  
  
<script src="/jiemian/WebContent/layui.js"></script>
  <script src="/jiemian/js/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>借出/归还统计页面</title>
</head>
<body>
<div align="center">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron well" style="background:#ADD8E6">
				<h1>
					查看学生工具 借出/归还统计
				</h1>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/Admin/Adminshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>
<hr class="layui-bg-green">
<form action="gtool4">
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
      <th>学生姓名</th>
      <th>借出数量</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.brl">
    <tr>
    <td><s:property value="names"/></td>
     <td><s:property value=" borrown"/></td>
    </tr>
    </s:iterator>
    <tr>
    </tr>
  </tbody>
</table>
<hr class="layui-bg-green">
    <div class="layui-form-mid layui-word-aux" style="margin-left:50%">剩余未归还工具总量</div>
    
	<input 
	style="margin-left:50%"
	type="text"  
	readonly="readonly" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("alc") %>	 />  
<hr class="layui-bg-green">
<div align="center">
<input  class="layui-btn" type="submit" value="刷新" />
</div>
</form>

</body>
</html>