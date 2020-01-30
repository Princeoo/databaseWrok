<%@ page import="domain.Message" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/26
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改员工信息</title>
</head>
<script src="dist/js/jquery-3.4.0.js"></script>
<link href="dist/css/bootstrap.min.css" rel="stylesheet">
<script src="dist/js/bootstrap.min.js"></script>
<body>
    <div class="container" style="width: 400px;">
        <form action="/updateMessage" method="post">
            <%
                ArrayList<Message> messages=new ArrayList<>();
                messages = (ArrayList<Message>) session.getAttribute("messagebyid");
                Message message =new Message();
                for(int i=0;i<messages.size();i++){

                    message= messages.get(i);
                }
            %>
            <div class="form-group">
                <label for="id">ID：</label>
                <input type="text" class="form-control col-10" id="id" name="id"  value="<%=message.getId()%>" readonly="readonly"<%-- placeholder="请输入账号"--%>>
            </div>

            <div class="form-group">

                <label for="name">姓名：</label>
                <input type="text" class="form-control" value="<%=message.getName() %>" id="name" name="name" <%--readonly="readonly"--%> placeholder="请输入姓名">
            </div>

            <div class="form-group">
                <label for="age">年龄：</label>
                <input type="text" class="form-control" value="<%=message.getAge() %>" id="age" name="age" <%--readonly="readonly"--%> placeholder="请输入年龄">
            </div>

            <div class="form-group">
                <label for="sex">性别：</label>
                <input type="text" class="form-control" value="<%=message.getSex() %>" id="sex" name="sex" readonly="readonly"<%-- placeholder="请输入姓名"--%>>
            </div>

            <div class="form-group">
                <label for="phone">电话：</label>
                <input type="text" class="form-control" value="<%=message.getName() %>" id="phone" name="phone" <%--readonly="readonly"--%> placeholder="请输入电话">
            </div>

            <div class="form-group">
                <label for="identity">身份证号：</label>
                <input type="text" class="form-control" value="<%=message.getIdentity() %>" id="identity" name="identity" <%--readonly="readonly"--%> placeholder="请输入身份证号">
            </div>

            <div class="form-group">
                <label for="departID">部门ID：</label>
                <input type="text" class="form-control" value="<%=message.getDepart_id() %>" id="departID" name="departID" <%--readonly="readonly"--%> placeholder="请输入部门ID">
            </div>

            <div class="form-group" style="text-align: center">
                <input class="btn btn-primary" type="submit" value="提交" />
                <input class="btn btn-default" type="reset" value="重置" />
            </div>
        </form>
    </div>
</body>
</html>
