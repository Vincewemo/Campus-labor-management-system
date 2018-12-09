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
<title>劳动人员</title>
</head>
<body>
<div class="container" align="center">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#ADD8E6">
				<h1>
					查询/修改新劳动任务
				</h1>
				
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/teacher/jiaoshishouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

  <form action="rew5">
<table class="layui-table">

  <colgroup>

  </colgroup>
  <thead>
    <tr>
      <th>学院名称</th>
 <s:iterator value="#request.sss">
      <th> <s:property value="Xname"/></th>
  </s:iterator>
    </tr> 
  </thead>
  <tbody>
    <tr>
      <td>班级数</td>
       <s:iterator value="#request.sss">
      <td><s:property value="banjishu"/></td>
      </s:iterator>
    </tr>
  </tbody>
 
  
</table>
  <input class="layui-btn" type="submit" value="刷新" />
 </form>


<form action="rew6" method="post">

 <div class="layui-form-item"  style="margin-left: 40%">
    <label class="layui-form-label">新学院</label>
    <div class="layui-input-inline">
      <input name="xxy" required lay-verify="required" placeholder="新学院名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写学生学院</div>
  </div>

<div class="layui-form-item"  style="margin-left: 40%">
    <label class="layui-form-label">新专业</label>
    <div class="layui-input-inline">
      <input  name="xzy" required lay-verify="required" placeholder="新专业名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写学生专业</div>
  </div>
  
  
  
<div class="layui-form-item"  style="margin-left: 40%">
    <label class="layui-form-label">新班级</label>
    <div class="layui-input-inline">
      <input  name="xbj" required lay-verify="required" placeholder="新班级号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写学生班级</div>
  </div>
  
  
  
  
  
<div class="layui-form-item"  style="margin-left: 40%">
    <label class="layui-form-label">新任务</label>
    <div class="layui-input-inline">
      <input  name="xrw" required lay-verify="required" placeholder="新任务名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">填写学生任务</div>
  </div>

<div align="center">
 <input class="layui-btn" type="submit" value="提交" />
 </div>
</form>


</body>
</html>