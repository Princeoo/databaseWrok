<%@ page import="domain.Message" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/28
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询员工</title>
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
            <caption><strong>个人信息</strong></caption>
            <thead>
            <tr class="text-center">
                <th >ID</th>
                <th >姓名</th>
                <th >年龄</th>
                <th >性别</th>
                <th >手机号</th>
                <th >身份证号</th>
                <th >部门ID</th>

            </thead>
            <tbody>
            <%
                ArrayList<Message> messages=new ArrayList<>();
                messages = (ArrayList<Message>) session.getAttribute("mbi");
                for(int i=0;i<messages.size();i++){
                    Message message =new Message();
                    message= messages.get(i);
            %>
            <tr>
                <td><%=message.getId()%></td>
                <td><%=message.getName()%></td>
                <td><%=message.getAge() %></td>
                <td><%=message.getSex()%></td>
                <td><%=message.getPhone_num()%></td>
                <td><%=message.getIdentity()%></td>
                <td><%=message.getDepart_id()%></td>

                <%} %>
            </tr>
            </tbody>
        </table>
    </form>

</div>

</body>
</html>
