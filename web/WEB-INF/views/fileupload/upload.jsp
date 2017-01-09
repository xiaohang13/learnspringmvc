<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2017/1/9
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
    <h4>文件上传</h4>
    <hr>
    <form action="/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" />
        <br>
        文件描述：<input type="text" name="desc" />
        <br>
        <input type="submit" value="submit" />
    </form>
</body>
</html>
