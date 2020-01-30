<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/26
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container" style="width: 400px;">
    <form action="/addWorking" method="post">
            <div class="form-group">
                <label for="id">ID：</label>
                <input type="text" class="form-control"  id="id" name="id" placeholder="请输入账号">
            </div>

            <div class="form-group">
                <label for="year">年份：</label>
                <input type="text" class="form-control" id="year" name="year" placeholder="请输入年份">
            </div>

            <div class="form-group">
                <label for="month">月份：</label>
                <input type="text" class="form-control" id="month" name="month" placeholder="请输入月份">
            </div>

            <div class="form-group">
                <label for = "depart_id">部门ID：</label>
                <input type="text" class="form-control" id="depart_id" name="depart_id" placeholder="请输入部门ID">
            </div>

            <div class="form-group">
                <label for="late_day">迟到天数：</label>
                <input type="text" class="form-control"  id="late_day" name="late_day" placeholder="请输入迟到天数">
            </div>

            <div class="form-group">
                <label for="early_day">早退天数：</label>
                <input type="text" class="form-control"  id="early_day" name="early_day" placeholder="请输入早退天数">
            </div>

            <div class="form-group">
                <label for="leave_day">请假天数：</label>
                <input type="text" class="form-control"  id="leave_day" name="leave_day" placeholder="请输入请假天数">
            </div>

            <div class="form-group">
                <label for="add_hours">加班小时：</label>
                <input type="text" class="form-control"  id="add_hours" name="add_hours" placeholder="请输入加班小时">
            </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="添加" />
        </div>
    </form>
</div>
</body>
</html>
