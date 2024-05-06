<%--
  Created by IntelliJ IDEA.
  User: 可乐
  Date: 2022/10/9
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
  <form class="login_main" method="post" action="/hello/updateClass2">
    <p class="login_info">修改</p>
    mo
    <%--<input class="ID" type="number" name="ID" placeholder="需要修改的班级代码" required><br><br>--%>
    <input class="className" type="text" name="classname"  value=${className}required>
    <input class="classID" type="number" name="newClassID" value=${classId} required>
    <input class="classJP" type="text" name="classJP" value=${classJP} required>
    <input class="stuName" type="text" name="stuName"  value=${stuName} required>
    <input class="chinese" type="number" name="chinese"  value=${chinese} required>
    <input class="math" type="number" name="math"  value=${math} required>
    <input class="english" type="number" name="english"  VALUE=${english} required>
    <input class="score" type="number" name="score"  value=${score} required>
    <button class="insert_btn" type="submit">修改</button>
  </form>
</center>
</body>
</html>
