/**
 * Created by dell2 on 2017/6/10.
 */
$(document).ready(function(){
    var screenWidth=document.body.clientWidth;
    $(".main-hidden").hide();
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
            $(this).parent().addClass("excel-cell-0-active");
            $(this).parent().parent().addClass("excel-line-active");
        }
        else{
            $(this).parent().removeClass("excel-cell-0-active");
            $(this).parent().parent().removeClass("excel-line-active");
        }
    });
});