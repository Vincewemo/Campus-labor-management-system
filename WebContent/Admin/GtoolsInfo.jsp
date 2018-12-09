<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工具信息页面</title>
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
					工具信息
				</h1>
				<p>
				管理员可以添加劳动工具/修改工具耐久
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/Admin/Adminshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
</div>

</div>

<hr class="layui-bg-black">

<form action="gtool1">
<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>工具名称</th>
      <th>耐久度</th>
    </tr> 
  </thead>
  <tbody>
  <s:iterator value="#request.tl">
     <tr>
     <td><s:property value="toolname"/></td>
     <td><s:property value="wear"/></td>
     </tr>
    </s:iterator>
  </tbody>
</table>

<input 	class="layui-btn" type="submit" value="刷新" />
</form>


<hr class="layui-bg-black">
<form action="gtool2" method="post">

  <div class="layui-form-item">
    <label class="layui-form-label">新工具</label>
    <div class="layui-input-inline">
      <input name="xgj" required lay-verify="required" placeholder="请输入新工具名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">不能重复添加工具</div>
  </div>

<input class="layui-btn" type="submit" values="提交" />
</form>




<hr class="layui-bg-black">

<form action="gtool3" method="post">

  <div class="layui-form-item">
    <label class="layui-form-label">工具名</label>
    <div class="layui-input-inline">
      <input name="ggjm" required lay-verify="required" placeholder="请输入正确的工具名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">输入工具名称</div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">耐久度</label>
    <div class="layui-input-inline">
      <input name="njd" required lay-verify="required" placeholder="请输入耐久度" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">只能输入'良好'和'差'</div>
  </div>

<input class="layui-btn" type="submit" values="提交" />
</form>




<div class="layui-footer" align="center">
      © 哈尔滨华德学院
  </div>



</body>
</html>