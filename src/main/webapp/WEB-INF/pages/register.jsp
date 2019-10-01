<%--
  Created by IntelliJ IDEA.
  com.danqing.domain.User: 丹青
  Date: 2019/9/24
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/springmvc_day01_01/registerUser" method="post">
        用户名：<input type="text" name="username"/><br/>
        密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="password"/><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
