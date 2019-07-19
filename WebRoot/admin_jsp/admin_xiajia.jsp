<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'admin_xiajia.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/admin/admin_xiajia/xiajia.css">
    <script src="js/jquery-1.6.2.js"></script>
    <script  src="js/admin/admin_xiajia/admin_xiajia.js"></script>
	
  </head>
  
  <body>
  
  
  
    <div class="shenhe_top">  
        <ul class="top_menu">
           <li><a href="admin_jsp/adminlogin.jsp">退出登录</a></li>
            <li><a href="<s:url action="admin"/>">返回首页</a></li>
        </ul>
 
</div>



<div class="shenhe_mid">
<div class="mid_one">
  <img src="image/admin/xiancailogo.png" width="143" height="51"></div>
</div>


<div class="shenhe_bottom">
<div class="shenhe_left">
<div class="head"><img src="${admin.adminImage}" width="80" height="80">
   </div>
   <div class="name"><h3>${admin.adminName}</h3></div>
<div class="chuli">
    <ul class="left_menu">
            <li><a href="<s:url action="doSelectById"/>">编辑</a></li>
             <li><a href="<s:url action="selectMessage"/>">消息</a></li>
            <li><a href="<s:url action="selectAllUser"/>">用户管理</a></li>
            <li><a href="<s:url action="selectGood1"/>">商品审核</a></li>
            <li><a href="<s:url action="selectGood4"/>">商品下架</a></li>
            <li><a href="<s:url action="selecttuikuan1"/>">退款处理</a></li>
        </ul>
   </div>
</div>


<div class="shenhe_right">
<div class="userManage">
<div class="xj1"><a href="<s:url action="selectGood4"/>">全部商品信息</a></div>
<div class="xj2"><a href="<s:url action="selectGood3"/>">已下架商品</a></div>
</div>
<!-- <form action="updateGood1.action?goodId=<s:property value="goodId"/>" method="post"> -->
<div class="manage">
<ul><s:iterator value="yifabu" status="li">
  <li><form >
  <div class="left"><img src="<s:property value="goodPricture"/>" width="60" height="60"></div>
  <div class="right">
  <input type="button" value="" id="box" class="sub" style="background:url(image/admin/image14.png)"/></div>
  <div class="mid">
  <div class="top"><a href="selectonegood.action?goodId=<s:property value="goodId"/>">商品编号：<s:property value="goodId"/></a></div>
  <div class="bottom">商品名称：<s:property value="goodName"/></div>
   </div>
   </form>
  </li>
  
  <div id="AppConfirm">
 <div id="modlue">
 <form action="updateGood1.action?goodId=<s:property value="goodId"/>" method="post">
 <div class="MyContent"><h3 class="h3_xiajia">是否确认将商品下架？</h3></div>
 <div class="MyBtn">
    <button type="submit" id="confirm" value="" style="background:url(image/admin/image11.png)"></button></div>
  </form>
  <button id="cancleBtn" value="" style="background:url(image/admin/image12.png)"></button>
 </div>
 </div>
 <div id="infoMesg"></div>
  
  
  </s:iterator>
</ul>
 

 

 






<ul>
<s:iterator value="yixiajia" status="li">
<li>
  <div class="left"><img src="<s:property value="goodPricture"/>" width="60" height="60"></div>
  <div class="right"><h3>￥：<s:property value="goodPrice"/></h3></div>
  <div class="mid">
  <div class="top"><a href="admin_jsp/shop_GoodMessage.jsp">商品编号：<s:property value="goodId"/></a></div>
  <div class="bottom">商品名称：<s:property value="goodName"/></div>
   </div>
  </li>
  </s:iterator>
</ul>

</div>
<div class="fenye">
 
 <s:iterator value="pageBean" >
			<tr>
				<td colspan="6" align="center" bgcolor="#5BA8DE">
					共<s:property value="allRow" />条记录
					共<s:property value="totalPage" />页
					当前第<s:property value="currentPage" />页<br> 
					<s:if test="%{currentPage == 1}">    
           				第一页  上一页
			        </s:if> 
			        <s:else>
						<a href="selectGood4?page=1">第一页</a>
						<a href="selectGood4?page=<s:property value="%{currentPage-1}"/>">上一页</a>
					</s:else>
					<s:if test="%{currentPage!= totalPage}">
						<a href="selectGood4?page=<s:property value="%{currentPage+1}"/>">下一页</a>
						<a href="selectGood4?page=<s:property value="totalPage"/>">最后一页</a>
					</s:if>
					<s:else>
						下一页  最后一页
			        </s:else>
				</td>
			</tr>
		</s:iterator>

 <s:iterator value="pageBean1" >
			<tr>
				<td colspan="6" align="center" bgcolor="#5BA8DE">
					共<s:property value="allRow" />条记录
					共<s:property value="totalPage" />页
					当前第<s:property value="currentPage" />页<br> 
					<s:if test="%{currentPage == 1}">    
           				第一页  上一页
			        </s:if> 
			        <s:else>
						<a href="selectGood3?page=1">第一页</a>
						<a href="selectGood3?page=<s:property value="%{currentPage-1}"/>">上一页</a>
					</s:else>
					<s:if test="%{currentPage!= totalPage}">
						<a href="selectGood3?page=<s:property value="%{currentPage+1}"/>">下一页</a>
						<a href="selectGood3?page=<s:property value="totalPage"/>">最后一页</a>
					</s:if>
					<s:else>
						下一页  最后一页
			        </s:else>
				</td>
			</tr>
		</s:iterator>
 
</div>

</div>
</div>
    
  </body>
</html>
