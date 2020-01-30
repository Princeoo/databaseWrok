<%@ page import="domain.Working" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/26
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<tbody>

<div class="container" style="width: 400px;">
    <form action="/updateWorking" method="post">
        <%
            ArrayList<Working> workings = new ArrayList<>();
            workings = (ArrayList<Working>) session.getAttribute("workingbyid");
            Working working =new Working();
            for(int i=0;i < workings.size();i++){
                working = workings.get(i);
            }
        %>
        <div class="form-group">
            <label for="id">ID：</label>
            <input type="text" class="form-control col-10" id="id" name="id"  value="<%=working.getId()%>" readonly="readonly">
        </div>

        <div class="form-group">
            <label for="year">年份：</label>
            <input type="text" class="form-control" value="<%=working.getYear()%>" id="year" name="year" placeholder="请输入年份">
        </div>

        <div class="form-group">
            <label for="month">月份：</label>
            <input type="text" class="form-control" value="<%=working.getMonth()%>" id="month" name="month" placeholder="请输入月份">
        </div>

        <div class="form-group">
            <label for = "depart_id">部门ID：</label>
            <input type="text" class="form-control" value="<%=working.getDepart_id()%>" id="depart_id" name="depart_id" placeholder="请输入部门ID">
        </div>

        <div class="form-group">
            <label for="late_day">迟到天数：</label>
            <input type="text" class="form-control" value="<%=working.getLate_day()%>" id="late_day" name="late_day" <%--readonly="readonly"--%>placeholder="请输入迟到天数">
        </div>

        <div class="form-group">
            <label for="early_day">早退天数：</label>
            <input type="text" class="form-control" value="<%=working.getEarly_day()%>" id="early_day" name="early_day"<%--readonly="readonly"--%> placeholder="请输入早退天数">
        </div>

        <div class="form-group">
            <label for="leave_day">请假天数：</label>
            <input type="text" class="form-control" value="<%=working.getLeave_day()%>" id="leave_day" name="leave_day" <%--readonly="readonly"--%>placeholder="请输入请假天数">
        </div>

        <div class="form-group">
            <label for="add_hours">加班小时：</label>
            <input type="text" class="form-control" value="<%=working.getAdd_hour()%>" id="add_hours" name="add_hours" <%--readonly="readonly"--%> placeholder="请输入加班小时">
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
        </div>
    </form>
</div>
</body>
</html>
