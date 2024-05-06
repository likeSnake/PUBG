<%--
  Created by IntelliJ IDEA.
  User: 可乐
  Date: 2022/10/9
  Time: 6:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form class="login_main" method="post" >
        <p class="login_info">修改</p>
        <%request.getParameter("id");%>
        <input class="className" type="text" name="username" placeholder="新班级名" required>
        <input class="classID" type="text" name="password" placeholder="新班级代码" required>
        <input class="classJP" type="text" name="password" placeholder="新别名" required>
        <button class="insert_btn" type="submit">修改</button>
    </form>
</center>
</body>
</html>
