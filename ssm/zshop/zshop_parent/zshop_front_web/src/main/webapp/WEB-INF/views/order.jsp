<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>确认订单</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/iconfont/iconfont.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/zshop.js"></script>
</head>

<body>
<jsp:include page="topOrder.jsp"/>
    <!-- content start -->
    <div class="container">
        <form action="${pageContext.request.contextPath}/front/customer/insertProduct" method="post">
        <div class="row">
            <div class="col-xs-12">
                <div class="page-header" style="margin-bottom: 0px;">
                    <h3>确认订单</h3>
                </div>
            </div>
        </div>
        <table class="table table-hover table-striped table-bordered">
            <tr>
                  <th>商品价格</th>
                <th>商品名称</th>
                <th>商品图片</th>
                <th>商品详情</th>
                <th>商品数量</th>
                <th>商品尺寸</th>

            </tr>

            <tr>
                    <td>${product.price}</td>
                <td>${product.name}</td>
                <td><img src="${pageContext.request.contextPath}/front/product/getImage?path=${product.image}" alt="" width="60" height="60"></td>
                <td>${product.info}</td>
                <td>
                    <input type="text" name="mounty" value="">
                </td>
                <td>
                    <select class="form-control" name="size" id="role">
                        <option value="-1">请选择</option>
                        <option value="xl">xl</option>
                        <option value="xxl">xxl</option>
                        <option value="l">l</option>
                    </select>
                </td>

            </tr>
             <input type="hidden" name="customerName" value="${customer.loginName}"/>
             <input type="hidden" name="name" value="${product.name}"/>
             <input type="hidden" name="image" value="${product.image}"/>
             <input type="hidden" name="info" value="${product.info}"/>
             <input type="hidden" name="price" value="${product.price}"/>
             <input type="hidden" name="address" value="${customer.address}"/>

             <input type="hidden" name="success" value="0"/>


            <tr>
                <td colspan="5" class="foot-msg">

                    <a href="cart.jsp">
                        <button class="btn btn-warning pull-right ">返回</button>
                    </a>
                    <input type="submit" class="btn btn-warning pull-right margin-right-15" data-toggle="modal" data-target="#buildOrder" value="加入购物车" ></input>
                </td>
            </tr>
        </table>
        </form>
    </div>
    <!-- content end-->
    <div class="modal fade" id="buildOrder" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">提示消息</h4>
                </div>
                <div class="orderMsg">
                    <p>
                        订单生成成功！！
                    </p>
                    <p>
                        订单号：<span>12345679</span>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <!-- footers start -->
    <div class="footers">
        版权所有：南京网博
    </div>
    <!-- footers end -->
    <!-- 修改密码模态框 -->
    <div class="modal fade" id="modifyPasswordModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">修改密码</h4>
                </div>
                <form action="" class="form-horizontal" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">原密码：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">新密码：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">重复密码：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-warning" data-dismiss="modal" aria-label="Close">关&nbsp;&nbsp;闭</button>
                        <button type="reset" class="btn btn-warning">重&nbsp;&nbsp;置</button>
                        <button type="submit" class="btn btn-warning">修&nbsp;&nbsp;改</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- 登录模态框 -->
    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">登&nbsp;陆</h4>
                </div>
                <form action="" class="form-horizontal" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">登录帐号：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">密码：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">验证码：</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                            <div class="col-sm-2 input-height">
                                1234
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-warning" data-dismiss="modal" aria-label="Close">关&nbsp;&nbsp;闭</button>
                        <button type="reset" class="btn btn-warning">重&nbsp;&nbsp;置</button>
                        <button type="submit" class="btn btn-warning">登&nbsp;&nbsp;陆</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- 注册模态框 -->
    <div class="modal fade" id="registModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">会员注册</h4>
                </div>
                <form action="" class="form-horizontal" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户姓名:</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">登陆账号:</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">登录密码:</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">联系电话:</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">联系地址:</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-warning" data-dismiss="modal" aria-label="Close">关&nbsp;&nbsp;闭</button>
                        <button type="reset" class="btn btn-warning">重&nbsp;&nbsp;置</button>
                        <button type="submit" class="btn btn-warning">注&nbsp;&nbsp;册</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>