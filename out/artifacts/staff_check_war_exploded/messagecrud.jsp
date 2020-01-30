<%@ page import="domain.Message" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/14
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>用户管理</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
    body{
        background-color: white;
    }
</style>
<body>
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
                messages = (ArrayList<Message>) session.getAttribute("messages");
                for(int i=0;i<messages.size();i++){
                    Message message =new Message();
                    message= messages.get(i);
            %>
            <tr class="text-center">
                <td><%=message.getId()%></td>
                <td><%=message.getName()%></td>
                <td><%=message.getAge() %></td>
                <td><%=message.getSex()%></td>
                <td><%=message.getPhone_num()%></td>
                <td><%=message.getIdentity()%></td>
                <td><%=message.getDepart_id()%></td>
                <td><a class = "btn btn-default btn-sm" href = "/searchMessageById?id=<%=message.getId()%>">修改</a></td>
                <td><a class = "btn btn-default btn-sm"href="javascript:warning(<%=message.getId()%>)">删除</a></td>
                <%} %>
            </tr>
            </tbody>
        </table>
    </form>
    <div style="text-align: center">
        <a class = "btn btn-default btn-sm" href = "addmessage.jsp">添加信息</a>
    </div>
</div>
<script>
    function warning(id) {
        var r = confirm("确认删除该条信息？");
        if(r = true){
            window.location.href="/deleteMessage?id="+id;
        }else{
            return false;
        }
    }
</script>
</body>
</body>
</html>
