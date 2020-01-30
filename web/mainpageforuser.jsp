<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/27
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户首页</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<style>
    .nav > li {
        text-align: center;
    }

    .nav > li > a {
        color: #444;
        margin: 0 5px;
    }

    .nav-pills > li.active > a, .nav-pills > li.active > a:focus, .nav-pills > li.active > a:hover {
        background-color: #222222;
    }

    /* 主体样式 */
    body {
        width: 100%;
        height: 100%;
        margin: 0;
        overflow: hidden;
        background-color: #FFFFFF;

    }

    .pageSidebar {
        width: 240px;
        height: 100%;
        padding-bottom: 30px;
        overflow: auto;
        background-color: #f5f5f5;
    }

    .splitter {
        width: 5px;
        height: 100%;
        bottom: 0;
        left: 240px;
        position: absolute;
        overflow: hidden;
        background-color: white;
    }

    .pageContent {
        height: 100%;
        min-width: 768px;
        left: 246px;
        top: 0;
        right: 0;
        z-index: 3;
        padding-bottom: 30px;
        position: absolute;
    }

    .pageContainer {
        bottom: 0;
        left: 0;
        right: 0;
        top: 53px;
        overflow: auto;
        position: absolute;
        width: 100%;
    }

    .footer {
        width: 100%;
        height: 30px;
        line-height: 30px;
        margin-top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        position: absolute;
        z-index: 10;
        background-color: #f5f5f5;
    }

    #per-mes {
        width: 25%;
        height: 100%;
        color: #9d9d9d;
        line-height: 50px;
        margin-left: 500px;
    }

    li {
        list-style: none;
    }

    a {
        text-decoration: none;
    }

    a:focus, a:hover {
        color: #23527c;
        text-decoration: none;
    }

    li:hover {
        list-style: none;
    }

</style>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" title="logoTitle" href="#">员工工资管理系统</a>
        </div>
        <div class="collapse navbar-collapse">
            <%
            HttpSession session1 = request.getSession();
                Object username = session1.getAttribute("username");
            %>
            <div class="navbar-right" id="per-mes">你好，<%=username%>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <a href="login.jsp" style="color: #9d9d9d">退出登录</a>
            </div>
        </div>
    </div>
</nav>

<!-- 中间主体内容部分 -->
<div class="pageContainer">
    <!-- 左侧导航栏 -->
    <div class="pageSidebar">
        <ul class="nav nav-stacked">
            <%--        <ul class="nav nav-stacked nav-pills">--%>
            <li role="presentation" id="left-nav" class="active">
                <a data-toggle="collapse" data-target="#list" style="color: black">考勤信息</a>
                <ul id="list" class="collapse in">
                    <li class="active">
                        <a href="/finduserworking" style="color: black" target="mainFrame">查询考勤</a>
                    </li>

                </ul>
            </li>
            <li role="presentation"><a data-toggle="collapse" data-target="#list1"
                                       style="color: black">工资信息</a>
                <ul id="list1" class="collapse in">
                    <li class="active">
                        <a href="/findusersalary" style="color: black" target="mainFrame">查询工资</a>
                    </li>

                </ul>
            </li>

            <li role="presentation"><a data-toggle="collapse" data-target="#list2"
                                       style="color: black">员工管理</a>
                <ul id="list2" class="collapse in">
                    <li class="active">
                        <a href="/findusermessage" style="color: black" target="mainFrame">查询员工</a>
                    </li>
                </ul>
            </li>

            <li role="presentation"><a data-toggle="collapse" data-target="#list3"
                                       style="color: black">用户管理</a>
                <ul id="list3" class="collapse in">
                    <li class="active">
                        <a href="/findinforbyun" style="color: black" target="mainFrame">个人信息</a>
                    </li>

                </ul>
            </li>

        </ul>
    </div>

    <!-- 左侧导航和正文内容的分隔线 -->
    <div class="splitter"></div>
    <!-- 正文内容部分 -->
    <div class="pageContent">
        <iframe src="welcome.jsp" id="mainFrame" name="mainFrame"
                frameborder="0" width="100%" height="100%" frameBorder="0">
        </iframe>
    </div>

</div>
<!-- 底部页脚部分 -->
<div class="footer">
    <p class="text-center">
        联系电话：020-8686886&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp联系邮箱：6868668@qq.com
    </p>
</div>

<script type="text/javascript">
    $(".nav li").click(function () {
        $(".active").removeClass('active');
        $(this).addClass("active");
    });


</script>

</body>
</html>
