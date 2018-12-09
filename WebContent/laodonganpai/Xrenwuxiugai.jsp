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
<form  class="layui-form" action="rew2" method="post">

 <div class="layui-form-item"  style="padding-top:300px;">
    <label class="layui-form-label"  style="padding-left:300px;">输入学院</label>
    
    
    
    
    <div   class="layui-input-block" >
      <input 
      type="text" 
      style="width:280px;"
      name="XUEYUAN" 
      required  
      
      lay-verify="required" placeholder="请输入学院" autocomplete="off" class="layui-input" />
 
    </div>
    
    
    
      <label class="layui-form-label" style="padding-left:300px;">输入任务名称</label>
      
      
      
    <div class="layui-input-block">
      <input type="text"
      name="RENWU" 
      required  
      style="width:280px;"
      lay-verify="required" 
      placeholder="请输入任务"
       autocomplete="off" class="layui-input" />
  <input  style="margin-left:100px;" type="submit" value="修改" class="layui-btn" >
    </div>
    
    
    
    
  </div>

  </form>
<!--   <div class="layui-card"> -->
<!--   <div class="layui-card-header">查询值</div> -->
<!--   <div class="layui-card-body"> -->
 
  
     
     
   
   
<!--   </div> -->
<!-- </div> -->
  <div class="layui-footer">
      © 哈尔滨华德学院
  </div>
</body>
</html>