<%--
  Created by IntelliJ IDEA.
  User: 可乐
  Date: 2022/10/9
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<center>
<form class="login_main" method="post" action="/hello/insertClass2">
    <p class="login_info">新增</p>
    <input class="className" type="text" name="classname" placeholder="班级名" required>
    <input class="classID" type="number" name="classID" placeholder="班级代码" required>
    <input class="classJP" type="text" name="classJP" placeholder="别名" required>
    <input class="stuName" type="text" name="stuName"  placeholder="姓名"required>
    <input class="chinese" type="number" name="chinese" placeholder="语文" required>
    <input class="math" type="number" name="math"  placeholder="数学"required>
    <input class="english" type="number" name="english" placeholder="英语" required>
    <input class="score" type="number" name="score" placeholder="总分" required>
    <button class="insert_btn" type="submit">添加</button>
</form>
</center>
</body>
</body>
</html>
