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
					学生信息
				</h1>
				<p>
					查看/修改
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="/jiemian/student/xueshengshouye.jsp">返回</a>
				</p>
			</div>
		</div>
	</div>
	
	
	<hr class="layui-bg-black">
	<form action="Sif" method="post">
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
	<input type="text"  
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("sx") %>	 />   
	</div>
	</div>
	
	
		<hr class="layui-bg-black">
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("sp") %>	 />   
	</div>
	</div>
	
		<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("sz") %>	 />   
	</div>
	</div>
	
	
		<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("sxh") %>	 />   
	</div>
	</div>
	
		<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
		<input type="text"  
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("sna") %>	 />   
	</div>
	</div>
	
		<hr class="layui-bg-black">
	
	
	 <div class="layui-form-item">
    <label class="layui-form-label">学院</label>
    <div class="layui-input-block">
		<input type="text" 
	readonly="readonly" 
	placeholder="请输入标题" 
	autocomplete="off"
	class="layui-input"
	value=<%=request.getAttribute("spa") %>	 />   
	</div>
	</div>
		<hr class="layui-bg-black">
	<div align="center" style="margin:10px">
	<input class="layui-btn" type="submit" value="刷新信息" >
	</div>
	</form>
</div>


<hr class="layui-bg-blue">
<form action="Sifc" method="post">
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
    <div class="layui-form-mid layui-word-aux">修改学生联系电话</div>
  </div>



<div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新学号</label>
    <div class="layui-input-inline" >
      <input name="newxh"  required lay-verify="required" placeholder="请输入学号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改学号</div>
  </div>


<div class="layui-form-item" style="margin-left: 40%">
    <label class="layui-form-label" >新专业</label>
    <div class="layui-input-inline" >
      <input name="newzy" required lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">修改学生专业</div>
  </div>

<div align="center" style="margin:10px">
<input class="layui-btn" type="submit" value="提交修改" >
</div>
</div>

</form>















</body>
</html>