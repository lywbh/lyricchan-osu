<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title><c:if test="${qqqun!=null}"><c:if test="${qqqun.name!=null}">${qqqun.name}</c:if><c:if test="${qqqun.name==null}">${qqqun.number}</c:if></c:if><c:if test="${qqqun==null}">null</c:if></title>
</head>
<body>
    <h1>QQ群信息页</h1>
    <p>群名称：${qqqun.name}</p>
    <p>群号码：${qqqun.number}</p>
    <p>群介绍：本群成立于${qqqun.formday}。${qqqun.introduction}</p>
</body>
</html>
