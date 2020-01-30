<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/27
  Time: 15:31
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
    <form action="/addSalary" method="post">
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
            <label for="base_pay">基本工资：</label>
            <input type="text" class="form-control"  id="base_pay" name="base_pay" placeholder="请输入基本工资">
        </div>

        <div class="form-group">
            <label for="house_add">住房补贴：</label>
            <input type="text" class="form-control"  id="house_add" name="house_add" placeholder="请输入住房补贴">
        </div>

        <div class="form-group">
            <label for="should_pay">应付工资：</label>
            <input type="text" class="form-control"  id="should_pay" name="should_pay" placeholder="请输入应付工资">
        </div>

        <div class="form-group">
            <label for="deduct_pay">应扣工资：</label>
            <input type="text" class="form-control"  id="deduct_pay" name="deduct_pay" placeholder="请输入应扣工资">
        </div>

        <div class="form-group">
            <label for="actual_pay">实付工资：</label>
            <input type="text" class="form-control"  id="actual_pay" name="actual_pay" placeholder="请输入实付工资">
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="添加" />
        </div>
    </form>
</div>
</body>
</html>
