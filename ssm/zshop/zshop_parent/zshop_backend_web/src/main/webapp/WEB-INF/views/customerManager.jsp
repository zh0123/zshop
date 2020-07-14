<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>backend</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/userSetting.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
    <script src="${pageContext.request.contextPath}/layer/layer.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zshop.css">
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/css/index.css" />
    <script>
        $(function(){
            //分页
            $('#pagination').bootstrapPaginator({
                bootstrapMajorVersion:3,
                currentPage:${pageInfo.pageNum},
                totalPages:${pageInfo.pages},
                itemTexts:function(type,page,current){
                    switch (type) {
                        case "first":
                            return "首页";
                        case "prev":
                            return "上一页";
                        case "next":
                            return "下一页";
                        case "last":
                            return "末页";
                        case "page":
                            return page;
                    }
                },
                pageUrl:function(type,page,current){
                    return '${pageContext.request.contextPath}/backend/customerSysuser/findAll?pageNum='+page;
                }
            })


        });
        //服务端提示消息
        let successMsg='${successMsg}';
        let errorMsg='${errorMsg}';
        if(successMsg!=''){
            layer.msg(successMsg,{
                time:2000,
                skin:'successMsg'
            })
        }
        if(errorMsg!=''){
            layer.msg(errorMsg,{
                time:2000,
                skin:'errorMsg'
            })
        }
        //显示用户信息
        function showCustomer(id){
            $.post(
                '${pageContext.request.contextPath}/backend/customerSysuser/findById',
                {'id':id},
                function(result){
                    if(result.status==1){
                        $('#pid').val(result.date.id);
                        $('#pname').val(result.date.name);
                        $('#ploginName').val(result.date.loginName);
                        $('#pphone').val(result.date.phone);
                        $('#padrees').val(result.date.address);
                    }
                }
            );
        }


        //修改系统用户的状态
        function modifyStatus(id,btn){
            $.post(
                '${pageContext.request.contextPath}/backend/customerSysuser/modifyStatus',
                {'id':id},
                function(result){
                    if(result.status==1){
                        let $td=$(btn).parent().parent().children().eq(5);
                        if($td.text().trim()=='有效'){
                            $td.text('无效');
                            $(btn).val('启用').removeClass('btn-danger').addClass('btn-success');
                        }else{
                            $td.text('有效');
                            $(btn).val('禁用').removeClass('btn-success').addClass('btn-danger');
                        }
                    }
                }
            );

        }
    </script>
</head>

<body>
    <div class="panel panel-default" id="userInfo" id="homeSet">
        <div class="panel-heading">
            <h3 class="panel-title">客户管理</h3>
        </div>
        <div class="panel-body">
            <div class="showusersearch">
                <form class="form-inline" action="${pageContext.request.contextPath}/backend/customerSysuser/findByParams" method="post">
                    <input type="hidden" name="pageNum" value="${pageInfo.pageNum}" id="pageNum">
                  <div class="form-group">
                    <label for="customer_name">姓名:</label>
                    <input type="text" class="form-control"id="customer_name" name="name" placeholder="请输入姓名"  size="15px">
                  </div>
                  <div class="form-group">
                    <label for="customer_loginName">帐号:</label>
                    <input type="text" class="form-control" id="customer_loginName" name="loginName" placeholder="请输入帐号" size="15px">
                  </div>
                  <div class="form-group">
                    <label for="customer_phone">电话:</label>
                    <input type="text" class="form-control" id="customer_phone" name="phone"  placeholder="请输入电话" size="15px">
                  </div>
                  <div class="form-group">
                    <label for="customer_address">地址:</label>
                    <input type="text" class="form-control" id="customer_address" name="address"  placeholder="请输入地址">
                  </div>
<%--                  <div class="form-group">--%>
<%--                    <label for="customer_isValid">状态:</label>--%>
<%--                        <select class="form-control" id="customer_isValid" name="isValid">--%>
<%--                            <option value="-1">全部</option>--%>
<%--                            <option value="1">1</option>--%>
<%--                            <option value="0">2</option>--%>

<%--                        </select>--%>
<%--                  </div>--%>
                    <input type="submit" value="查询" class="btn btn-primary" id="doSearch">
                </form>
            </div>
            
            <div class="show-list text-center" style="position: relative;top: 30px;">
                <table class="table table-bordered table-hover" style='text-align: center;'>
                    <thead>
                        <tr class="text-danger">
                            <th class="text-center">序号</th>
                            <th class="text-center">姓名</th>
                            <th class="text-center">帐号</th>
                            <th class="text-center">电话</th>
                            <th class="text-center">地址</th>
                            <th class="text-center">状态</th>
                            <th class="text-center">操作</th>
                        </tr>
                    </thead>
                    <tbody id="tb">
                    <c:forEach items="${pageInfo.list}" var="customer">
                        <tr>
                            <td>${customer.id}</td>
                            <td>${customer.name}</td>
                            <td>${customer.loginName}</td>
                            <td>${customer.phone}</td>
                            <td>${customer.address}</td>
                            <td>
                                <c:if test="${customer.isValid==1}">有效</c:if>
                                <c:if test="${customer.isValid==0}">无效</c:if>
                            </td>
                            <td class="text-center">
                                <input type="button" class="btn btn-warning btn-sm doModify" value="修改" onclick="showCustomer(${customer.id})">
                                <c:if test="${customer.isValid==1}">
                                    <input type="button" class="btn btn-danger btn-sm doMangerDisable" value="禁用" onclick="modifyStatus(${customer.id},this)">
                                </c:if>
                                <c:if test="${customer.isValid==0}">
                                    <input type="button" class="btn btn-success btn-sm doMangerDisable" value="启用" onclick="modifyStatus(${customer.id},this)">
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <ul id="pagination"></ul>
            </div>
        </div>
    </div>

    <!-- 修改客户信息 start -->
    <div class="modal fade" tabindex="-1" id="myModal">
        <!-- 窗口声明 -->
        <div class="modal-dialog">
            <!-- 内容声明 -->
            <form action="${pageContext.request.contextPath}/backend/customerSysuser/modify" method="post">
                <input type="hidden" name="pageNum" value="${pageInfo.pageNum}">
            <div class="modal-content">
                <!-- 头部、主体、脚注 -->
                <div class="modal-header">
                    <button class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">修改客户</h4>
                </div>
                <div class="modal-body text-center">
                    <div class="row text-right">
                        <label for="id" class="col-sm-4 control-label">编号：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="pid" name="id" readonly>
                        </div>
                    </div>
                    <br>
                    <div class="row text-right">
                        <label for="name" class="col-sm-4 control-label">姓名：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="pname" name="name">
                        </div>
                    </div>
                    <br>
                    <div class="row text-right">
                        <label for="loginName" class="col-sm-4 control-label">帐号：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="ploginName" name="loginName">
                        </div>
                    </div>
                    <br>
                    <div class="row text-right">
                        <label for="phone" class="col-sm-4 control-label">电话：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="pphone" name="phone">
                        </div>
                    </div>
                    <br>
                    <div class="row text-right">
                        <label for="adrees" class="col-sm-4 control-label">地址：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="padrees" name="address">
                        </div>
                    </div>
                    <br>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary " type="submit">修改</button>
                    <button class="btn btn-primary cancel" data-dismiss="modal">取消</button>
                </div>
            </div>
            </form>

        </div>
    </div>
    <!-- 修改客户信息 end -->
</body>

</html>