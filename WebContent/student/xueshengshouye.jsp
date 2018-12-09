<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>学生界面</title>
  <link rel="stylesheet" href="/jiemian/css/layui.css">

</head>
<body class="layui-layout-body">


<% String path = request.getContextPath(); %>




<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">
   欢迎: <s:property value="#session.sn"/>
    
    
    </div>
    
    <!-- 头部区域（可配合layui已有的水平导航） -->
    
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="/jiemian/index.jsp">退出登录</a></li>
    
    </ul>

  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">学生出勤</a>
          <dl class="layui-nav-child">
            <dd><a href="mark5">出勤签到</a></dd>
            <dd><a href="/jiemian/student/xueshengixinxi.jsp">信息查看</a></dd>
            <dd><a href="sm0">学生出勤查看</a></dd>
         
          </dl>
        </li>
        
        <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">志愿劳动</a>
          <dl class="layui-nav-child">
            <dd><a href="zhiyuan1">选择志愿劳动</a></dd>
            <dd><a href="zhiyuan3">已参加的志愿劳动</a></dd>
          </dl>
        </li>
        
          <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">劳动工具</a>
          <dl class="layui-nav-child">
            <dd><a href="tool1">工具信息</a></dd>
            <dd><a href="tool3">已借出的工具</a></dd>
              <dd><a href="tool4">未归还的工具</a></dd>
          </dl>
        </li>
         <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">请假</a>
          <dl class="layui-nav-child">
            <dd><a href="leave2">申请请假</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
    
      <form action="rew0" method="post">
      <div align="center">
  <input type="submit" value="点击显示任务" class="layui-btn" style="text-align:center;">
  </div>
  </form>
  
  
 <table id="test" class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
      <col width="200">
    <col width="200">
      <col width="200">
  </colgroup>
  
  
  <thead>
    <tr>
      <th>编号</th>
      <th>学院</th>
      <th>专业</th>
         <th>班级</th>
            <th>劳动任务</th>
    </tr> 
  </thead>
  
  
  <tbody>
  <s:iterator value="#request.rnw">
   <tr>
   <th><s:property value="ID"/></th>
    <th><s:property value="xueyuan"/></th>
     <th><s:property value="zhuanye"/></th>
      <th><s:property value="banji"/></th>
       <th><s:property value="renwu"/></th>
   
   </tr>
   
    
    </s:iterator>
   
  </tbody>
</table>
    
    
    
    
    
    
    
    
    </div>
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  <div class="layui-footer" >
    <!-- 底部固定区域 -->
     © 哈尔滨华德学院
  </div>
</div>
<script src="/jiemian/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
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