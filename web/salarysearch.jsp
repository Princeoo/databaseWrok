<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.Salary" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/14
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>查询工资</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<style>
    body{
        background-color: white;
    }
</style>
<body>
<div class="container container-small">
    <form name="form" method="post">
        <table class="table">
            <caption><strong>工资信息</strong></caption>
            <thead>
            <tr>
                <th >ID</th>
                <th >年份</th>
                <th >月份</th>
                <th >部门ID</th>
                <th >基本工资</th>
                <th >住房补贴</th>
                <th >应发金额</th>
                <th >应扣金额</th>
                <th >实发金额</th>

            </thead>
            <tbody>
            <%
                ArrayList<Salary> salaries =new ArrayList<>();
                salaries = (ArrayList<Salary>) session.getAttribute("salary");
                for(int j = 0; j < salaries.size(); j++){
                    Salary salary =new Salary();
                    salary = salaries.get(j);
            %>
            <tr>
                <td><%=salary.getId()%></td>
                <td><%=salary.getYear()%></td>
                <td><%=salary.getMonth()%></td>
                <td><%=salary.getDepart_id()%></td>
                <td><%=salary.getBase_pay()%></td>
                <td><%=salary.getHouse_add()%></td>
                <td><%=salary.getShould_pay()%></td>
                <td><%=salary.getDeduct_pay()%></td>
                <td><%=salary.getActual_pay()%></td>
                <%} %>
            </tr>
            </tbody>
        </table>
    </form>
</div>

</body>
</html>
