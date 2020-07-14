<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>个人中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/iconfont/iconfont.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/zshop.js"></script>
</head>

<body>
<jsp:include page="top4.jsp"/>
    <!-- content start -->
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="page-header" style="margin-bottom: 0px;">
                    <h3>基本资料</h3>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/front/customer/modify" method="post">
            <div class="form-group" >
                <input type="hidden"  name="id" value="${customer.id}">
                <label for="name" class="col-md-2  col-sm-2 control-label">用户姓名:</label>
                <div class="col-md-8 col-sm-10">
                    <input type="text" class="form-control" id="name" name="name"  placeholder="用户姓名" readonly="readonly" value="${customer.loginName}">
                </div>
            </div>
            <div class="form-group">
                <label for="loginName" class="col-md-2 col-sm-2 control-label">登陆账号:</label>
                <div class="col-md-8  col-sm-10">
                    <input type="text" class="form-control" id="loginName" name="loginName" placeholder="登陆账号" readonly="readonly" value="${customer.name}">
                </div>
            </div>
            <div class="form-group">
                <label for="phone" class="col-md-2  col-sm-2 control-label">联系电话:</label>
                <div class="col-md-8 col-sm-10">
                    <input type="text" class="form-control" id="phone" name="phone" placeholder="联系电话" value="${customer.phone}">
                </div>
            </div>
            <div class="form-group">
                <label for="address" class="col-md-2   col-sm-2  control-label">联系地址:</label>
                <div class="col-md-8 col-sm-10">
                    <input type="text" class="form-control" id="address" name="address" placeholder="联系电话" value="${customer.address}">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" class="btn btn-warning" value="确认修改">
                </div>
            </div>
        </form>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="page-header" style="margin-bottom: 0px;">
                    <h3>修改头像</h3>
                </div>
            </div>
        </div>
        <form action="" class="form-horizontal">
            <div class="form-group">
                <label for="address" class="col-md-2   col-sm-2  control-label">选择头像:</label>
                <div class="col-md-10 col-sm-10">
                    <img src="${pageContext.request.contextPath}/images/add.png" id="showImg" class="togeImg" onclick="openFile()" alt="" width="100" height="100">
                    <input id="file" type="file" style="display: none;" name="imgName" />
                    <script>
                    function openFile() {
                        $("#file").click();
                    }
                    $('#file').change(function() {
                        $("#showImg").attr("src", window.URL.createObjectURL(this.files[0]));
                    });
                    </script>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-warning">确认修改</button>
                </div>
            </div>
        </form>
    </div>
    <!-- content end-->
    <!-- footers start -->
    <div class="footers">
        版权所有：南京网博
    </div>
    <!-- footers end -->

</body>

</html>