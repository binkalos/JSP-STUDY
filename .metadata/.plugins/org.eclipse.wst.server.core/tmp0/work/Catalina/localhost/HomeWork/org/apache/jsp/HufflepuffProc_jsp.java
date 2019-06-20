/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-05-30 23:43:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HufflepuffProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"HufflepuffStyle.css\" >\r\n");
      out.write("<title>Hufflepuff</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("                  \r\n");
      out.write("                var xOffset = 10;\r\n");
      out.write("                var yOffset = 30;\r\n");
      out.write(" \r\n");
      out.write("                $(document).on(\"mouseover\",\"#thumbnail\",function(e){ //마우스 오버시\r\n");
      out.write("                     \r\n");
      out.write("                    $(\"body\").append(\"<p id='preview'><img src='\"+ $(this).attr(\"src\") +\"' width='400px' /></p>\"); //보여줄 이미지를 선언                       \r\n");
      out.write("                    $(\"#preview\")\r\n");
      out.write("                        .css(\"top\",(e.pageY - xOffset) + \"px\")\r\n");
      out.write("                        .css(\"left\",(e.pageX + yOffset) + \"px\")\r\n");
      out.write("                        .fadeIn(\"fast\"); //미리보기 화면 설정 셋팅\r\n");
      out.write("                });\r\n");
      out.write("                 \r\n");
      out.write("                $(document).on(\"mousemove\",\"#thumbnail\",function(e){ //마우스 이동시\r\n");
      out.write("                    $(\"#preview\")\r\n");
      out.write("                        .css(\"top\",(e.pageY - xOffset) + \"px\")\r\n");
      out.write("                        .css(\"left\",(e.pageX + yOffset) + \"px\");\r\n");
      out.write("                });\r\n");
      out.write("                 \r\n");
      out.write("                $(document).on(\"mouseout\",\"#thumbnail\",function(){ //마우스 아웃시\r\n");
      out.write("                    $(\"#preview\").remove();\r\n");
      out.write("                });\r\n");
      out.write("                  \r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("             \r\n");
      out.write("        <style>\r\n");
      out.write("            /* 미리보기 스타일 셋팅 */\r\n");
      out.write("            #preview{\r\n");
      out.write("                z-index: 9999;\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                border:0px solid #ccc;\r\n");
      out.write("                background:#333;\r\n");
      out.write("                padding:1px;\r\n");
      out.write("                display:none;\r\n");
      out.write("                color:#fff;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 기숙사 별 로고  -->\r\n");
      out.write("\t<img src=\"img/h.PNG\" class=\"himg\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  Hufflepuff -->\r\n");
      out.write("<div class=\"uniform-wrapper\">\r\n");
      out.write("\t<p class=\"uniform\"><b>Uniform</b><p class=\"dollar\">- 5 Galleon</p></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/hc.jpg','bigimg'); return false;\" class=\"imgbigview\">\r\n");
      out.write("\t\t<img src=\"img/hc.jpg\" class=\"hcimg\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"hch\"> Hufflepuff uniform</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<p class=\"add-uniform\"><b>Cloths</b><p class=\"dollar2\">- 3 Galleon</p></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/hh.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/hh.PNG\" class=\"hhimg\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"hhh\">Winter hat</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/hs.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/hs.PNG\" class=\"hsimg\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"hsh\">Muffler</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/htie.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/htie.PNG\" class=\"htieimg\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"htieh\">Tie</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<p class=\"stick\"><b>Wands</b><p class=\"dollar3\">- Free for Wizard</p></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j1.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j1.PNG\" class=\"j1img\">\r\n");
      out.write("\t\t<h4 class=\"j1h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j2.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j2.PNG\" class=\"j2img\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"j2h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j3.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j3.PNG\" class=\"j3img\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"j3h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j4.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j4.PNG\" class=\"j4img\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"j4h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j5.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j5.PNG\" class=\"j5img\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"j5h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div onclick=\"imgbigview('img/j6.PNG','bigimg'); return false;\">\r\n");
      out.write("\t\t<img src=\"img/j6.PNG\" class=\"j6img\" id=\"thumbnail\">\r\n");
      out.write("\t\t<h4 class=\"j6h\">Collectible Wand by<br>The Noble Collection</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- 상세이미지 보여주는 공간 -->\r\n");
      out.write("\t<div id=\"bigimg\" style=\"display:none;\">\r\n");
      out.write("\t<img src=\"\" onclick=\"hide('bigimg')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
