/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-05-27 00:32:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=euc-kr\">\r\n");
      out.write("<title>ë°°ê²½ì´ ê°ë ¤ì§ ë ì´ì´ íì ë°ì°ê¸°</title>\r\n");
      out.write("<style> \r\n");
      out.write("/* ë§ì¤í¬ ë°ì°ê¸° */\r\n");
      out.write("#mask {  \r\n");
      out.write("    position:absolute;  \r\n");
      out.write("    z-index:9000;  \r\n");
      out.write("    background-color:#000;  \r\n");
      out.write("    display:none;  \r\n");
      out.write("    left:0;\r\n");
      out.write("    top:0;\r\n");
      out.write("} \r\n");
      out.write("/* íìì¼ë¡ ë¨ë ìëì° css  */ \r\n");
      out.write(".window{\r\n");
      out.write("    display: none;\r\n");
      out.write("    position:absolute;  \r\n");
      out.write("    left:50%;\r\n");
      out.write("    top:50px;\r\n");
      out.write("    margin-left: -500px;\r\n");
      out.write("    width:1000px;\r\n");
      out.write("    height:500px;\r\n");
      out.write("    background-color:#FFF;\r\n");
      out.write("    z-index:10000;   \r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("//<![CDATA[\r\n");
      out.write("    function wrapWindowByMask(){\r\n");
      out.write(" \r\n");
      out.write("        //íë©´ì ëì´ì ëë¹ë¥¼ êµ¬íë¤.\r\n");
      out.write("        var maskHeight = $(document).height();  \r\n");
      out.write("        var maskWidth = $(window).width();  \r\n");
      out.write(" \r\n");
      out.write("        //ë§ì¤í¬ì ëì´ì ëë¹ë¥¼ íë©´ ê²ì¼ë¡ ë§ë¤ì´ ì ì²´ íë©´ì ì±ì´ë¤.\r\n");
      out.write("        $(\"#mask\").css({\"width\":maskWidth,\"height\":maskHeight});  \r\n");
      out.write(" \r\n");
      out.write("        //ì ëë©ì´ì í¨ê³¼ - ì¼ë¨ 0ì´ëì ê¹ë§£ê² ëë¤ê° 60% ë¶í¬ëªëë¡ ê°ë¤.\r\n");
      out.write(" \r\n");
      out.write("        $(\"#mask\").fadeIn(0);      \r\n");
      out.write("        $(\"#mask\").fadeTo(\"slow\",0.6);    \r\n");
      out.write(" \r\n");
      out.write("        //ìëì° ê°ì ê±° ëì´ë¤.\r\n");
      out.write("        $(\".window\").show();\r\n");
      out.write(" \r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        //ê²ì ë§ ëì°ê¸°\r\n");
      out.write("        $(\".openMask\").click(function(e){\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            wrapWindowByMask();\r\n");
      out.write("        });\r\n");
      out.write(" \r\n");
      out.write("        //ë«ê¸° ë²í¼ì ëë ì ë\r\n");
      out.write("        $(\".window .close\").click(function (e) {  \r\n");
      out.write("            //ë§í¬ ê¸°ë³¸ëìì ìëíì§ ìëë¡ íë¤.\r\n");
      out.write("            e.preventDefault();  \r\n");
      out.write("            $(\"#mask, .window\").hide();  \r\n");
      out.write("        });       \r\n");
      out.write(" \r\n");
      out.write("        //ê²ì ë§ì ëë ì ë\r\n");
      out.write("        $(\"#mask\").click(function () {  \r\n");
      out.write("            $(this).hide();  \r\n");
      out.write("            $(\".window\").hide();  \r\n");
      out.write(" \r\n");
      out.write("        });      \r\n");
      out.write(" \r\n");
      out.write("    });\r\n");
      out.write(" \r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id =\"wrap\"> \r\n");
      out.write("        <div id = \"container\">  \r\n");
      out.write("            <div id=\"mask\"></div>\r\n");
      out.write("            <div class=\"window\">\r\n");
      out.write("                <p style=\"width:1000px;height:500px;text-align:center;vertical-align:middle;\">íì ë´ì© ìë ¥</p>\r\n");
      out.write("                <p style=\"text-align:center; background:#ffffff; padding:20px;\"><a href=\"#\" class=\"close\">ë«ê¸°X</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">       \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\">\r\n");
      out.write("                    <a href=\"#\" class=\"openMask\">ë ì´ì´ íì ë°ì</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>       \r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
