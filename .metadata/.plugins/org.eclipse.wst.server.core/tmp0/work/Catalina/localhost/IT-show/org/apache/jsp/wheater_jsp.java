/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-10 09:14:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public final class wheater_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/TopWrapper.jsp", Long.valueOf(1559887741951L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1558674977795L));
    _jspx_dependants.put("/fullView.jsp", Long.valueOf(1558675007923L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.xml.parsers.DocumentBuilder");
    _jspx_imports_classes.add("javax.xml.parsers.DocumentBuilderFactory");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"firstPageStyle.css\" >\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.xdomainajax.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/weather_js.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\".open-fullview\").click(function() {\r\n");
      out.write("\t\t\t$(\"#dim-layer\").css(\"display\", \"block\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".close-fullview\").click(function() {\r\n");
      out.write("\t\t\t$(\"#dim-layer\").css(\"display\", \"none\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    realTimeWeather();\r\n");
      out.write("</script>\r\n");
      out.write("<title>날씨 연습</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"TopWrapperStyle.css\" >\r\n");

	//로그인 한 사람이라면 userID라는 변수에 해당 아이디가 담기고 그렇지 않으면 null값
	String id = null;
	if (session.getAttribute("username") != null) {
		id = (String) session.getAttribute("username");
	}

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
						if (id == null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"login-join\"> <!-- 로그인 / 가입 -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\">로그인</a> /\r\n");
      out.write("\t\t\t\t\t\t<a href=\"join.jsp\">가입</a> <!-- 가입 페이지 미구현 -->\r\n");
      out.write("\t\t\t\t\t</div> <!-- login-join -->\r\n");
      out.write("\t\t\t\t\t");

						} else { //로그인이 된 경우
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"user-menu\" id=\"user-menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"profile-img-btn\"> <!-- 이미지 버튼(회원 이미지) -->\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"profile-image\" src=\"img/imoticon.png\">\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"user-menu-list\"> <!-- 메뉴리스트 -->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menu-link\" href=\"Mypage.jsp\"> <!-- /유저 이름으로 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"menu-icon-mini\" src=\"img/imoticon.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"menu-user-name\">");
      out.print(id );
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
      out.write("\t\t\t\t\t\t\t\t<a class=\"menu-link\"  href=\"로그아웃.jsp\" rel=\"nofollow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"menu-icon-logout\" src=\"img/logout.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"menu-text-logout\">로그아웃</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul> <!-- user-menu-list -->\r\n");
      out.write("\t\t\t\t\t\t</div><!-- dropdown -->\r\n");
      out.write("\t\t\t\t\t</div><!-- user-menu -->\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</div><!-- right-contents-wrapper -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"search-wrapper\">\r\n");
      out.write("\t\t\t\t\t<form class=\"search-form\" action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<table style=\" border-collapse: collapse; border-spacing: 0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"input-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"search-keyword\" type=\"text\" name=\"keyword\" placeholder=\"검색\" required>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"search-button\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ic_search\"></span>\r\n");
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
      out.write("\t\t\t\t\t<a href=\"최신.jsp\">최신</a>\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!--  \r\n");
      out.write("  <div class=\"vis-weather\">\r\n");
      out.write("        <h2 class=\"vh_hide\">날씨정보</h2>\r\n");
      out.write("        <p class=\"weather-date\"></p>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"weather-temp\"></li>\r\n");
      out.write("            <li id=\"RN1\">시간당강수량 : ?</li>\r\n");
      out.write("            <li class=\"weather-state-text\"></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"weather\">\r\n");
      out.write("    \t<!-- 오른쪽에 이미지 -->\r\n");
      out.write("    \t<div class=\"weather-img\">\r\n");
      out.write("    \t\t<!-- 날씨에 따라 이미지 들어가기..?? 가능? -->\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<!-- 왼쪽에 정보 -->\r\n");
      out.write("    \t<div class=\"vis-weather\">\r\n");
      out.write("\t        <h2 class=\"vh_hide\">날씨정보</h2>\r\n");
      out.write("\t        <p class=\"weather-date\"></p>\r\n");
      out.write("\t        <ul>\r\n");
      out.write("\t            <li class=\"weather-temp\"></li>\r\n");
      out.write("\t            <li id=\"RN1\">시간당강수량 : ?</li>\r\n");
      out.write("\t            <li class=\"weather-state-text\"></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div><!-- weather -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"top-bar\">\r\n");
      out.write("\t\t\t<p class=\"top-label\">추천음식</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"muktip-contents\" style=\"height: 1550px;\"> <!-- 전체 박스 -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 첫번째 줄 -->\r\n");
      out.write("\t\t\t<div style=\"top:0px; left:0px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t<a class=\"open-fullview\" href=\"#\">게시글</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:0px; left:260px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:0px; left:520px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:0px; left:780px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 두번째 줄 -->\r\n");
      out.write("\t\t\t<div style=\"top:310px; left:0px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:310px; left:260px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:310px; left:520px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:310px; left:780px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 세번째 줄 -->\r\n");
      out.write("\t\t\t<div style=\"top:620px; left:0px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:620px; left:260px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:620px; left:520px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"top:620px; left:780px;\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t게시글\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div> <!-- muktip-contents -->\t\r\n");
      out.write("\t\t</div><!-- muktip-feed -->\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div><!-- top-tip-fid -->\r\n");
      out.write("\t</section><!-- main-page -->\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"fullViewStyle.css\" >\r\n");
      out.write("\r\n");
      out.write("<div id=\"dim-layer\">\r\n");
      out.write("<div class=\"mask\"></div>\r\n");
      out.write("<div class=\"muktip-modal\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"tip-position\">\r\n");
      out.write("\t<div class=\"middle\">\r\n");
      out.write("\t<div class=\"tip-frame\">\r\n");
      out.write("\t<div class=\"tip-body\">\r\n");
      out.write("\t<div class=\"top-upper-body\">\r\n");
      out.write("\t\t<div class=\"close\"><a class=\"close-fullview\" href=\"#\">X</a></div>  \r\n");
      out.write("\t\r\n");
      out.write("\t\t<section class=\"fullview\">\r\n");
      out.write("\t\t\t<div class=\"fullview-inner-wrapper\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"pictures-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"pictures\" data-contents-count=\"DB count\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"conveyer-belt\" data-picture-ids=\"DB picture ID\">\r\n");
      out.write("\t\t\t\t\t\t\t<figure id=\"contents-wrapper\" class=\"img-contents-wrapper\" style=\"width:2400px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"content\" src=\"address\" data-mobile-src=\"address\" width=\"600\" height=\"600\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-latio=\"1.0\" data-picture-id=\"DB id\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</figure>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div><!-- conveyer-belt -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button class=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sprit arrow-left\"><img src=\"img/prev.png\" width=50px height=50px></span>\r\n");
      out.write("\t\t\t\t\t\t</button><!-- prev -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button class=\"next\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sprit arrow-right\"><img src=\"img/next.png\" width=50px height=50px></span>\t\t\r\n");
      out.write("\t\t\t\t\t\t</button><!-- next -->\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!-- pictures -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"sumnails-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sumnails\">\r\n");
      out.write("\t\t\t\t\t\t\t<figure class=\"sumnail-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"sumnail\" src=\"address\" width=\"50\" height=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- sumnails -->\r\n");
      out.write("\t\t\t\t\t</div><!-- sumnails-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div><!-- pictures-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"side-position\" id=\"error_solve\">\r\n");
      out.write("\t\t\t\t\t<div class=\"information-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"information\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-card\" data-following-status-url=\"게시자 링크\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"profile-picture\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a hrf=\"db게시자 아이디\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/imoticon.png\" width=\"40px\" height=\"40px\"> <!-- img(user) in DB -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- profile-picture -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-information\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"nickname\" href=\"유저 아이디\" target=\"_blank\">유저 이름</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- clearfix -->\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- user-information -->\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- user-card -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"scroll-bar-component\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"description-wrapper\" style=\"overflow:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"search-hashing\" href=\"키워드 찾는 주소\" target=\"_blank\">#태그한것들</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- discription-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"scroll-bar-rail\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bar\" style=\"margin-top:0px;'\"></div><!-- bar -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- scroll-bar-rail -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- scroll-bar-component -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div><!-- information -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"action\"><!-- 좋아요,퍼가기,좋아요 숫자 기능 --></div><!-- action -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!-- information-position -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"comment-wrapper\" data-comments-url=\"디비주소\" data-comments-count=\"DB comments count\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear-fix\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"comments-count\">댓글\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"op-count\">디비에 있는 댓글 수</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"load-comments\" data-next-url=\"(디비에 있는 주소)\">더 보기\r\n");
      out.write("\t\t\t\t\t\t</div><!-- clear-fix -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comments\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comments-inner-wrapper\" style=\"overflow:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"op-comments\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"comment\" data-id=\"id\" data-autor-id=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-author-bio data-author-nickname=\"댓글 단 user닉네임\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-author-profile-picture-url=\"사진 누르면 댓글단 user페이지로\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"commenter-picture\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"댓글단user아이디\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"img/imoticon.png\" width=\"30\" height=\"30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- commenter-picture-left -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"delete-button-wrapper\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"remaining-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"comment-body-wrapper remaining-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"commenter\" href=\"댓글단 user아이디\" target=\"-blank\">댓글 userid</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"comment-body\">DB 댓글 내용</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<time datetime=\"댓글단 날짜\" title=\"댓글쓴날짜\">댓글쓴날짜</time>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- remaining-width -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li><!-- comment -->\r\n");
      out.write("\t\t\t\t\t\t\t</ul><!-- op-comments -->\r\n");
      out.write("\t\t\t\t\t\t</div><!-- comments-inner-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"scroll-bar-rail\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bar\" style=\"margin-top:0px;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- scroll-bar-rail -->\r\n");
      out.write("\t\t\t\t\t\t</div><!-- comments -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comment-input-field\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"mentionable-users\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea class=\"input\" placeholder=\"댓글을 남기세요,,,\" tabindex=\"1\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"markup-field\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea class=\"textarea-mirror\" style=\"font-size:14px; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth:293px; height:16px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- input-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- comment-input-field -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!-- comment-wrapper -->\r\n");
      out.write("\t\t\t\t</div><!-- side-position -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"vertical-line\"></div>\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</div><!-- fullview-inner-wrapper -->\r\n");
      out.write("\t\t</section><!-- fillview -->\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t</div><!-- top-upper-body -->\r\n");
      out.write("\t</div><!-- tip-body -->\r\n");
      out.write("\t</div><!-- tip-frame -->\r\n");
      out.write("\t</div><!-- middle -->\r\n");
      out.write("\t</div><!-- tip-position -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- dim-layer  -->\r\n");
      out.write("</div><!-- muktip-modal -->");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"footerStyle.css\" >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"footer-wrqpper\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"first-wrapper\">\r\n");
      out.write("\t\t\t<img src=\"img/title.png\" width=\"200\" height=\"130\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- first-wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"second-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"developer-information-wrapper\">\r\n");
      out.write("\t\t\t\t<p class=\"developer\">개발자</p>\r\n");
      out.write("\t\t\t\t<!-- 이 글자가 우리 둘 정보의 위의 가운데에 배치 -->\r\n");
      out.write("\t\t\t\t<div class=\"left-developer\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-name\">이규빈(Lee KyuBeen)</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-tel\">tel:010-9067-0353</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-email\">s2017i34@e-mirim.hs.kr</p>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- left-developer -->\r\n");
      out.write("\t\t\t\t<div class=\"right-developer\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-name\">박혜정(Park HyeJung)</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-tel\">tel:010-7335-3662</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-email\">s2017i27@e-mirim.hs.kr</p>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- right-developer -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- developer-information-wrapper -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- second-wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"third-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"designer-information-wrapper\">\r\n");
      out.write("\t\t\t\t<p class=\"designer\">디자이너</p>\r\n");
      out.write("\t\t\t\t<div class=\"first-designer\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-name\">서지인(Seo JiIn)</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-tel\">tel:010-2565-5186</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"developer-email\">s2017i28@e-mirim.hs.kr</p>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div> <!-- first-designer -->\r\n");
      out.write("\t\t\t</div> <!-- designer-information-wrapper  -->\r\n");
      out.write("\t\t</div><!-- third-wrapper -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!-- footer-wrapper -->\r\n");
      out.write("\t\r\n");
      out.write("</div> <!-- footer -->");
      out.write("\r\n");
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
