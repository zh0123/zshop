/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-24 13:38:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>我的订单</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/iconfont/iconfont.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/zshop.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top2.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- content start -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xs-12\">\r\n");
      out.write("                <div class=\"page-header\" style=\"margin-bottom: 0px;\">\r\n");
      out.write("                    <h3>我的订单</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"table table-hover   orderDetail\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"5\">\r\n");
      out.write("                    <span>订单编号：<a href=\"orderDetail.html\">4722456552315</a></span>\r\n");
      out.write("                    <span>成交时间：2017-01-01  11:58:49</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/shop1.jpg\" alt=\"\"></td>\r\n");
      out.write("                <td class=\"order-content\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        秋冬韩版轮廓型宽松连帽套头学生百搭毛呢卫衣+休闲裤两件套装\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>颜色：单件粉色上衣</p>\r\n");
      out.write("                    <p>尺码：s</p>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ￥180.00\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    2\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"text-color\">\r\n");
      out.write("                    ￥360.00\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/shop2.jpg\" alt=\"\"></td>\r\n");
      out.write("                <td class=\"order-content\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        秋冬韩版轮廓型宽松连帽套头学生百搭毛呢卫衣+休闲裤两件套装\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>颜色：单件粉色上衣</p>\r\n");
      out.write("                    <p>尺码：s</p>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ￥60.00\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    2\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"text-color\">\r\n");
      out.write("                    ￥60.00\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"5\">\r\n");
      out.write("                    <span class=\"pull-right\"><button class=\"btn btn-danger\">删除订单</button></span>\r\n");
      out.write("                    <span class=\"\">总计:<span class=\"text-color\">￥420.00</span></span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"5\">\r\n");
      out.write("                    <span>订单编号：<a href=\"orderDetail.html\">4722456552315</a></span>\r\n");
      out.write("                    <span>成交时间：2017-01-01  11:58:49</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><img src=\"images/shop1.jpg\" alt=\"\"></td>\r\n");
      out.write("                <td class=\"order-content\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        秋冬韩版轮廓型宽松连帽套头学生百搭毛呢卫衣+休闲裤两件套装\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>颜色：单件粉色上衣</p>\r\n");
      out.write("                    <p>尺码：s</p>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ￥180.00\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    2\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"text-color\">\r\n");
      out.write("                    ￥360.00\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><img src=\"images/shop2.jpg\" alt=\"\"></td>\r\n");
      out.write("                <td class=\"order-content\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        秋冬韩版轮廓型宽松连帽套头学生百搭毛呢卫衣+休闲裤两件套装\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>颜色：单件粉色上衣</p>\r\n");
      out.write("                    <p>尺码：s</p>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ￥60.00\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    2\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"text-color\">\r\n");
      out.write("                    ￥60.00\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"5\">\r\n");
      out.write("                    <span class=\"pull-right\"><button class=\"btn btn-danger\">删除订单</button></span>\r\n");
      out.write("                    <span class=\"\">总计:<span class=\"text-color\">￥420.00</span></span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- content end-->\r\n");
      out.write("    <!-- footers start -->\r\n");
      out.write("    <div class=\"footers\">\r\n");
      out.write("        版权所有：南京网博\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- footers end -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
}
