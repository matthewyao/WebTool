<%--
  Created by IntelliJ IDEA.
  User: matthewyao
  Date: 2017/1/4
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="../../static/css/jquery-1.10.2.min.js"></script>
</head>
<body>
<form id="loginForm" action="/user/login" method="post">
    用户名：<input type="text" id="username" name="username" /><br/><br/>
    密码：<input type="password" id="password" name="password"/><br/><br/>
    <button id="login">登录</button>
</form>
<script type="text/javascript">
    $("#login").click(function () {
        $("#loginform").submit();
    });
</script>
</body>
</html>
