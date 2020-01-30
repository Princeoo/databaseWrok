<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/27
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
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
                <th >账户</th>
                <th >密码</th>

            </thead>
            <tbody>
            <%
                if()
                ArrayList<Message> messages=new ArrayList<>();
                messages = (ArrayList<Message>) session.getAttribute("messages");
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
