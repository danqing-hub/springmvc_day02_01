<%--
  Created by IntelliJ IDEA.
  com.danqing.com.danqing.domain.User: 丹青
  Date: 2019/9/24
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>
    <h3>入门程序</h3>
    <a href="hello">入门程序</a>
</body>
</html>
--%>
<%--
  Created by IntelliJ IDEA.
  com.danqing.domain.User: 丹青
  Date: 2019/9/27
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试Json</title>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <script type="text/javascript"
            src="js/jquery-1.11.3.min.js">
    </script>
    <script type="text/javascript">
        function testJson() {
            //获取用户名和密码
            var username = $("#username").val();
            var password = $("#password").val();
            $.ajax({
                url : "testJson.action",
                type : "post",
                //data表示发送的数据
                data : JSON.stringify({username:username,password:password}),
                //定义发送请求的数据格式为JSON字符串
                contentType : "application/json;charset=UTF-8",
                // 定义回调相应的数据格式为JSON字符串该属性可以忽略
                dataType : "json",
                //成功相应的结果
                success : function (data) {
                    if(data != null){
                        alert("您输入的用户为："+data.username+"密码为："+data.password);
                    }
                }
            });
        }
    </script>
</head>
<body>
<form>
    用户名:<input type="text" name="username" id="username"><br/>
    密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" id="password"><br/>
    <input type="submit" value="测试JSON交互" onclick="testJson()">
</form>
</body>
</html>

