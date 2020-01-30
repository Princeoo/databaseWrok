<%@ page import="domain.Working" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/14
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>修改考勤</title>
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
            <caption><strong>考勤信息</strong></caption>
            <thead>
            <tr class="text-center">
                <th >ID</th>
                <th >年份</th>
                <th >月份</th>
                <th >部门ID</th>
                <th >迟到天数</th>
                <th >早退天数</th>
                <th >请假天数</th>
                <th >加班小时</th>

            </thead>
            <tbody>
            <%
                ArrayList<Working> workings =new ArrayList<>();
                workings = (ArrayList<Working>) session.getAttribute("working");
                for(int j = 0; j < workings.size(); j++){
                    Working working =new Working();
                    working= workings.get(j);
            %>
            <tr class="text-center">
                <td><%=working.getId()%></td>
                <td><%=working.getYear()%></td>
                <td><%=working.getMonth()%></td>
                <td><%=working.getDepart_id()%></td>
                <td><%=working.getLate_day()%></td>
                <td><%=working.getEarly_day()%></td>
                <td><%=working.getLeave_day()%></td>
                <td><%=working.getAdd_hour()%></td>
                <td><a class = "btn btn-default btn-sm" href = "/searchWorkingById?id=<%=working.getId()%>">修改</a></td>
                <td><a class = "btn btn-default btn-sm"href="javascript:warning(<%=working.getId()%>)">删除</a></td>
                <%} %>
            </tr>
            </tbody>
        </table>
    </form>
    <div style="text-align: center">
<%--        <button class="btn-default" style="border-radius: 5px; border-color: #adadad" href="addworking.jsp">添加信息</button>--%>
        <a class = "btn btn-default btn-sm" href = "addworking.jsp">添加信息</a>
    </div>
</div>
<script>
    function warning(id) {
        var r = confirm("确认删除该条信息？");
        if(r = true){
            window.location.href="/deleteWorking?id="+id;
        }else{
            return false;
        }
    }
</script>
</body>
</html>
