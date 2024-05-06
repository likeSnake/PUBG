<%--
  Created by IntelliJ IDEA.
  User: 可乐
  Date: 2022/10/9
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form class="login_main" method="post" action="/hello/deleteClass2">
        <p class="login_info">删除</p>
        <input class="classID" type="number" name="classID" placeholder="需要删除的班级id" required>
        <button class="insert_btn" type="submit">删除</button>
    </form>
</center>
</body>
</html>
