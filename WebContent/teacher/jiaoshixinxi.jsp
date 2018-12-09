<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>teacher informations</title>
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

<div class="container" align="center">
	<div class="row clearfix" align="center"  style="color:#000000">
		<div class="col-md-12 column">
			<div class="jumbotron" style="background:#00CCCC">
				<h1>
					教师信息
				</h1>
				<p>
					查看/修改
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/teacher/jiaoshishouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
	<hr class="layui-bg-black">
	
	<form action="Tif" method="post">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
	<input type="text"  
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tx") %>	 />   
	</div>
	</div>
	
	<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tp") %>	 />   
	</div>
	</div>
	
	
	<hr class="layui-bg-black">
	
	 <div class="layui-form-item">
    <label class="layui-form-label">专业</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tz") %>	 />   
	</div>
	</div>
	
	
	<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">职称</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tzh") %>	 />   
	</div>
	</div>
	<hr class="layui-bg-black">
	
	 <div class="layui-form-item">
    <label class="layui-form-label">教师名</label>
    <div class="layui-input-block">
		<input type="text"  
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tna") %>	 />   
	</div>
	</div>
	
	
	<hr class="layui-bg-black">
	
	 <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-block">
	
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("tpa") %>	 />   
	
	</div>
	</div>
	
	<hr class="layui-bg-black">
	
	
	
	<div align="center" style="margin:10px">
	<input class="layui-btn" type="submit" value="刷新信息" >
	</div>
	</form>
</div>


<hr class="layui-bg-blue">
<form action="Tifc" method="post">
<div >
 <div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新学院</label>
    <div class="layui-input-inline" >
      <input name="newxy"  required lay-verify="required" placeholder="请输入学院" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改学院名称</div>
  </div>


<div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新电话</label>
    <div class="layui-input-inline" >
      <input name="newph"  required lay-verify="required" placeholder="请输入电话" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改教师联系电话</div>
  </div>



<div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新职称</label>
    <div class="layui-input-inline" >
      <input name="newzc"  required lay-verify="required" placeholder="请输入职称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改教师职称</div>
  </div>


<div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新专业</label>
    <div class="layui-input-inline" >
      <input name="newzy" required lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改教师专业</div>
  </div>

<div align="center" style="margin:10px">
<input class="layui-btn" type="submit" value="提交修改" >
</div>
</div>

</form>















</body>
</html>