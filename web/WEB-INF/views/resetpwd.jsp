<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2017/1/1
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reset Pwd</title>
</head>
<body>
    <p>Reset Password</p>
    <form action="/user/resetpwd" method="post">
        <input type="hidden" name="id" value="1"/>
        用户名：<input type="text" name="username" />
        <br>
        Email：<input type="email" name="email" />
        <br>
        年  龄：<input type="text" name="age" />
        <br>
        <input type="submit" value="submit" />
    </form>
</body>
</html>
