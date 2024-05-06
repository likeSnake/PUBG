<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <%--BootStrop 美化界面--%>
    <!-- 引入 Bootstrap -->
<%--    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>班级信息</small>
                    </h1>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4 column">
                    <%--tbAddBook--%>
                   <%-- <a class="btn btn-primary" href="${pageContext.request.contextPath}"></a>
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}"></a>--%>
                </div>

                <div class="col-md-4 column"></div>
               <%-- <div class="col-md-4 column">
                    &lt;%&ndash;&ndash;%&gt;
                    <form class="form-inline" action="${pageContext.request.contextPath}" method="post" style="float: right">
                        <span style="color: red;font-weight: bold">${error}</span>
                        <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询的">
                        <input type="submit" value="查询" class="btn btn-primary">
                    </form>
                </div>--%>
            </div>

        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>班级号</th>
                            <th>班级名</th>
                            <th>别名</th>
                            <th>姓名</th>
                            <th>语文</th>
                            <th>数学</th>
                            <th>英语</th>
                            <th>总分数</th>
                        </tr>
                    </thead>
                    <%----%>
                    <tbody>
                        <c:forEach var="cl" items="${list}">
                            <tr>
                                <td>${cl.classID}</td>
                                <td>${cl.className}</td>
                                <td>${cl.classJP}</td>
                                <td>${cl.stuName}</td>
                                <td>${cl.chinese}</td>
                                <td>${cl.math}</td>
                                <td>${cl.english}</td>
                                <td>${cl.score}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/hello/updateClass/${cl.classID}/${cl.className}/${cl.classJP}/${cl.stuName}/${cl.chinese}/${cl.math}/${cl.english}/${cl.score}"
                                    >修改</a>
                                    &nbsp; | &nbsp;
                                    <a href="${pageContext.request.contextPath}/hello/deleteClass/${cl.classID}">删除</a>
                                    &nbsp; | &nbsp;
                                    <a href="${pageContext.request.contextPath}/hello/insertClass/">新增</a>

                                </td>
                            </tr>
                        </c:forEach>
                        <script>
                            console.log("11111111111111------------")
                            var getid = ${cl.classID};
                            console.log(getid+"11111111111111------------")
                            function deleteArticle(id){
                                console.log(id+"------------")
                                $(function() {
                                    $.ajax({
                                        <%System.out.println("222222222222222");%>
                                        async: false,
                                        cache: false,
                                        type:"POST",
                                        url:'hello/deleteClass',
                                        data: {getIds:10},
                                        success:function(data){
                                            alert("请求成功!");
                                            alert (data);
                                        }});});}
                        </script>
                    </tbody>
                </table>
            </div>
        </div>

    </div>

</body>
</html>
