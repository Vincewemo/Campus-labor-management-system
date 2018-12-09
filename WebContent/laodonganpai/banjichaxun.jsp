<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>教师界面</title>
  <link rel="stylesheet" href="/jiemian/css/layui.css">
<script src="/jiemian/WebContent/layui.js"></script>

<style>

</style>
</head>
<body class="layui-layout-body" >
<!--       style="width: 300px;height:60px;" -->

<% String path = request.getContextPath(); %>

 <a href="/jiemian/teacher/jiaoshishouye.jsp" class="layui-btn" >返回教师界面</a>
<form  class="layui-form" action="rew4" method="post">

 <div class="layui-form-item"  style="padding-top:300px;text-align:150px;">
    <label class="layui-form-label"  style ="margin-left:35%">输入班级号</label>
    
    
    
    
    <div   class="layui-input-block" style ="margin-left:40%">
      <input 
      type="text" 
      style="width:300px;"
      name="banji" 
      required  lay-verify="required" placeholder="请输入班级号" autocomplete="off" class="layui-input" />
 
    </div>
    
    
  </div>
      <div align="center">
      <input type="submit" value="点击查询" class="layui-btn" >
      </div>
  </form>




<div class="layui-row layui-col-space15" style="margin-left: 30%;">
    <div class="layui-col-md6">
      <div class="layui-card">
        <div class="layui-card-header">查询结果面板</div>
        <div class="layui-card-body">
      
          <s:property value="#request.llrw" />
          
          
         
        </div>
      </div>
    </div>
 
  </div>
 
  
     
 
   
   

<script>
layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});


</script>
</body>
</html>