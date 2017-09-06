<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/commonjspheading.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="content-type" content="text/html;charset=UTF-8">
    <title>User</title>
    <script type="text/javascript" src="${path}/resource/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript">
    function getPP() {
        var username = $("#username").val();
        if (username == null || username == "") {
            $("#pp").text("你得先输入osu!ID啊。");
        } else if (username.length < 3) {
            $("#pp").text("妈嗨你ID这么靓啊？");
        } else {
//             $.post("${path}/u/pp.req", {"username": username}, function(data) {
//             	if (!isNaN(data)) {
//             		data += "pp";
//             	}
//                 $("#pp").text(data);
//             });
            $("#f").submit();
        }
    }
    </script>
</head>
<body>
    <h2>${error}</h2>
    <form id="f" action="${path}/user/info.html" method="post">
        <input id="username" name="u" type="text" placeholder="输入你的osu!ID"/>
        <input type="button" value="点击" onclick="getPP();"/>
    </form>
    <h2 id="pp"></h2>
</body>
</html>
