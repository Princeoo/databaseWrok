<%@ page import="domain.Salary" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/27
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改工资</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<style>
    body {
        background-color: white;
    }
</style>
<body>
<tbody>

<div class="container" style="width: 400px;">
    <form action="/updateSalary" method="post">
        <%
            ArrayList<Salary> salaries = new ArrayList<>();
            salaries = (ArrayList<Salary>) session.getAttribute("salarybyid");
            Salary salary = new Salary();
            for (int i = 0; i < salaries.size(); i++) {
                salary = salaries.get(i);
            }
        %>
        <div class="form-group">
            <label for="id">ID：</label>
            <input type="text" class="form-control col-10" id="id" name="id" value="<%=salary.getId()%>"
                   readonly="readonly">
        </div>

        <div class="form-group">
            <label for="year">年份：</label>
            <input type="text" class="form-control" value="<%=salary.getYear()%>" id="year" name="year"
                   placeholder="请输入年份">
        </div>

        <div class="form-group">
            <label for="month">月份：</label>
            <input type="text" class="form-control" value="<%=salary.getMonth()%>" id="month" name="month"
                   placeholder="请输入月份">
        </div>

        <div class="form-group">
            <label for="depart_id">部门ID：</label>
            <input type="text" class="form-control" value="<%=salary.getDepart_id()%>" id="depart_id" name="depart_id"
                   placeholder="请输入部门ID">
        </div>

        <div class="form-group">
            <label for="base_pay">基本工资：</label>
            <input type="text" class="form-control" value="<%=salary.getBase_pay()%>" id="base_pay" name="base_pay"
                   <%--readonly="readonly"--%>placeholder="请输入基本工资">
        </div>

        <div class="form-group">
            <label for="house_add">住房补贴：</label>
            <input type="text" class="form-control" value="<%=salary.getHouse_add()%>" id="house_add"
                   name="house_add"<%--readonly="readonly"--%> placeholder="请输入住房补贴">
        </div>

        <div class="form-group">
            <label for="should_pay">应付工资：</label>
            <input type="text" class="form-control" value="<%=salary.getShould_pay()%>" id="should_pay"
                   name="should_pay" <%--readonly="readonly"--%>placeholder="请输入应付工资">
        </div>

        <div class="form-group">
            <label for="deduct_pay">应扣工资：</label>
            <input type="text" class="form-control" value="<%=salary.getDeduct_pay()%>" id="deduct_pay"
                   name="deduct_pay" <%--readonly="readonly"--%> placeholder="请输入应扣工资">
        </div>

        <div class="form-group">
            <label for="actual_pay">实付工资：</label>
            <input type="text" class="form-control" value="<%=salary.getActual_pay()%>" id="actual_pay"
                   name="actual_pay" <%--readonly="readonly"--%> placeholder="请输入实付工资">
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-default" type="reset" value="重置"/>
        </div>
    </form>
</div>
</body>
</html>