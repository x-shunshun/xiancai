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
    <title>My JSP 'adminMain.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/admin/adminmain/main.css">
    <script src="js/jquery-1.6.2.js"></script>
    <script  src="js/admin/adminmain/admin_main.js"></script>
	
  </head>
  
  <body>
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
<!--${sessionScope.admin.adminImage}  -->
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
<div class="right_top">
  <form>
    <div class="top_sousuo">
    <!--<input type="text" name="sousuo" class="sousuo"/><input type="submit" class="sousuo_btn" value="" style="background:url(image/admin/image24.png)"/> 
      -->
  </div>
 </form>
</div>
<div class="right_main" id="box">
        <div class="inner">
            <!--轮播图-->
            <ul>
                <li><a href="#"><img src="image/admin/1.jpg" alt=""></a></li>
                <li><a href="#"><img src="image/admin/2.jpg" alt=""></a></li>
                <li><a href="#"><img src="image/admin/3.jpg" alt=""></a></li>
                <li><a href="#"><img src="image/admin/4.jpg" alt=""></a></li>
                <li><a href="#"><img src="image/admin/5.jpg" alt=""></a></li>
            </ul>
            <ol class="bar">
              
            </ol>
            <!--左右焦点-->
            <div id="arr">
                  <span id="left"><</span>
                  <span id="right">></span>
            </div>
     
        </div>
    
</div>
<div class="right_right">
  <div class="right_message">
    <ul class="messageList">
      <li>
        <a id="gonggao"href="https://press.taobao.com/detail.html?spm=0.7696189.0.0.51e38eeeRSbo7m&amp;postId=8281751">公告</a>
      </li>
      <li><a id="guize" href="#">规则</a></li>
      <li><a id="anquan" href="#">安全</a></li>
      <li><a id="gongyi" href="#">公益</a></li>
    </ul>
    <div class="notice-bd">
        <ul class="mod first" id="notice1" data-spm-ab="0" role="tabpanel" aria-labelledby="ntc-tab-0" style="display: block;">
        <li>
        <a href="https://press.taobao.com/detail.html?spm=0.7696189.0.0.3550a520mzkDkY&amp;postId=9160711" class="h">阿里巴巴：咸菜吃货 开启吃货元年</a>
        </li>
        <li>
        <a href="https://press.taobao.com/detail.html?spm=0.7696189.0.0.3550a520mzkDkY&amp;postId=9160712">咸菜吃货频道福利</a>
        </li>
        <li>
        <a href="https://press.taobao.com/detail.html?spm=0.7696189.0.0.3550a5203naBLZ&amp;postId=9158196">咸菜公布甜咸分界线</a>
        </li>
        </ul>
        <ul class="mod hide1" id="notice2"role="tabpanel" style="display: none;"><li><a href="https://rule.taobao.com/detail-8271.htm?spm=a2177.7231193.0.0.657117eaXWaWQc&amp;tag=self" class="">新增《咸菜网抽检标准》公示通知</a></li><li><a href="https://rule.taobao.com/detail-8269.htm?spm=a2177.7231193.0.0.657117eaXWaWQc&amp;tag=self" class="">关于证券类商品规则变更通知</a></li><li><a href="https://rule.taobao.com/search.htm?spm=a2177.7231205.0.0.603917eavYsVMl&amp;cId=81&amp;st=1" class="">新增《咸菜网管理规范》公示通知</a></li><li><a href="https://rule.taobao.com/detail-8258.htm?spm=a2177.7231193.0.0.657117eaXWaWQc&amp;tag=self" class="">《直播平台管理规则》变更公示通知</a></li></ul>
        <ul class="mod hide2" id="notice3"role="tabpanel" style="display: none;"><li><a href="https://h5.m.taobao.com/qn/pc/niuba-feeds.html#/detail/10463920?_k=d4j90u" class="h">魔豆妈妈公益项目</a></li><li><a href="https://h5.m.taobao.com/qn/pc/niuba-feeds.html#/detail/10463920?_k=d4j90u" class="h">让母爱永不打烊！</a></li><li><a href="https://h5.m.taobao.com/qn/pc/niuba-feeds.html#/detail/10389738?_k=d4j90u" class="">卖家注意：风险通报！</a></li><li><a href="https://h5.m.taobao.com/qn/pc/niuba-feeds.html#/detail/10376612?_k=d4j90u" class="">售假获刑又起诉！</a></li></ul>
        <ul class="mod hide3" id="notice4"role="tabpanel" style="display: none;"><li><a href="https://gongyi.bbs.taobao.com/detail.html?postId=9028922" class="h">咸菜公益平台正式更名</a></li><li><a href="https://gy.taobao.com/charity_agreement.htm" class="h">益起来商家招募即将截止</a></li><li><a href="https://helpcenter.taobao.com/learn/knowledge?version=old&amp;id=1117986&amp;referer=null" class="">卖家如何设置公益宝贝</a></li><li><a href="https://gongyi.bbs.taobao.com/detail.html?spm=a210m.7763730.0.0.1e1134504fJd7b&amp;postId=816501" class="">公益机构开店全攻略</a></li></ul>
        </div>
  </div>
  <div class="right_mid">
      <div class="app_title"><div class="app">相关APP</div></div>
    
      <ul class="apps-nav clearfix">
  
  
          <li class="nav" data-spm-ab="apps-1">
            <a href="https://mpage.taobao.com/hd/download.html">
              <img src="image/admin/pricture1.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i4/TB1ULEoIXXXXXbXXXXXCBLiJXXX-83-83.jpg_80x80.jpg" src="//img.alicdn.com/tps/i4/TB1ULEoIXXXXXbXXXXXCBLiJXXX-83-83.jpg_80x80.jpg" alt="使用手机扫描淘宝的二维码" data-loaded="1">
              <p>扫一扫淘宝</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-2">
            <a href="https://www.tmall.com/wow/portal/act/app-download">
              <img src="image/admin/pricture2.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i3/TB1vI9cIpXXXXamXpXXgCfiJXXX-83-83.png_80x80.jpg" src="//img.alicdn.com/tps/i3/TB1vI9cIpXXXXamXpXXgCfiJXXX-83-83.png_80x80.jpg" alt="使用手机扫描天猫的二维码" data-loaded="1">
              <p>扫一扫天猫</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-3">
            <a href="https://ju.taobao.com/tool/downApp.htm">
               <img src="image/admin/pricture3.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i2/TB15b5bIpXXXXa4XpXX07tlTXXX-200-200.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描聚划算的二维码">
              <p>扫一扫聚划算</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-4">
            <a href="https://mobile.alipay.com/index.htm" onclick="javascript:goldlog.record('/tbindex.881.11','','','H46866756')">
               <img src="image/admin/pricture4.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i1/TB146YmIFXXXXb3XpXX07tlTXXX-200-200.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描支付宝的二维码">
              <p>扫一扫支付宝</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-5">
            <a href="https://www.taobao.com/go/market/seller/aliclient/ww/index.php">
               <img src="image/admin/pricture5.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i1/TB1Za1EIpXXXXaLXVXXgCfiJXXX-83-83.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描旺旺的二维码">
              <p>扫一扫旺旺</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-16">
            <a href="http://www.xiami.com/apps/mobile">
               <img src="image/admin/pricture6.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="https://img.alicdn.com/tps/TB12UmWPFXXXXcDXVXXXXXXXXXX-80-80.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描虾米的二维码">
              <p>扫一扫虾米</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-9">
              <a href="http://www.autonavi.com/">
                 <img src="image/admin/pricture7.png"></a>
              <div class="app-qr">
                <img class="J_QRCode" data-src="//gw.alicdn.com/tps/TB1DxsBLVXXXXXBXVXXXXXXXXXX-185-185.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描高德的二维码">
                <p>扫一扫高德</p>
              </div>
            </li>
           
          
          
          <li class="nav" data-spm-ab="apps-14">
            <a href="https://www.antfortune.com/" onclick="javascript:goldlog.record('/tbindex.881.10','','','H46866755')">
               <img src="image/admin/pricture8.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="https://gw.alicdn.com/tps/TB1A54QLpXXXXarXFXXXXXXXXXX-140-140.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描蚂蚁财富的二维码">
              <p>扫一扫蚂蚁财富</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-12">
            <a href="http://mobile.tudou.com/" onclick="javascript:goldlog.record('/tbindex.881.12','','','H46866778')">
               <img src="image/admin/pricture9.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="https://gw.alicdn.com/tps/TB1pJhALpXXXXbUaXXXXXXXXXXX-200-200.png_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描土豆的二维码">
              <p>扫一扫土豆</p>
            </div>
          </li>
           
          
          
          <li class="nav" data-spm-ab="apps-7">
            <a href="https://2.taobao.com/app/index">
               <img src="image/admin/pricture10.png"></a>
            <div class="app-qr">
              <img class="J_QRCode" data-src="//img.alicdn.com/tps/i4/TB1r19TIpXXXXc1XFXXCBLiJXXX-83-83.jpg_80x80.jpg" src="//g.alicdn.com/s.gif" alt="使用手机扫描闲鱼的二维码">
              <p>扫一扫闲鱼</p>
            </div>
          </li>
           
          
        </ul>

  </div>
  <div class="right_tianqi">
      <div class="tianqi_tital">天气</div>
      <iframe class="weather_inc" 
      src="http://i.tianqi.com/index.php?c=code&id=7" 
      style="border:solid 1px #7ec8ea" 
      width="220" height="90" frameborder="0" 
      marginwidth="0" marginheight="0" scrolling="no">
    </iframe>
  </div>
 
</div>

<div class="right_bottom">
  <div class="right_bottom_title"><span class="toutiao">咸菜头条</span></div>
  <div class="toutiao_gengduo"><a href="#">更多></a></div>
  <div class="right_bottom_image">
    <div class="right_bottom_image_left">
      <ul class="toutiao_imageList">
          <li><a href="#"><img src="image/admin/6.jpg" alt=""></a></li>
      </ul>
    </div>
    <div class="right_bottom_image_right">
      <ul class="toutiao_newsList">
          <li><a href="#">万圣节去哪玩？良阅二次元游园会等你来！</a></br>
            <span>哈喽，大家好，我是你们的微漫酱！万圣节快要到了，在此推荐给大家一个很好玩的二次元线下活动，大家一起来了解一下吧！</span>
           </li>
      </ul>
     </div>
      
  </div>
</div>

   </div>
</div>


    
</body>
   
  </body>
</html>
