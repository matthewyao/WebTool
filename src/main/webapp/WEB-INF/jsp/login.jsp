<%--
  Created by IntelliJ IDEA.
  User: matthewyao
  Date: 2017/1/4
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

CSSFlow
Dark Login Form
PreviousNext
Twitter
Facebook
RSS
Newsletter
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Dark Login Form</title>
    <link rel="stylesheet" href="../css/login.css">
    <script src="../js/jquery-1.10.2.min.js"></script>
    <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
<form method="post" action="index.html" class="login">
    <p>
        <label for="login">Email:</label>
        <input type="text" name="login" id="login" placeholder="请输入用户名" value="">
    </p>

    <p>
        <label for="password">Password:</label>
        <input type="password" name="password" placeholder="请输入密码" id="password" value="">
    </p>

    <p class="login-submit">
        <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.html">忘记密码?</a></p>
</form>

<section class="about">
    <p class="about-links">
        个人工具站点，请勿模仿和尝试攻击，不然，嘿嘿……
    </p>
    <p class="about-author">
        &copy; 2016&ndash;2017 License to <a href="http://matthewyao.xyz" target="_blank">莫失莫忘</a><br/>
        All rights reserved.
    </p>
</section>
<script type="text/javascript">
    $("#login").click(function () {
        $("#loginform").submit();
    });
</script>
</body>
</html>
