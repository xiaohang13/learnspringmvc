<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2017/1/2
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee table details</title>
    <script src="/static/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                var href = $(this).attr("href");
                $("form").attr("action", href).submit();
                return false;
            });
        })
    </script>
</head>
<body>
<form method="post" action="">
    <input type="hidden" name="_method" value="DELETE"/>
</form>
<c:if test="${empty employees}">
    没有任何员工信息。
</c:if>
<c:if test="${!empty employees}">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>LastName</th>
            <th>Gender</th>
            <th>Department</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <th>${employee.id}</th>
                <th>${employee.lastName}</th>
                <th>${employee.gender == "0" ? "Female" : "Male"}</th>
                <th>${employee.department.departmentName}</th>
                <th><a href="">Edit</a></th>
                <th><a class="delete" href="emp/${employee.id}">Delete</a></th>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
