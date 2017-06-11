<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/6/11
  Time: 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>爱汉语</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0"/>
    <link rel="stylesheet" type="text/css" href="./css/login.css">
</head>
<body>
<div class="main-cloth"></div>
<div class="main">
    <div class="content">
        <div class="head-info head-info-c">高校学生数据可视化分析工具</div>
        <div class="head-info head-info-e">让你十分种数说新生</div>
        <div class="head-between"></div>
        <form class="login-box" method="post" action="index.action" id="login-box">
            <div class="hidden-info">
                <input type="text" value="0" name="kind">
            </div>
            <div class="login-line">
                <div class="login-line-left login-line-left-user"></div>
                <div class="login-line-right">
                    <input type="text" class="login-line-input" placeholder="Email" name="email">
                </div>
            </div>
            <div class="login-line">
                <div class="login-line-left login-line-left-pw"></div>
                <div class="login-line-right">
                    <input type="text" class="login-line-input" placeholder="Password" name="pw">
                </div>
            </div>
            <div class="login-line login-line-button">
                Login
            </div>
        </form>
        <div class="head-info head-forget">没有账号?<span>No account?</span></div>
        <div class="head-info head-forget" style="display: none;">去登录?<span>Go login?</span></div>
    </div>
</div>
</body>
<script type="text/javascript" src="./js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="./js/login.js"></script>
</html>
