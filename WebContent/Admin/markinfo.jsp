<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核实页面</title>
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
					核实学生出勤信息
				</h1>
				<p>
				管理员应核实学生出勤信息并给予成绩
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/Admin/Adminshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>
</div>

<form action="gsm1">
<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>学生名</th>
      <th>学生出勤次数</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.qdxs" >
    <tr>
      <th><s:property value="name"/></th>
      <th><s:property value="chuqinCount"/></th>
    </tr>
    </s:iterator>
    <tr>
      
    </tr>
  </tbody>
</table>
<input	class="layui-btn" type="submit" value="刷新" />
 </form>
<hr class="layui-bg-cyan">
<form action="gsm2">
<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
     <th>学生姓名</th>
      <th>信息是否核实</th>
      <th>分数</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.xinqc" >
    <tr>
      <th><s:property value="name"/></th>
      <th><s:property value="isHeshi"/></th>
       <th><s:property value="grade"/></th>
    </tr>
    </s:iterator>
    <tr>
      
    </tr>
  </tbody>
</table>
<input  	class="layui-btn" type="submit" value="刷新" />
 </form>
 
 <form action="heshi" method="post">
<hr class="layui-bg-cyan">
<div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-inline">
      <input name="xm"  placeholder="请输入学生姓名" autocomplete="off" class="layui-input">
    </div>
  </div>


<div class="layui-form-item">
    <label class="layui-form-label">核实</label>
    <div class="layui-input-inline">
      <input name="hs"  placeholder="请输入'核实'" autocomplete="off" class="layui-input">
    </div>
  </div>

<input  	class="layui-btn" type="submit" value="提交" />

</form>

<div class="layui-footer" align="center">
      © 哈尔滨华德学院
  </div>
</body>
</html>