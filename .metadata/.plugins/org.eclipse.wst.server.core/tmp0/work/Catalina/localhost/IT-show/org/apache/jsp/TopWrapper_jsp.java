/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-19 09:42:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class TopWrapper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"TopWrapperStyle.css\" >\r\n");

	//로그인 한 사람이라면 userID라는 변수에 해당 아이디가 담기고 그렇지 않으면 null값
	String userid = null;
	if (session.getAttribute("username") != null) {
		userid = (String) session.getAttribute("username");
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/mucktip?serverTimezone=UTC&useSSL=false";
	String id = "root";
	String pw = "alflarhkgkrrh1!";

      out.write("\r\n");
      out.write("<!-- 맨위에 top메뉴 공간 개발 나중에 따로 빼놓을 부분-->\r\n");
      out.write("\t\t<nav id=\"top-menu-all\">\r\n");
      out.write("\t\t<div id=\"main-menu\">\r\n");
      out.write("\t\t\t<div class=\"contents-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"left-contents-wrapper\">\r\n");
      out.write("\t\t\t\t\t<div class=\"muktip-logo\"></div>\r\n");
      out.write("\t\t\t\t\t<a href=\"firstPage.jsp\" class=\"new-tip\">최신 먹팁</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"recommendTip.jsp\" class=\"good\">추천</a>\r\n");
      out.write("\t\t\t\t</div><!-- left-contents-wrapper -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"right-contents-wrapper\">\r\n");
      out.write("\t\t\t\t\t");

						//로그인이 안된 경우
						if (userid == null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"login-join\"> <!-- 로그인 / 가입 -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\">로그인</a> /\r\n");
      out.write("\t\t\t\t\t\t<a href=\"join.jsp\">가입</a> <!-- 가입 페이지 미구현 -->\r\n");
      out.write("\t\t\t\t\t</div> <!-- login-join -->\r\n");
      out.write("\t\t\t\t\t");

						} else { //로그인이 된 경우
							
							try {
								Class.forName(driver);
								con = DriverManager.getConnection(url, id, pw);
								
								pstmt = con.prepareStatement("select * from user where id =?");
								pstmt.setString(1, userid);
								rs = pstmt.executeQuery();
								
								if(rs.next()) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"user-menu\" id=\"user-menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"profile-img-btn\"> <!-- 이미지 버튼(회원 이미지) -->\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"profile-image\" src=\"img/");
      out.print(rs.getString("profile"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"user-menu-list\"> <!-- 메뉴리스트 -->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menu-link\" href=\"Mypage.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\"> <!-- /유저 이름으로 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"menu-icon-mini\" src=\"img/");
      out.print(rs.getString("profile"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"menu-user-name\">");
      out.print(userid );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menu-link\" href=\"음식바구니.jsp\" rel=\"nofollow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"menu-icon-myfood\" src=\"img/foodbox.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text-mtfood\">내 음식바구니</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menu-link\"  href=\"logoutProc.jsp\" rel=\"nofollow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"menu-icon-logout\" src=\"img/logout.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text-logout\">로그아웃</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul> <!-- user-menu-list -->\r\n");
      out.write("\t\t\t\t\t\t</div><!-- dropdown -->\r\n");
      out.write("\t\t\t\t\t</div><!-- user-menu -->\r\n");
      out.write("\t\t\t\t\t");

								} //if				
							} catch (Exception e) {
								e.printStackTrace();
							} 
						} //else
					
      out.write("\r\n");
      out.write("\t\t\t\t</div><!-- right-contents-wrapper -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"search-wrapper\">\r\n");
      out.write("\t\t\t\t\t<form class=\"search-form\" action=\"search.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=0 cellspacing=0>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"input-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"search-keyword\" type=\"text\" name=\"keyword\" placeholder=\"검색\" required>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"search-button\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"search.jsp\"><span class=\"ic_search\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div><!-- search-wrapper -->\t\t\t\r\n");
      out.write("\t\t</div><!-- contents-wrapper -->\r\n");
      out.write("\t\t</div><!-- main-menu -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 서브메뉴 -->\r\n");
      out.write("\t\t<div id=\"sub-menu-wrapper\" class=\"show\">\r\n");
      out.write("\t\t\t<ul class=\"sub-contents-wrapper\">\r\n");
      out.write("\t\t\t\t<li class=\"sub-menu selected\" data-text=\"인기\">\r\n");
      out.write("\t\t\t\t\t<a href=\"firstPage.jsp\">인기</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"sub-menu\" data-text=\"최신\">\r\n");
      out.write("\t\t\t\t\t<a href=\"newPost.jsp\">최신</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"sub-menu\" data-text=\"TV\">\r\n");
      out.write("\t\t\t\t\t<a href=\"whatToEat.jsp\">뭐먹지?</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"sub-menu\" data-text=\"추천\">\r\n");
      out.write("\t\t\t\t\t<a href=\"recommendTip.jsp\">추천</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul><!-- sub-contents-wrapper -->\r\n");
      out.write("\t\t</div><!-- sub-menu-wrapper -->\t\r\n");
      out.write("\t\t\r\n");
      out.write("</nav><!-- top-menu-all -->\t");
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