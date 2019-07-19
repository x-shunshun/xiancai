$(document).ready(function(){  
 
  window.onload=function(){
   var boxBtn=document.getElementsByClassName("sub");
   // var boxBtn=document.getElementById('sub');
for( var i=0;i<boxBtn.length;i++){
    boxBtn[i].onclick=function(){
    new ShowDiv();
 $('#modlue').css('display', 'block');
  }
}

   
}
function ShowDiv(){
var _this=this;
this.modlueDiv=document.getElementById("modlue");
this.BoxBtn=document.getElementsByClassName("sub");
//this.BoxBtn=document.getElementById('sub');
//this.cancleBtn=document.getElementById("cancle");
//对应div的“X”按钮的操作
this.cancleBtnn=document.getElementById("cancleBtn");
//对应div的取消按钮的操作
this.confirmBtn=document.getElementById("confirm");
this.newMask = document.createElement("div");  
//遮罩层，用来屏蔽灰掉背部界面
this.infoMsg=document.getElementById('infoMesg');
//this.textData=document.getElementById("TextValue")
//this.textData.value="";
this.BoxBtn.disabled=true;
this.modlueDiv.style.visibility="visible";
this.cancleBtnn.onclick=function(){
    _this.CloseDiv(this);
}
//取消按钮
//this.cancleBtn.onclick=function(){
 //   _this.CloseDiv(this);
//}
//确认按钮
this.confirmBtn.onclick=function(){
    _this.CloseDivAndInfoMesg(this);
}
// 创建弹出层 遮罩层 等 
    if ( !document.getElementById("mask") && 1)
    {      
        //mask div    
        this.newMask.id = "mask";
        this.newMask.style.position = "absolute";
        this.newMask.style.zIndex = "1";
        this.newMask.style.width ="100%"; 
        this.newMask.style.height = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight) + 100 + "px";
        this.newMask.style.top = "0px";
        this.newMask.style.left = "0px";
        this.newMask.style.background = "gray";
        this.newMask.style.filter = "alpha(opacity=80)";
        this.newMask.style.opacity = "0.5";
        document.body.appendChild(this.newMask);      
    }
    _this.mask=document.getElementById("mask");
    _this.mask.style.visibility="visible";
}
//点击取消按钮关闭模态框
ShowDiv.prototype.CloseDiv=function(){
    this.BoxBtn.disabled=false;
    this.modlueDiv.style.visibility="hidden";
    this.mask.style.visibility="hidden";
}
//点击确认按钮关闭模态框，提示增加信息
ShowDiv.prototype.CloseDivAndInfoMesg=function(){
        this.CloseDiv();
    //    this.TextValue=document.getElementById("TextValue").value;
   //     this.infoMsg.innerHTML+=("<p>"+this.TextValue+"</p>");
}
 });
 