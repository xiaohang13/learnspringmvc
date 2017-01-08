<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2017/1/8
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Page</title>
    <script src="/static/js/jquery-1.7.2.min.js"></script>
</head>
<body>
    <form action="/emp/save" method="post">
        用户名：<input type="text" name="lastName" />
        <br>
        密  码：<input type="password" name="password" />
        <br>
        Email:<input type="email" name="email" />
        <br>
        性别：<input type="radio" name="gender" value="1" />男 <input type="radio" name="gender" value="0" />女
        <br>
        生日：<input type="text" name="birth" />
        <br>
        工资：<input type="text" name="salary" />
        <br>
        所属部门：
        <select name="department.id">
            <c:forEach items="${departments}" var="dep">
                <option value="${dep.id}">${dep.departmentName}</option>
            </c:forEach>
        </select>
        <br>
        <input type="submit" value="submit">
    </form>
    <script type="text/javascript">
        /*$(function () {
            $.ajax(

            );
        })*/
    </script>
</body>
</html>
