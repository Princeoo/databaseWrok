<%@ page import="domain.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/27
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询用户</title>
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
            <caption><strong>查询用户</strong></caption>
            <thead>
            <tr>
                <th >账户</th>
                <th >密码</th>

            </thead>
            <tbody>
            <%
                ArrayList<User> users =new ArrayList<>();
                users = (ArrayList<User>) session.getAttribute("users");
                for(int j = 0; j < users.size(); j++){
                    User user =new User();
                    user = users.get(j);
            %>
            <tr>
                <td><%=user.getUsername()%></td>
                <td>*******</td>
                <%} %>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
