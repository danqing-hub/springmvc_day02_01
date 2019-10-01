<%--
  Created by IntelliJ IDEA.
  com.danqing.domain.User: 丹青
  Date: 2019/9/24
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="findOrdersWithUser" method="post">
        订单编号：<input type="text" name="ordersId"/><br>
        所属用户：<input type="text" name="user.username"><br>
        <input type="submit" value="查询">
    </form>
</body>
</html>
