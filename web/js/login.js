/**
 * Created by dell2 on 2017/6/11.
 */
$(document).ready(function(){
    $(".main-cloth").hide();
    $(".head-forget").eq(0).click(function(){
        $(".main-cloth").show();
        $(this).hide();
        $(".head-forget").eq(1).show();
        $("input[name='kind']").val("1");
        $(".login-line-button").html("Register");
        $(".main-cloth").hide();
    });
    $(".head-forget").eq(1).click(function(){
        $(".main-cloth").show();
        $(this).hide();
        $(".head-forget").eq(0).show();
        $("input[name='kind']").val("0");
        $(".login-line-button").html("Login");
        $(".main-cloth").hide();
    });
    $(".login-line-button").click(function(){
        $("#login-box").submit();
    });
});