<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/11/17
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>注册</title>
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

    #join {
        background-color: white;
        border: white solid;
        border-radius: 8px;
        padding-top: 30px;
        padding-bottom: 40px;
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
    #mm-label1 {
        text-align: center;
        line-height: 30px;
        padding-right: 0px;
        margin-right: 0px;
    }
    #login-sumbit{
        margin-top: 30px;
        width: 280px;
        background-image: linear-gradient(to right, #ffe4b5, #48d1cc);
    }
    #id-label {
        text-align: center;
        line-height: 30px;
        padding-right: 0px;
        margin-right: 0px;
    }
    #sign-in{
        color: black;
        margin-left: 175px;
    }
</style>
<body>
<div class="container container-small">
    <br><br><br>
    <div class="col-md-4"></div>
    <div class="col-md-4" id="join">
        <h1 id="dl">注册</h1>
        <br><br>
        <form action="/add" method="post" name=form role="form"
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
                <span class="col-sm-1 glyphicon glyphicon-lock" id="mm-label1"></span>
                <div class="col-sm-11">
                    <input type="password" class="form-control" placeholder="请再次输入您的密码"
                           name="pwdcheck">
                </div>
                <br>
                <br>
                <span class="col-sm-1 glyphicon glyphicon-font" id="id-label"></span>
                <div class="col-sm-11">
                    <input type="text" class="form-control" placeholder="请输入您的id号（仅需用户输入）"
                           name="id">
                </div>
                <br>
                <br>
                <div class="text-center">
                    <div class="radio">
                        <label> <input type="radio" name="identity" value="用户" checked>用户&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            <input type="radio" name="identity" value="管理员">管理员
                        </label>
                    </div>
                </div>

                <div class="row sumbit">
                    <div class="form-group">
                        <div class="text-center">
                            <input type="submit" value="立即注册" name=sumbit id = "login-sumbit" class="btn btn-default">
                        </div>
                    </div>
                </div>
                <br>

            </div>
        </form>
    </div>
    <div class="col-md-4"></div>
</div>

</body>
</html>

