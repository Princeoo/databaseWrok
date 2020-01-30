<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/26
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="container" style="width: 400px;">
    <form action="/addMessage" method="post">
       <%-- <div class="form-group">
            <label for="id">ID：</label>
            <input type="text" class="form-control" id="id" name="id" placeholder="请输入账号">
        </div>--%>

        <div class="form-group">

            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
        </div>

        <div class="form-group">
            <label for="sex">性别：</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
        </div>

        <div class="form-group">
            <label for="phone">电话：</label>
            <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入电话">
        </div>

        <div class="form-group">
            <label for="identity">身份证号：</label>
            <input type="text" class="form-control" id="identity" name="identity" placeholder="请输入身份证号">
        </div>

        <div class="form-group">
            <label for="departID">部门ID：</label>
            <input type="text" class="form-control" id="departID" name="departID" placeholder="请输入部门ID">
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="添加" />
        </div>
    </form>
</div>
</body>
</html>
