<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>管理员界面</title>
  <link rel="stylesheet" href="/jiemian/css/layui.css">

</head>
<body class="layui-layout-body">


<% String path = request.getContextPath(); %>




<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">
    
      欢迎:<s:property value="#session.gn"/>
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
          <a class="" href="javascript:;">出勤信息</a>
          <dl class="layui-nav-child">
            <dd><a href="gsm0">学生出勤查看</a></dd>
            <dd><a href="gsm1">学生出勤核实</a></dd>
         
          </dl>
        </li>
        
        <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">志愿劳动</a>
          <dl class="layui-nav-child">
            <dd><a href="zhiyuan5">志愿劳动项目</a></dd>
            <dd><a href="heshi2"">志愿劳动核实</a></dd>
          </dl>
        </li>
        
         <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">劳动工具</a>
          <dl class="layui-nav-child">
            <dd><a href="gtool1">工具查看</a></dd>
            <dd><a href="gtool4">工具借出/归还信息</a></dd>
          </dl>
        </li>
        
        
        
        
      </ul>
    </div>
  </div>
  
  <div class="layui-body" style="text-align:center;">
    <!-- 内容主体区域 -->
    
      <form action="rew3" method="post">
  <input type="submit" value="点击显示所有任务" class="layui-btn" style="text-align:center;">
  </form>
    
    <table id="test" class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
     <col width="200">
    <col>
  </colgroup>
  
  
  <thead>
    <tr>
      <th>编号</th>
      <th>劳动任务名称</th>
      <th>劳动区域</th>
    </tr> 
  </thead>
  
  
  <tbody>
  <s:iterator value="#request.slll">
   <tr>
   <th><s:property value="RWid" /></th>
   
   <th><s:property value="RWMC" /></th>
   <th><s:property value="RWQY" /></th>
   </tr>
  </s:iterator>
   
 
   
  </tbody>
</table>
  
    <div style="padding: 15px;"></div>
  </div>
  
  
   
  
  
  
  
  
  
  
  
  <div class="layui-footer">
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