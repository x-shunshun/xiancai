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
    <title>My JSP 'admin_bianji.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/admin/admin_bianji/bianji.css">
    <script src="js/jquery-1.6.2.js"></script>
    <script src="js/admin/admin_bianji/admin_bianji.js"></script>
  </head>
  
  <body>
   
  
   <!--  
   <div id="AppConfirm">
        <div id="modlue">
        <div class="MyContent"><h3 class="h3_xiajia">是否确认上架该商品？</h3></div>
        <div class="MyBtn"><a href="updateGood.action?goodId=<s:property value="goodId"/>" id="cancleBtn" value="" style="background:url(image/admin/admin_five.png)" ></a>
                           <button id="confirm" value="" style="background:url(image/admin/admin_four.png)" ></button>
                           </div>
        </div>
        </div>
        <div id="infoMesg"></div>
   -->
  
   
   
   
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
<!-- ${sessionScope.admin.adminImage} -->
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
<div class="bianji">用户管理</div>

<div class="message">
<div class="main">
<form action="doUpdate.action" method="post" enctype="multipart/form-data">
<h2>昵称：&nbsp;&nbsp;<input type="text" name="adminName" class="adminname" maxLength="12" value="${admin.adminName}"/>
     
    <span class="span1">请输入中文、数字和英文!</span>
    </h2>

<h2>密码：&nbsp;&nbsp;<input type="text" name="adminPassword" class="adminpassword" maxLength="12" value=" ${admin.adminPassword}"/>
  
    <span class="span2">请输入数字和英文!</span>
    </h2>

<h2>头像：<input type="file" name="upload" class="adminfile" value="${admin.adminImage}"/>  
</h2>
 <img src="" width="80" height="80" class="adminimg" >
<br>
<div class="btn">
<input type="submit" value="" class="sub" style="background:url(image/admin/image21.png)"/>
</div>
</form>
</div>
</div>

</div>
</div>


 <script type="text/javascript">
  
  
	$('.adminname').blur(function(){
		var value = $(this).val();
		var reg = new RegExp("^[A-Za-z0-9\u4e00-\u9fa5]+$");
		if(!reg.test(value)){
			$('.span1').css('visibility','visible');
		}else{
		    $('.span1').css('visibility','hidden');
		}
	})
	
	$('.adminpassword').blur(function(){
		var value = $(this).val();
		var reg = new RegExp("^[A-Za-z0-9]+$");
		if(!reg.test(value)){
			$('.span2').css('visibility','visible');
		}else{
		    $('.span2').css('visibility','hidden');
		}
	})
	
	$('.adminfile').bind('input propertychange',function(){
	   var value = $(this).val();
	 $('.adminimg').attr("src",value);
	 
	})
	
	   
</script>

</body>

</html>
