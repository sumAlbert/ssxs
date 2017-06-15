var jsonDisplay={
	"dd00001":{"name":"最重名","title":"","info":""},
    "dd00002":{"name":"血型分布","title":"","info":""},
    "dd00003":{"name":"邮箱分布","title":"","info":""},
    "dd00004":{"name":"最热姓氏分布","title":"","info":""},
    "dd00005":{"name":"性别分布","title":"","info":""},
    "dd00006":{"name":"专业类别分布","title":"","info":""},
    "dd00007":{"name":"独生子女分布","title":"","info":""},
    "dd00008":{"name":"政治面貌","title":"","info":""},
    "dd00009":{"name":"星座分布","title":"","info":""},
    "dd00010":{"name":"出生年份分布","title":"","info":""}
}
var displayOrder=new Array();
var temp=new Array();
$(document).ready(function(){
		/*初始化页面模板的子菜单*/
		for(var i=0;i<8;i++){
			if(i==0){
				$(".page-model-content-item").eq(i).show();
			}else{
				$(".page-model-content-item").eq(i).hide();
			}
		}
		/*初始化数据上传的子菜单*/
		for(var i=0;i<2;i++){
			if(i==0){
				$(".update-content").eq(i).show();
			}else{
				$(".update-content").eq(i).hide();
			}
		}

		/*控制左边的功能列表*/
		$(".work-item").eq(0).click(function(){
			for(var i=0;i<4;i++){
				if(i==0){
					$(".work-content-item").eq(i).show();
					$(".work-item").eq(i).removeClass("work-item-inactive");
					$(".work-item").eq(i).addClass("work-item-active");
				}
				else{
					$(".work-content-item").eq(i).hide();
					$(".work-item").eq(i).removeClass("work-item-active");
					$(".work-item").eq(i).addClass("work-item-inactive");
				}
			}
		});
		$(".work-item").eq(1).click(function(){
			for(var i=0;i<4;i++){
				if(i==1){
					$(".work-content-item").eq(i).show();
					$(".work-item").eq(i).removeClass("work-item-inactive");
					$(".work-item").eq(i).addClass("work-item-active");
				}
				else{
					$(".work-content-item").eq(i).hide();
					$(".work-item").eq(i).removeClass("work-item-active");
					$(".work-item").eq(i).addClass("work-item-inactive");
				}
			}
		});
		$(".work-item").eq(2).click(function(){
			for(var i=0;i<4;i++){
				if(i==2){
					$(".work-content-item").eq(i).show();
					$(".work-item").eq(i).removeClass("work-item-inactive");
					$(".work-item").eq(i).addClass("work-item-active");
				}
				else{
					$(".work-content-item").eq(i).hide();
					$(".work-item").eq(i).removeClass("work-item-active");
					$(".work-item").eq(i).addClass("work-item-inactive");
				}
			}
		});
		$(".work-item").eq(3).click(function(){
			for(var i=0;i<4;i++){
				if(i==3){
					$(".work-content-item").eq(i).show();
					$(".work-item").eq(i).removeClass("work-item-inactive");
					$(".work-item").eq(i).addClass("work-item-active");
				}
				else{
					$(".work-content-item").eq(i).hide();
					$(".work-item").eq(i).removeClass("work-item-active");
					$(".work-item").eq(i).addClass("work-item-inactive");
				}
			}
		});
		/*控制页面模板的子菜单*/
		$(".page-model-label").eq(0).click(function(){
			for(var i=0;i<8;i++){
				if(i==0){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(1).click(function(){
			for(var i=0;i<8;i++){
				if(i==1){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(2).click(function(){
			for(var i=0;i<8;i++){
				if(i==2){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(3).click(function(){
			for(var i=0;i<8;i++){
				if(i==3){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(4).click(function(){
			for(var i=0;i<8;i++){
				if(i==4){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(5).click(function(){
			for(var i=0;i<8;i++){
				if(i==5){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(6).click(function(){
			for(var i=0;i<8;i++){
				if(i==6){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		$(".page-model-label").eq(7).click(function(){
			for(var i=0;i<8;i++){
				if(i==7){
					$(".page-model-label").eq(i).removeClass("page-model-label-inactive");
					$(".page-model-label").eq(i).addClass("page-model-label-active");
					$(".page-model-content-item").eq(i).show();
				}else{
					$(".page-model-label").eq(i).removeClass("page-model-label-active");
					$(".page-model-label").eq(i).addClass("page-model-label-inactive");
					$(".page-model-content-item").eq(i).hide();
				}
			}
		});
		/*控制页面模板的子菜单*/
		$(".update-label").eq(0).click(function(){
			for(var i=0;i<2;i++)
			{
				if(i==0){
					$(".update-label").eq(i).removeClass("update-label-inactive");
					$(".update-label").eq(i).addClass("update-label-active");
					$(".update-content").eq(i).show();
				}else{
					$(".update-label").eq(i).removeClass("update-label-active");
					$(".update-label").eq(i).addClass("update-label-inactive");
					$(".update-content").eq(i).hide();
				}
			}
		});
		$(".update-label").eq(1).click(function(){
			for(var i=0;i<2;i++)
			{
				if(i==1){
					$(".update-label").eq(i).removeClass("update-label-inactive");
					$(".update-label").eq(i).addClass("update-label-active");
					$(".update-content").eq(i).show();
				}else{
					$(".update-label").eq(i).removeClass("update-label-active");
					$(".update-label").eq(i).addClass("update-label-inactive");
					$(".update-content").eq(i).hide();
				}
			}
		});
		/*下载表格*/
		$("#downloadExcel").click(function(){
			$.ajax({
                type : "post",//请求方式
                url : "excelCreater",
                timeout : 800000,//超时时间：800秒
                dataType : "json",//设置返回数据的格式
                data:{
                    type:"download"
                },
				success: function(data){
                    var jsondata=$.parseJSON(data);
                    window.location.href="./download/"+jsondata.name;
				},
				error: function(){
					alert("error");
				}
			})
		});

		$(".page-model-content-item-card").click(function(){
			displayOrder.push($(this).attr("id"));
			if(displayOrder.length!=0){
				$(".work-display-model").show();
				$(".work-display-model-default").hide();
			}
			else
			{
				$(".work-display-model-default").show();
				$(".work-display-model").hide();
			}
			$(this).clone().appendTo(".work-display-model");
		});
		/*跳转到数据界面*/
		$(".button").eq(0).click(function(){
			window.open("datableAction.action");
		});
		/*跳转到展示界面*/
		$(".button").eq(1).click(function(){
			window.open("displayShowAction");
		});
		/*保存displayIDorder*/
		$(".button").eq(2).click(function(){
			var schoolName=$("#input-school-name").val();
			var schoolKind=$("#input-school-kind").val();
			var schoolLocation=$("#input-school-location").val();
			if(schoolName==null){
				schoolName="";
			}
			if(schoolKind==null){
				schoolKind="";
			}
			if(schoolLocation==null){
				schoolLocation="";
			}
			$.ajax({
				type:"post",
				url:"displayIDOrder",
				timeout: 800000,
				dataType: "json",
				data:{
					"displayIDOrder":getDisplayIDOrder(),
					"displayDetail":JSON.stringify(jsonDisplay),
					"name":schoolName,
					"kind":schoolKind,
					"location":schoolLocation
				},
				success:function(msg){
					alert("success");
				},
				error:function(){
					alert("failure");
				}
			});
		});
		/*生成测试数据并且下载*/
		$(".button").eq(3).click(function(){
            $.ajax({
                type : "post",//请求方式
                url : "excelCreater",
                timeout : 800000,//超时时间：800秒
                dataType : "json",//设置返回数据的格式
				data:{
                	type:"test"
				},
                success: function(data){
                    var jsondata=$.parseJSON(data);
                    window.location.href="./download/"+jsondata.name;
                },
                error: function(){
                    alert("error");
                }
            })
		});
		$(".wait-close").click(function(){
            document.getElementsByClassName("main-cloth")[0].style.display="none";
		});
		$(".wait-button").click(function(){
            document.getElementsByClassName("main-cloth")[0].style.display="none";
            var key=document.getElementById("wait-hidden-info").innerHTML;
            var tempJSON=jsonDisplay[key];
            tempJSON["title"]=document.getElementById("wait-line-input").value;
            tempJSON["info"]=document.getElementById("wait-line-textarea").value;
		});
    	function getDisplayIDOrder(){
			var displayOrderStr="";
			for(var i=0;i<displayOrder.length;i++){
				if(i==0){
					displayOrderStr+=displayOrder[i];
				}
				else{
					displayOrderStr+=","+displayOrder[i];
				}
			}
			return displayOrderStr;
		}
		/*测试用*/
			for(var i=0;i<4;i++){
				if(i==0){
					$(".work-content-item").eq(i).show();
					$(".work-item").eq(i).removeClass("work-item-inactive");
					$(".work-item").eq(i).addClass("work-item-active");
				}
				else{
					$(".work-content-item").eq(i).hide();
					$(".work-item").eq(i).removeClass("work-item-active");
					$(".work-item").eq(i).addClass("work-item-inactive");
				}
			}
});
function excelSubmit(){
	if(getFileName()=="xls"||getFileName()=="xlsx"){
        var excel_form=document.getElementById("excel_table");
        excel_form.submit();
	}
	else{
		alert("文件格式不正确");
	}
}
function getFileName() {
    var path = document.getElementById("excel_input").value;
    var pos2 = path.lastIndexOf(".");
    var pos = path.substring(pos2+1);
    return pos;
}
function inputDetail(current){
	if(current.parentNode.parentNode.parentNode.className=="work-display"){
		document.getElementsByClassName("main-cloth")[0].style.display="flex";
		document.getElementById("wait-hidden-info").innerHTML=current.parentNode.id;
        var key=current.parentNode.id;
        var tempJSON=jsonDisplay[key];
        document.getElementById("wait-line-input").value=tempJSON["title"];
        document.getElementById("wait-line-textarea").value=tempJSON["info"];
	}
	else{
	}
}
function deleteArray(arr,val){
    while(temp.length>0){temp.pop();}
    var index=0;
    var i;
    for(i=0;i<arr.length;i++){
        if(arr[i]!=val){
            temp[index]=arr[i];
            index++;
        }
    }
    while(arr.length>0){arr.pop();}
    for(i=0;i<temp.length;i++){
        arr.push(temp[i]);
    }
}
function deleteDisplay(current) {
    current.parentNode.style.display="none";
    deleteArray(displayOrder,current.parentNode.id);
}