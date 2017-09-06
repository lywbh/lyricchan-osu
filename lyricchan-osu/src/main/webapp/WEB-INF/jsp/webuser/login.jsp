<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title>登录</title>
</head>
<body>
    <h1>登录</h1>
    <h2>${error}</h2>
    <form action="${path}/webuser/dologin.html" method="post">
        <span>用户名：</span><input name="username"/><br>
        <span>密码：</span><input type="password" name="password"/><br>
        <input type="submit" value="登录"/>
    </form>
    <a href="${path}/webuser/register.html">没有账号？点这里注鸡儿的册</a>
</body>
</html>
