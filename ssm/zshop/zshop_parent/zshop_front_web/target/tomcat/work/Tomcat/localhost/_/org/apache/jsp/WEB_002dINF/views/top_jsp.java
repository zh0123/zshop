/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-24 13:19:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/template.js\"></script>\r\n");
      out.write("<script id=\"welcome\" type=\"text/html\">\r\n");
      out.write("    <li class=\"userName\">\r\n");
      out.write("        您好：{{name}}\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle user-active\" data-toggle=\"dropdown\" role=\"button\">\r\n");
      out.write("            <img class=\"img-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/user.jpeg\" height=\"30\" />\r\n");
      out.write("            <span class=\"caret\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\" data-toggle=\"modal\" data-target=\"#modifyPasswordModal\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-cog\"></i>修改密码\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\" onclick=\"logout()\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-off\"></i> 退出\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"loginAndRegist\" type=\"text/html\">\r\n");
      out.write("    <li>\r\n");
      out.write("        <a href=\"#\" data-toggle=\"modal\" data-target=\"#loginModal\">登陆</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <a href=\"#\" data-toggle=\"modal\" data-target=\"#registModal\">注册</a>\r\n");
      out.write("    </li>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //根据用户名密码登陆\r\n");
      out.write("    function loginByAccount(){\r\n");
      out.write("        $.post(\r\n");
      out.write("            '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/loginByAccount',\r\n");
      out.write("            $('#frmLoginByAccount').serialize(),\r\n");
      out.write("            function(result){\r\n");
      out.write("                if(result.status==1){\r\n");
      out.write("                    //刷新页面\r\n");
      out.write("                    //location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/product/search';\r\n");
      out.write("\r\n");
      out.write("                    //局部刷新\r\n");
      out.write("                    $('#loginModal').modal('hide'); //隐藏模态框\r\n");
      out.write("                    var content=template('welcome',result.date);\r\n");
      out.write("                    $('#navbarInfo').html(content);\r\n");
      out.write("                }else{\r\n");
      out.write("                    $('#loginInfo').html(result.message);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //退出\r\n");
      out.write("    function logout(){\r\n");
      out.write("        $.post(\r\n");
      out.write("            '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/logout',\r\n");
      out.write("            function(result){\r\n");
      out.write("                if(result.status==1){\r\n");
      out.write("                    $('#navbarInfo').html(template('loginAndRegist'));\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //发送短信验证码\r\n");
      out.write("    function sendVerificationCode(btn){\r\n");
      out.write("        $.post(\r\n");
      out.write("            '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sms/sendVerificationCode',\r\n");
      out.write("            {'phone':$('#phone').val()},\r\n");
      out.write("            function(result){\r\n");
      out.write("                if(result.status==1){\r\n");
      out.write("                    let time=60;\r\n");
      out.write("                    timer=setInterval(function(){\r\n");
      out.write("                        if(time>0){\r\n");
      out.write("                            $(btn).attr('disabled',true);\r\n");
      out.write("                            $(btn).html('重新发送('+time+')');\r\n");
      out.write("                            time--;\r\n");
      out.write("                        }else{\r\n");
      out.write("                            $(btn).attr('disabled',false);\r\n");
      out.write("                            $(btn).html('重新发送');\r\n");
      out.write("                            clearInterval(timer);  //停止计时器\r\n");
      out.write("                        }\r\n");
      out.write("                    },1000)\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //短信快捷登陆\r\n");
      out.write("    function loginBySms(){\r\n");
      out.write("        $.post(\r\n");
      out.write("            '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/loginBySms',\r\n");
      out.write("            $('#frmSms').serialize(),\r\n");
      out.write("            function(result){\r\n");
      out.write("                if(result.status==1){\r\n");
      out.write("                    $('#loginModal').modal('hide'); //隐藏模态框\r\n");
      out.write("                    var content=template('welcome',result.data);\r\n");
      out.write("                    $('#navbarInfo').html(content);\r\n");
      out.write("                }else{\r\n");
      out.write("                    $('#loginInfoSms').html(result.message);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<!-- navbar start -->\r\n");
      out.write("<div class=\"navbar navbar-default clear-bottom\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <a class=\"navbar-brand logo-style\" href=\"\">\r\n");
      out.write("                <img class=\"brand-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/com-logo1.png\" alt=\"logo\" height=\"70\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/product/search\">商城主页</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/look\">我的订单</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/findCart?customerName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.loginName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> 购物车  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/customer/center\">会员中心</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" id=\"navbarInfo\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- navbar end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 修改密码模态框 start -->\r\n");
      out.write("<div class=\"modal fade\" id=\"modifyPasswordModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">修改密码</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"\" class=\"form-horizontal\" method=\"post\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">原密码：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">新密码：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">重复密码：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\" aria-label=\"Close\">关&nbsp;&nbsp;闭</button>\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-warning\">重&nbsp;&nbsp;置</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-warning\">修&nbsp;&nbsp;改</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 修改密码模态框 end -->\r\n");
      out.write("\r\n");
      out.write("<!-- 登录模态框 start  -->\r\n");
      out.write("<div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <!-- 用户名密码登陆 start -->\r\n");
      out.write("        <div class=\"modal-content\" id=\"login-account\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">用户名密码登录 &nbsp;&nbsp;<small id=\"loginInfo\" class=\"text-danger\"></small></h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form class=\"form-horizontal\" method=\"post\" id=\"frmLoginByAccount\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">用户名：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"请输入用户名\" name=\"loginName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"password\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\" style=\"text-align: center\">\r\n");
      out.write("                    <a class=\"btn-link\">忘记密码？</a> &nbsp;\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\" aria-label=\"Close\">关&nbsp;&nbsp;闭</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" onclick=\"loginByAccount()\">登&nbsp;&nbsp;陆</button> &nbsp;&nbsp;\r\n");
      out.write("                    <a class=\"btn-link\" id=\"btn-sms-back\">短信快捷登录</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 用户名密码登陆 end -->\r\n");
      out.write("        <!-- 短信快捷登陆 start -->\r\n");
      out.write("        <div class=\"modal-content\" id=\"login-sms\" style=\"display: none;\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">短信快捷登陆&nbsp;&nbsp;<small id=\"loginInfoSms\" class=\"text-danger\"></small></h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form class=\"form-horizontal\" method=\"post\" id=\"frmSms\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">手机号：</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"请输入手机号\" id=\"phone\" name=\"phone\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">验证码：</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"请输入验证码\" name=\"verificationCode\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <button class=\"pass-item-timer\" type=\"button\" onclick=\"sendVerificationCode(this)\">发送验证码</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\" style=\"text-align: center\">\r\n");
      out.write("                    <a class=\"btn-link\">忘记密码？</a> &nbsp;\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\" aria-label=\"Close\">关&nbsp;&nbsp;闭</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" onclick=\"loginBySms()\">登&nbsp;&nbsp;陆</button> &nbsp;&nbsp;\r\n");
      out.write("                    <a class=\"btn-link\" id=\"btn-account-back\">用户名密码登录</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 短信快捷登陆 end -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 登录模态框 end  -->\r\n");
      out.write("\r\n");
      out.write("<!-- 注册模态框 start -->\r\n");
      out.write("<div class=\"modal fade\" id=\"registModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">会员注册</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"\" class=\"form-horizontal\" method=\"post\">\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">用户姓名:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">登陆账号:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">登录密码:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">联系电话:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-3 control-label\">联系地址:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-dismiss=\"modal\" aria-label=\"Close\">关&nbsp;&nbsp;闭</button>\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-warning\">重&nbsp;&nbsp;置</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-warning\">注&nbsp;&nbsp;册</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 注册模态框 end -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/top.jsp(136,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty customer}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li>\r\n");
        out.write("                            <a href=\"#\" data-toggle=\"modal\" data-target=\"#loginModal\">登陆</a>\r\n");
        out.write("                        </li>\r\n");
        out.write("                        <li>\r\n");
        out.write("                            <a href=\"#\" data-toggle=\"modal\" data-target=\"#registModal\">注册</a>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li class=\"userName\">\r\n");
        out.write("                            您好：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.loginName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                        </li>\r\n");
        out.write("                        <li class=\"dropdown\">\r\n");
        out.write("                            <a href=\"#\" class=\"dropdown-toggle user-active\" data-toggle=\"dropdown\" role=\"button\">\r\n");
        out.write("                                <img class=\"img-circle\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/images/user.jpeg\" height=\"30\" />\r\n");
        out.write("                                <span class=\"caret\"></span>\r\n");
        out.write("                            </a>\r\n");
        out.write("                            <ul class=\"dropdown-menu\">\r\n");
        out.write("                                <li>\r\n");
        out.write("                                    <a href=\"#\" data-toggle=\"modal\" data-target=\"#modifyPasswordModal\">\r\n");
        out.write("                                        <i class=\"glyphicon glyphicon-cog\"></i>修改密码\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li>\r\n");
        out.write("                                    <a href=\"#\" onclick=\"logout()\">\r\n");
        out.write("                                        <i class=\"glyphicon glyphicon-off\"></i> 退出\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            </ul>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
