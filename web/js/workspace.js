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
				success: function(data){
                    var jsondata=$.parseJSON(data);
                    window.location.href="./download/"+jsondata.name;
				},
				error: function(){
					alert("error");
				}
			})
		});
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