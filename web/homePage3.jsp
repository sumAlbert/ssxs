<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/5/9
  Time: 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<String> result=(List<String>)session.getAttribute("result");
    int size=(int)session.getAttribute("size");
%>
<!DOCTYPE html>
<html>
<head>
    <title>wy3</title>
</head>
<style type="text/css">
    body{
        margin:0;
        padding:0;
    }
    .main{
        height: 1200px;
        width: 1200px;
        position: relative;
    }
    .point_white{
        height: 1px;
        width: 1px;
        background: hsla(0,0%,100%,.05);
        /*background: white;*/
        /*background: transparent;*/
    }
    .point_transparent{
        height: 1px;
        width: 1px;
        background: transparent;
    }
    .points{
        position: absolute;
        z-index: 2;
        height: 1200px;
        width: 1200px;
        display: flex;
        flex-direction: column;
    }
    .points_line{
        height: 1px;
        width: 100%;
        background: transparent;
        display: flex;
        flex-direction: row;
    }
    img{
        position: absolute;
        z-index: -1;
    }
</style>
<body>
<div class="main" id="main">
    <img src="3.jpg">
    <div class="points" id="points">
        <%for(int n=0;n<size;n++){%>
        <div class="points_line">
            <%for(int m=0;m<size;m++){%>
            <div class="<%=result.get(size*n+m)%>"></div>
            <%}%>
        </div>
        <%}%>
    </div>
</div>
</body>
</html>
