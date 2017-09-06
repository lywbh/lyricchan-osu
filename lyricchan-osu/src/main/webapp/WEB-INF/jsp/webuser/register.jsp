<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title>注册</title>
</head>
<body>
    <h1>注册</h1>
    <h2>${error}</h2>
    <form action="${path}/webuser/doregister.html" method="post">
        <span>用户名（数字字母）：</span><input name="username" value='<c:if test="${web_user!=null}">${web_user.username}</c:if>'/><br>
        <span>称呼名：</span><input name="name" value='<c:if test="${web_user!=null}">${web_user.name}</c:if>'/><br>
        <span>密码：</span><input type="password" name="password"/><br>
        <span>确认密码：</span><input type="password"/><br>
        <span>绑定QQ号：</span><input type="text" name="qq_number" value='<c:if test="${web_user!=null}">${web_user.qq_number}</c:if>'/><br>
        <span>绑定osu!ID：</span><input type="text" name="osu_id" value='<c:if test="${web_user!=null}">${web_user.osu_id}</c:if>'/><br>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
