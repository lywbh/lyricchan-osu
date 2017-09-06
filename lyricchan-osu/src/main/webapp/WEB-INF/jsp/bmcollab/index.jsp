<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title>Beatmap Collaboration</title>
</head>
<body>
    <h1>Beatmap Collaboration</h1>
    <c:if test="${web_user!=null}">
        <p>欢迎${web_user.name}！</p>
        <c:if test="${web_user.osu!=null}">
            <p>#${web_user.osu.pp_rank}的大触！</p>
            <p>你的PP：${web_user.osu.pp_raw}</p>
            <p>你的PC：${web_user.osu.playcount}</p>
            <p>你的ACC：${web_user.osu.accuracy}</p>
        </c:if>
    </c:if>
    <p>Collab功能还没鸡儿有呢。</p>
    <p>如果你登录得很缓慢，说明ppy的服务器连得很慢，这并不是异步的所以卡了。</p>
    <p>待优化。</p>
</body>
</html>
