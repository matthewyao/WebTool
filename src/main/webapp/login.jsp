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
</head>
<body>
用户名：<input type="text" id="username" name="username" />
密码：<input type="text" id="password" name="password"/>
<button id="login">登录</button>
<script type="text/javascript">
    $("#login").click(function () {
        alert($("#username").val()+"登录了");
    });
</script>
</body>
</html>
