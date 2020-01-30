<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/6
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>登录</title>
    <script src="dist/js/jquery-3.4.0.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<style>
    body {
        background: url("img/bgImg.jpg") no-repeat center 0;
    }

    .container container-samll {
        border: white solid;
    }

    #login {
        background-color: white;
        border: white solid;
        border-radius: 8px;
        padding-top: 60px;
        padding-bottom: 60px;
    }

    #dl {
        text-align: center;
    }

    #yhm-label {
        text-align: center;
        line-height: 30px;
        padding-right: 0px;
        margin-right: 0px;
    }

    #mm-label {
        text-align: center;
        line-height: 30px;
        padding-right: 0px;
        margin-right: 0px;
    }

    #login-sumbit {
        margin-top: 30px;
        width: 280px;
        background-image: linear-gradient(to right, #ffe4b5, #48d1cc);
    }

    #sign-in {
        color: black;
        margin-left: 175px;
    }
</style>
<body>
<div class="container container-small">
    <br><br><br>
    <div class="col-md-4"></div>
    <div class="col-md-4" id="login">
        <h1 id="dl">登录</h1>
        <br><br>
        <form action="/check" method="post" name=form role="form"
              class="form-horizontal">
            <div class="form-group">
                <span class="col-sm-1 glyphicon glyphicon-user" id="yhm-label"></span>
                <div class="col-sm-11">
                    <input type="text" class="form-control" style="margin-left: 0px" placeholder="请输入您的账号" name="name">
                </div>
                <br>
                <br>
                <br>
                <span class="col-sm-1 glyphicon glyphicon-lock" id="mm-label"></span>
                <div class="col-sm-11">
                    <input type="password" class="form-control" placeholder="请输入您的密码"
                           name="pwd">
                </div>
                <br>
                <br>
                <br>

                <div class="row">
                    <div class="col-md-8"></div>
                    <div class="col-md-4">
                        <a href="#" style="color: black">忘记密码？</a>
                    </div>
                </div>
                <div class="row sumbit">
                    <div class="form-group">
                        <div class="text-center">
                            <input type="submit" value="登录" name=sumbit id="login-sumbit" class="btn btn-default">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row">
                    <a href="join.jsp" id="sign-in">立即注册</a>
                </div>
            </div>
        </form>
    </div>
    <div class="col-md-4"></div>
</div>

</body>
</html>
