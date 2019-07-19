<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>管理员登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
    <script type="text/javascript" src="js/admin/admin_login/admin_login.js"></script>
    <link rel="stylesheet" href="css/admin/admin_login/admincss.css" >
  </head>
  
  <body>
<div class="adminLogin">
<s:form action="doLogin.action">
<div id="adminLogin_top" class="adminLogin_top" >
<img src="image/admin/admin_one.png" width="154" height="100" />
</div>

<div id="adminLogin_center"  class="adminLogin_center">
<h3>用户名：<input name="adminName"class="adminname" type="text" value="请输入用户名！" /></h3>
<br /><br />
<h3>密码：<input name="adminPassword" class="adminpassword" type="password" value="请输入密码!"/></h3>
</div>

<div id="adminLogin_bottom" class="adminLogin_bottom" >
 <input type="submit" value="" class="sub" style="background:url(image/admin/admin_three.png)"/>
  </div>
  </s:form>
</div>

<script type="text/javascript">
    $('.adminname').focus(function(){
    $('.adminname').val('');
    })
  
	$('.adminname').blur(function(){
		var value = $(this).val();
		var reg = new RegExp("^[A-Za-z0-9\u4e00-\u9fa5]+$");
		if(value==""){
			 $('.adminname').val('用户名不能为空!');
		}else{
		  if(!reg.test(value)){
		     $('.adminname').val('用户名格式错误！');
		  }else{
		   $('.adminname').css('opacity',1);
		  }  
		}
	})
	
	
	
	$('.adminpassword').focus(function(){
    $('.adminpassword').val('');
    })
  
	$('.adminpassword').blur(function(){
		var value = $(this).val();
		var reg = new RegExp("^[A-Za-z0-9\u4e00-\u9fa5]+$");
		if(value==""){
		    
			 $('.adminpassword').val('密码不能为空!');
			
		}else{
		  if(!reg.test(value)){
		   
		     $('.adminpassword').val('密码格式错误！');
		  }else{
		
		   $('.adminpassword').css('opacity',1);
		  }  
		}
	})
</script>

</body>
</html>
