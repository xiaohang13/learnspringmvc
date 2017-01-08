<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2017/1/8
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Json</title>
    <%@ include file="/WEB-INF/views/common/header.jsp" %>
    <script type="text/javascript">
        $(function () {
            $("#testJson").click(function () {
                var url = this.href;
                var args = {};
                $.post(url, args, function (data) {
                    for (var i=0; i<data.length;i++) {
                        var id = data[i].id;
                        var lastName = data[i].lastName;
                        alert(id + ": " + lastName);
                    }
                });
                return false;
            });
        })
    </script>
</head>
<body>
<a href="/emp/testJson" id="testJson">TestJson</a>
</body>
</html>
