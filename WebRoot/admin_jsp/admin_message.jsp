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
    <title>My JSP 'admin_message.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/admin/admin_message/message.css">
    <script src="js/jquery-1.6.2.js"></script>
    <script  src="js/admin/adminmessage/admin_message.js"></script>
	
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
 <s:iterator value="admin" status="li">
<div class="head"><img src="<s:property value="adminImage"/>" width="80" height="80"></div>
   <div class="name"><h3><s:property value="adminName"/></h3></div>
   </s:iterator>
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
<div class="top">
    <div class="xitongxiaoxi">
        <div class="sousuo"><a class="xiaoxione" href="<s:url action="selectMessage"/>">系统消息 ></a></div>
        <ul class="xiaoxidisplay" id="xiaoxidisplay">
                <li><a href="<s:url action="selectshenheMessage"/>">审核消息</a></li> 
                <li><a href="<s:url action="selecttuikuanMessage"/>">退款消息</a></li> 
                <li><a href="<s:url action="selectxiajiaMessage"/>">下架消息</a></li> 
        </ul>
    
    </div>
</div>
<div class="bottom">
<ul class="xiaoxi">
 <s:iterator value="message" status="li">
 <li> 
 <div class="left"><img src="<s:property value="users.userImage"/>" width="60" height="60"></div> 
 <div class="right"><h4><span>审核时间：</span><s:property value="sendTime"/></h4></div>
     <div class="mid">
         <div class="name"><h4><span>用户名：</span><s:property value="users.userName"/></h4></div>
         <div class="message"><h4><span>消息内容：</span><s:property value="messageContent"/></h4></div>
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
						<a href="selectMessage?page=1">第一页</a>
						<a href="selectMessage?page=<s:property value="%{currentPage-1}"/>">上一页</a>
					</s:else>
					<s:if test="%{currentPage!= totalPage}">
						<a href="selectMessage?page=<s:property value="%{currentPage+1}"/>">下一页</a>
						<a href="selectMessage?page=<s:property value="totalPage"/>">最后一页</a>
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
