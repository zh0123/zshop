<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>我的购物车</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/iconfont/iconfont.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/zshop.js"></script>
</head>

<body>
<jsp:include page="top3.jsp"/>
    <!-- content start -->

    <!-- content end-->
    <!-- footers start -->
<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <div class="page-header" style="margin-bottom: 0px;">
                <h3>我的购物车</h3>
            </div>
        </div>
    </div>

        <table class="table table-hover table-striped table-bordered">
            <c:forEach items="${cart}" var="cart">
            <tr>
                <th>
                    <input type="checkbox" id="all">
                </th>

                <th>商品名称</th>
                <th>商品图片</th>
                <th>商品数量</th>
                <th>尺寸</th>
                <th>商品总价</th>
                <th>收货地址</th>
                <th>操作</th>
            </tr>
            <tr>
                <td>
                    <input type="checkbox">
                </td>

                <td>${cart.name}</td>
                <td>
                    <img src="${pageContext.request.contextPath}/front/product/getImage?path=${cart.image}" alt="" width="60" height="60">
                </td>
                <td>
                        ${cart.mounty}
                </td>
                <td>${cart.size}</td>
                <td>${cart.price}</td>
                <td>${cart.address}</td>
                <td>
                    <button class="btn btn-success" type="button"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>
                        <a class="btn btn-danger" href="${pageContext.request.contextPath}/front/customer/deleteProduct?id=${cart.id}"> 删除 </a>
                </td>
            </tr>
            </c:forEach>
            <tr>
                <td colspan="7" align="right">
                    <button class="btn btn-warning margin-right-15" type="button"> 删除选中项</button>
                    <button class="btn btn-warning  margin-right-15" type="button"> 清空购物车</button>
                    <button class="btn btn-warning margin-right-15" type="button"> 继续购物</button>
                    <a href="order.jsp">
                        <button class="btn btn-warning " type="button"> 结算</button>
                    </a>
                </td>
            </tr>
            <tr>
                <td colspan="7" align="right" class="foot-msg">
                    总计： <b><span>1000</span> </b>元
                </td>
            </tr>

        </table>

</div>
<div class="footers">
    版权所有：邹华
</div>
<!-- footers end -->


</body>

</html>