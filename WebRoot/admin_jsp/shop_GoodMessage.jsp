<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>商品详情页</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
	<script src="js/jquery-1.7.2.min.js"></script>
	<script src="js/shop/home.js"></script>
	<link rel="stylesheet" href="css/admin/GoodMessage.css">	
  </head>
  
<body>
<div class="top">
    <div id="site-nav">
        <ul class="sn-quick-menu">
            <li><a href="#">首页</a></li>           
            <li><a href="#">消息</a></li>
            <li><a href="#">购物车</a></li>
            <li><a href="${pageContext.request.contextPath}/user_findUser.action?finduserid=${sessionScope.loginuser.userId}">个人中心</a></li>                       
            <li><a href="#">退出登录</a></li>
            <li>欢迎您:${sessionScope.loginuser.userName}</li> 
        </ul>
  </div>
</div>
<div class="mid">
  <div class="cui_hd">
    <div class="ctriplogo"> <a title="" href="#"> </a> </div>
    <div class="cui_search">
      <input type="text" placeholder="搜索" id="_allSearchKeyword" />
      <button type="button" id="search_button_global"></button>   
    </div>
    <div class="nav-shop"> <a href="${pageContext.request.contextPath}/shop_findUpAllGood.action?findByuserid=${sessionScope.loginuser.userId}&goodState=yishangjia">
    <img src="image/admin/img33.png" /></a></div>
  </div>
  <div class="sell-contanier">
     <div id="sell-center">
          <div id="wantbuy"><a href="#"><button type="button" id="want-buy">我要买</button></a></div>
          <div id="wantsell"><a href="${pageContext.request.contextPath}/shop_toAddGood.action"><button type="button" id="want-sell">我要卖</button></a></div>
     </div>
  </div>      
</div>
<div class="bottom">
<s:iterator value="g" status="li">
    <div class="left">
      <img src="<s:property value="goodPricture"/>" width="60" height="60">
    </div>
    <div class="right">
    <div class="miaoshu">
    <span class="miaoshu_child"> <s:property value="goodName"/> </span>
     </div>
     <div class="price">
     <span class="price_child1">价格：</span>
     <span class="price_child2">￥&nbsp;<s:property value="goodPrice"/></span>
      </div>
      <div class="transport">
      <span class="transport_child1">类型：</span>
      <span class="transport_child2"><s:property value="goodType"/></span>
       
       </div>
       <div class="content"> 
       <div class="content_child"><s:property value="goodDescription"/></div>
       </div>
        <div class="num">
         <span class="num_child1">数量：</span>
         <span class="num_child2"><s:property value="goodNum"/></span>
         </div>
         <div class="button">
          <div class="buy"><img src="image/admin/img30.png" height="30px" width="130px" /></div>
          <div class="no"><img src="image/admin/img31.png" height="30px" width="130px" /></div>
         </div>
    </div>
    </s:iterator>
</div>
</body>
</html>
