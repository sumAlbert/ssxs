/**
 * Created by dell2 on 2017/6/10.
 */
var temp=new Array();
var jsonTemps=new Array();
var dbclickLine=new Array();
var changeLine=new Array();
$(document).ready(function(){
    var screenWidth=document.body.clientWidth;
    $(".main-hidden").hide();
    $(".excel-extra-line").hide();
    $(".excel-main").width((screenWidth*0.8-220)*0.9);
    $(".panel-filter-close").click(function(){
        $(".main-hidden").hide();
    });
    $("#menu-button-filter").click(function(){
        $(".main-hidden").show();
    });
    $(".table-info").click(function(){
        $(".table-info-active").removeClass("table-info-active");
        $(this).addClass("table-info-active");
    });
    $(".excel-cell > input").click(function(){
        $(".excel-cell-active").addClass("excel-cell");
        $(".excel-cell-active").removeClass("excel-cell-active");
        $(this).parent().addClass("excel-cell-active");
    });
    $(".excel-cell > input").dblclick(function(){
        var stuID=$(this).parent().parent().attr("id");
        deleteArray(dbclickLine,stuID);
        console.log(stuID);
        dbclickLine.push(stuID);
        $(this).removeAttr("readonly");
        $(this).focus();
        $(this).css({"font-size":"15px"});
    });
    $(".excel-cell > input").blur(function(){
        $(this).attr("readonly","readonly");
        $(this).css({"font-size":"13px"});
    });
    $("input[type='checkbox']").click(function(){
        if($(this).prop("checked")){
            var stuID=$(this).parent().parent().attr("id");
            changeLine.push(stuID);
            $(this).parent().addClass("excel-cell-0-active");
            $(this).parent().parent().addClass("excel-line-active");
        }
        else{
            var stuID=$(this).parent().parent().attr("id");
            deleteArray(changeLine,stuID);
            $(this).parent().removeClass("excel-cell-0-active");
            $(this).parent().parent().removeClass("excel-line-active");
        }
    });
    $("#verify-change").click(function(){
        getJsonTemps(dbclickLine,"change");
    });
    $("#delete-line").click(function(){
        getJsonTemps(changeLine,"delete");
    });

    function getJsonTemps(arr,kind){
        var result="{\"student\":[";
        while(jsonTemps.length>0){jsonTemps.pop();}
        var i;
        for(i=0;i<arr.length;i++){
            getJsonTemp(arr[i]);
        }
        console.log(jsonTemps.length);
        for(i=0;i<jsonTemps.length;i++){
            if(i==0){
                result+=jsonTemps[i];
            }
            else{
                result+=","+jsonTemps[i];
            }
        }
        result+="]}";
        var JSON_result=JSON.parse(result);
        var JSONStr_result=JSON.stringify(JSON_result);
        console.log(JSONStr_result);
        if(kind=="delete"){
            $.ajax({
                type : "post",//请求方式
                url : "dbDeleteSql",
                timeout : 800000,//超时时间：800秒
                dataType : "json",//设置返回数据的格式
                data : {"node":JSONStr_result},
                success : function(data){
                    document.location.reload();
                },
                error : function(){
                    alert("failure");
                }
            });
        }
        else if(kind=="change"){
            $.ajax({
                type : "post",//请求方式
                url : "dbChangeSql",
                timeout : 800000,//超时时间：800秒
                dataType : "json",//设置返回数据的格式
                data : {"node":JSONStr_result},
                success : function(data){
                    document.location.reload();
                },
                error : function(){
                    alert("failure");
                }
            });
        }


    }
    function getJsonTemp(stuID){
        var result="{\"stuID\":\""+stuID+"\"";
        var stuEl=$("#"+stuID).children(".excel-cell-updata");
        stuEl.each(function(){
            var key=$(this).children(".hidden-info").html();
            var value=$(this).children("input").val();
            result+=",\""+key+"\":\""+value+"\"";
        });
        result+="}";
        var result_JSON=JSON.parse(result);
        console.log(result_JSON.stuID);
        jsonTemps.push(result);
    }
});
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