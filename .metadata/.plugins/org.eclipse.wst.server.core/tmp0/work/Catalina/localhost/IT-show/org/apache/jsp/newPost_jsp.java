/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-19 10:10:27 UTC
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
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class newPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/TopWrapper.jsp", Long.valueOf(1560936152931L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1558674977795L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>최신</title><link rel=\"stylesheet\" href=\"firstPageStyle.css\" >\r\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.fittext.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.7.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\t\t\r\n");
      out.write("\t\t//$(\".content\" ).fitText(1.2);\r\n");
      out.write("\t\t$(\".open-fullview\").click(function() {\r\n");
      out.write("\t\t\tvar foodsrc = $(this).find('.showimg').attr('src');\r\n");
      out.write("\t\t\t$(\"#dim-layer\").find('.content').attr('src', foodsrc);\r\n");
      out.write("\t\t\t$(\"#dim-layer\").css(\"display\", \"block\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".close-fullview\").click(function() {\r\n");
      out.write("\t\t\t$(\"#dim-layer\").css(\"display\", \"none\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction show_fullview(post_id) {\r\n");
      out.write("\t\tlocation.href = \"readpost.jsp?postid=\"+post_id;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"main-search-page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"muktip-feed\">\r\n");

		String imgPath = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);


      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"top-bar-search\">\r\n");
      out.write("\t\t\t<p class=\"top-label\">최신먹팁</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"muktip-contents\" style=\"height: 1550px;\"> \t\r\n");
      out.write("\t\t\t<div class=\"line-space\"></div>\r\n");
	
			pstmt = con.prepareStatement("select distinct postid, postimgid, title, content, writer, date, imgname, id, profile from post join img on postid = postimgid join user on writer = id group by postid order by date");
			rs = pstmt.executeQuery();
		
			int count=0;
			while(rs.next()) {
				imgPath =request.getContextPath() + "/post/" + rs.getString("imgname"); 
				count++;

      out.write("\r\n");
      out.write("\t\t\t<div class=\"mucktip-card\"> <!-- 각 게시글 박스 -->\r\n");
      out.write("\t\t\t\t<button class=\"open-fullview\">\r\n");
      out.write("\t\t\t\t\t<a href=\"fullView.jsp?postid=");
      out.print(rs.getString("postid"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"showimg\" src=\"");
      out.print(imgPath);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class=\"mucktip-information\">\r\n");
      out.write("\t\t\t\t\t<a class=\"writer-profile-link\" href=\"Mypage.jsp?id=");
      out.print( rs.getString("id") );
      out.write("\"> <!-- 마이페이지 이동 -->\r\n");
      out.write("\t\t\t\t\t\t<img class=\"writer-profile\" src=\"img/");
      out.print(rs.getString("profile") );
      out.write("\" width=\"30px\" height=\"30px\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"user-information-card\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top-information\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"writer\">");
      out.print( rs.getString("writer") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"write-date\">");
      out.print( rs.getString("date") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bottom-card\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"title\">");
      out.print( rs.getString("title") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"content\">");
      out.print( rs.getString("content") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div> <!-- mucktip-information -->\r\n");
      out.write("\t\t\t</div><!-- mucktip-card  -->\r\n");
      out.write("\t\t\t\r\n");
		
			if(count%4==0) {

      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"line-space\"></div>\r\n");
			}
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

      out.write("\r\n");
      out.write("\t\t</div> <!-- muktip-contents -->\t\r\n");
      out.write("\t\t</div><!-- muktip-feed -->\r\n");
      out.write("\t</div> <!-- main-search-page  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
