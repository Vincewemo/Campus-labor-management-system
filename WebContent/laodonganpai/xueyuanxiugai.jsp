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
</head>
<body class="layui-layout-body">


<% String path = request.getContextPath(); %>

   <a href="/jiemian/teacher/jiaoshishouye.jsp" class="layui-btn" >返回教师界面</a>


<form class="layui-form" action="rew1" method="post">

 <div class="layui-form-item"  style="padding-top:500px;">
 
    <label class="layui-form-label" style="padding-left:300px;">请输入学院名称(全称)</label>
    <div class="layui-input-block">
      <input type="text" name="title" 
      required  
      style="width: 300px"
      lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input" />
  <input type="submit" value="查询" class="layui-btn" >
  
    </div>
  </div>

  </form>
  
  
  
  
  
  <div class="layui-card">
  <div class="layui-card-header" style="padding-left:400px;">学院负责任务</div>
  <div class="layui-card-body">
 
     <s:iterator value="#request.brw">
     <s:property value="renwu"/>
    <br>
     
     
     </s:iterator>
   
  </div>
</div>
  <div class="layui-footer">
      © 哈尔滨华德学院
  </div>
</body>
</html>