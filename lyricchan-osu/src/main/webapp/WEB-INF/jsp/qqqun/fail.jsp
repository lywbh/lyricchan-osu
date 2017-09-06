<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title>FAIL</title>
    <script type="text/javascript" src="${path}/resource/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript">$(function(){$("#sub").click(function(){location.href="${path}/qqqun/"+$("#qunnumber").val()+".html";});});</script>
</head>
<body>
    <p>${error}</p>
    <p>可以尝试手动输入群号来访问：<input type="text" id="qunnumber"/><input type="button" id="sub" value="提交"/></p>
</body>
</html>
