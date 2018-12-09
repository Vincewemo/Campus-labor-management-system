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
  <script src="/jiemian/js/layer.js"></script>
  
</head>
<body class="layui-layout-body">


<% String path = request.getContextPath(); %>




<div class="layui-layout layui-layout-admin"  >
  <div class="layui-header">
    <div class="layui-logo">
    欢迎:<s:property value="#session.tn"/>
    
    
    </div>
    
    <!-- 头部区域（可配合layui已有的水平导航） -->
    
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="Tif">教师信息</a></li>
      <li class="layui-nav-item"><a href="/jiemian/index.jsp">退出登录</a></li>
 
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
    
    
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
     <ul class="layui-nav layui-nav-tree layui-inline " lay-filter="demo" style="margin-right: 10px;">
      
        <li class="layui-nav-item layui-nav-itemed">
          <a  href="javascript:;">劳动安排</a>
          <dl class="layui-nav-child ">
            <dd><a href="${pageContext.request.contextPath}/laodonganpai/xueyuanxiugai.jsp">学院任务查询</a></dd>
            <dd><a href="${pageContext.request.contextPath}/laodonganpai/Xrenwuxiugai.jsp">学院任务修改</a></dd>
            <dd><a href="${pageContext.request.contextPath}/laodonganpai/banjichaxun.jsp">班级分配查看</a></dd>
           <dd><a href="rew5">劳动人员查看</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">学生劳动</a>
          <dl class="layui-nav-child">
            <dd><a href="Tchuqin">查看学生出勤信息</a></dd>
            <dd><a href="Tchengji">查看学生分数信息</a></dd>
          </dl>
        </li>
         <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">学生志愿劳动</a>
          <dl class="layui-nav-child">
            <dd><a href="zhiyuan7">学生志愿劳动情况信息</a></dd>
            <dd><a href="zhjifen">学生志愿劳动分数信息</a></dd>

          </dl>
        </li>
           <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">学生请假</a>
          <dl class="layui-nav-child">
            <dd><a href="leave4"">学生请假信息</a></dd>

          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body" style="text-align:center;">
  
  
  <form action="rew" method="post">
  <input type="submit" value="点击显示任务" class="layui-btn" style="text-align:center;">
  </form>
  
  
    <div style="padding: 15px;"></div>
     
     
     
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
 
  
  
  
  
  
  
  
  
  
  <div class="layui-footer">
      © 哈尔滨华德学院
  </div>
  
  
</div>
<script src="/jiemian/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('element', function(){
//   var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});



</script>
</body>
</html>