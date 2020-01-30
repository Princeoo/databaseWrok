<%@ page import="domain.Manager" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/28
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员个人信息</title>
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
            <caption><strong>管理员信息</strong></caption>
            <thead>
            <tr>
                <th >账户</th>
                <th >密码</th>

            </thead>
            <tbody>
            <%
                ArrayList<Manager> managers =new ArrayList<>();
                managers = (ArrayList<Manager>) session.getAttribute("managerbyun");
                for(int j = 0; j < managers.size(); j++){
                    Manager manager =new Manager();
                    manager = managers.get(j);
            %>
            <tr>
                <td><%=manager.getUsername()%></td>
                <td><%=manager.getPassword()%></td>
                <%} %>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
