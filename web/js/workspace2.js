/**
 * Created by dell2 on 2017/6/6.
 */
$(document).ready(function(){
    var pre_kind_info=$("#pre_kind_info").html();
    if(pre_kind_info==1){
        $.ajax({
            type: "post",
            url: "excelEnterSql",
            dataType: "json",
            success: function(msg){
                alert(msg);
            },
            error:function(){
                alert(error);
            }
        });
    }
});