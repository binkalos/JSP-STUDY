/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-18 04:13:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class fullView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		request.setCharacterEncoding("utf-8");
		String postid = request.getParameter("postid");
		String userid = (String)session.getAttribute("username");
			
		String imgPath = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mucktip?serverTimezone=UTC&useSSL=false";
		String id = "root";
		String pw = "alflarhkgkrrh1!";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
	
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>먹팁</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"fullViewStyle.css\" >\r\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tvar img_count = $('.content').length;\r\n");
      out.write("\t\tvar position = 1;\r\n");
      out.write("\t\t$('.prev').click(function() {\r\n");
      out.write("\t\t\tif(position > 1) {\r\n");
      out.write("\t\t\t\t$('#contents-wrapper').animate({\r\n");
      out.write("\t\t\t\t\tleft:'+=600'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tposition--;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('.next').click(function() {\r\n");
      out.write("\t\t\tif(position < img_count) {\r\n");
      out.write("\t\t\t\t$('#contents-wrapper').animate({\r\n");
      out.write("\t\t\t\t\tleft:'-=600'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tposition++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logincheck() {\r\n");
      out.write("\t\tvar login = \"");
      out.print(session.getAttribute("username"));
      out.write("\";\r\n");
      out.write("\t\tif(login == \"null\") {\r\n");
      out.write("\t\t\talert(\"로그인을 하셔야 이용할 수 있는 기능입니다.!\");\r\n");
      out.write("\t\t\tlocation.href = \"login.jsp\";\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\tlocation.href = \"likeAction.jsp?userid=");
      out.print(userid);
      out.write("&postid=");
      out.print(postid);
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction enterkey() {\r\n");
      out.write("\t\tif(window.event.keyCode == 13) { //엔터키가 눌렸을 때 실행\r\n");
      out.write("\t\t\tvar comment = null;\r\n");
      out.write("\t\t\tcomment = document.getElementById(\"comment\").value;\r\n");
      out.write("\t\t\tif(comment != \"\\n\") {\r\n");
      out.write("\t\t\t\tlocation.href = \"commentAction.jsp?comment=\"+comment+\"&userid=");
      out.print(userid);
      out.write("&postid=");
      out.print(postid);
      out.write("\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(\"comment\").value = null; //값 초기화\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction delOk(id) {\r\n");
      out.write("\t\tvar del = confirm(\"댓글을 삭제하시겠습니까?\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(del){\r\n");
      out.write("\t\t\tlocation.href = \"commentDel.jsp?id=\"+id+\"&postid=");
      out.print(postid);
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TopWrapper.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- <div id=\"dim-layer\" class=\"hidden\"> -->\r\n");
      out.write("<!-- <div class=\"mask\"></div> -->\r\n");
      out.write("<!-- <div class=\"muktip-modal\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t<div class=\"tip-position\"> -->\r\n");
      out.write("<!-- \t<div class=\"middle\"> -->\r\n");
      out.write("<!-- \t<div class=\"tip-frame\"> -->\r\n");
      out.write("<!-- \t<div class=\"tip-body\"> -->\r\n");
      out.write("<!-- \t<div class=\"top-upper-body\"> -->\r\n");
      out.write("<!-- \t\t<div class=\"close\"><a class=\"close-fullview\" href=\"#stay\">X</a></div>   -->\r\n");
      out.write("\t<section class=\"fullview\">\r\n");
      out.write("\t\t\t\t<div class=\"fullview-inner-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"pictures-wrapper\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pictures\" data-contents-count=\"DB count\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"conveyer-belt\" data-picture-ids=\"DB picture ID\">\r\n");
      out.write("\t\t\t\t\t\t\t<figure id=\"contents-wrapper\" class=\"img-contents-wrapper\" style=\"width:1800px; height: 600px;\">\r\n");
      out.write("\t");
		
			pstmt = con.prepareStatement("select * from img where postimgid = ?");
			pstmt.setString(1, postid);
			rs = pstmt.executeQuery();
	
			while(rs.next()) {    
				imgPath =request.getContextPath() + "/post/" + rs.getString("imgname");
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"content\" src=\"");
      out.print( imgPath );
      out.write("\" data-mobile-src=\"address\" width=\"600\" height=\"600\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-latio=\"1.0\" data-picture-id=\"DB id\">\r\n");
      out.write("\t");
		
			}
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</figure>\t\t\t\t\t\t\t\t\r\n");
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
      out.write("\t");

			pstmt = con.prepareStatement("select * from img where postimgid = ?");
			pstmt.setString(1, postid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {   
				imgPath =request.getContextPath() + "/post/" + rs.getString("imgname");
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<figure class=\"sumnail-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"sumnail\" src=\"");
      out.print( imgPath );
      out.write("\" width=\"50\" height=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t</figure>\r\n");
      out.write("\t");

			}
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div><!-- sumnails -->\r\n");
      out.write("\t\t\t\t\t</div><!-- sumnails-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div><!-- pictures-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t");

			pstmt = con.prepareStatement("select distinct postid, postimgid, title, content, writer, date, imgname, id, profile from post join img on postid = postimgid join user on writer = id where postid=? group by postid;");
			pstmt.setString(1, postid);
			rs = pstmt.executeQuery();
	
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"side-position\" id=\"error_solve\">\r\n");
      out.write("\t\t\t\t\t<div class=\"information-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"information\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-card\" data-following-status-url=\"게시자 링크\">\r\n");
      out.write("\t");
		
			if(rs.next()) {
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"profile-picture\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a hrf=\"Mypage.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\" target=\"_blank\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"user-profile\" src=\"img/");
      out.print(rs.getString("profile") );
      out.write("\" width=\"40px\" height=\"40px\"> <!-- img(user) in DB -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- profile-picture -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-information\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"nickname\" href=\"유저 아이디\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"name-bold\">");
      out.print(rs.getString("writer"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- clearfix -->\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- user-information -->\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- user-card -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"scroll-bar-component\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"description-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"description\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"title-wrapper\">");
      out.print(rs.getString("title") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"content-wrapper\">");
      out.print(rs.getString("content") );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- discription-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"scroll-bar-rail\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bar\" style=\"margin-top:0px; height: 120px;\"></div><!-- bar -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- scroll-bar-rail -->\r\n");
      out.write("\t");
			
			}
	
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div><!-- scroll-bar-component -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div><!-- information -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"action\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button class=\"like-btn\" onclick=\"logincheck()\">\r\n");
      out.write("\t");

			pstmt = con.prepareStatement("select * from goodmuck where userid=? and postid=?");
			pstmt.setString(1, userid);
			pstmt.setString(2, postid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int goodchk = rs.getInt("good_chk");
				if(goodchk == 1) {
					out.println("<img class='like-img' src='img/spoon2.png'>");
				} else {
					out.println("<img class='like-img' src='img/spoon1.png'>");
				}
			} else {
				out.println("<img class='like-img' src='img/spoon1.png'>");
			} 
			
			pstmt = con.prepareStatement("select count(*) from goodmuck where postid=? and good_chk=?");
			pstmt.setString(1, postid);
			pstmt.setInt(2, 1);
			rs = pstmt.executeQuery();
			
			int likecount = 0;
			if(rs.next()) {
				likecount = rs.getInt(1);			
			}
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"like-count\">");
      out.print( likecount );
      out.write("</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div><!-- action -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!-- information-position -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"comment-wrapper\" data-comments-url=\"디비주소\" data-comments-count=\"DB comments count\">\r\n");
      out.write("\t");

			pstmt = con.prepareStatement("select * from comments where postid=?");
			pstmt.setString(1, postid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pstmt = con.prepareStatement("select count(*) from comments where postid=?");
				pstmt.setString(1, postid);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
	
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear-fix\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"comments-count\">댓글\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"op-count\">(");
      out.print(rs.getInt(1));
      out.write(")</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- clear-fix -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comments\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comments-inner-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"op-comments\">\r\n");
      out.write("\t");

				}
				
				pstmt = con.prepareStatement("select commentsid, comment, date, id, profile from comments join user on userid = id where postid=?");
				pstmt.setString(1, postid);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
	
      out.write("\r\n");
      out.write("<!-- \t\t\t\t\t\t\t<button class=\"load-comments\" data-next-url=\"(디비에 있는 주소)\">더 보기 -->\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"comment\" data-id=\"id\" data-autor-id=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-author-bio data-author-nickname=\"댓글 단 user닉네임\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-author-profile-picture-url=\"사진 누르면 댓글단 user페이지로\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"commenter-picture\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Mypage.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"img/");
      out.print(rs.getString("profile") );
      out.write("\" width=\"30\" height=\"30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- commenter-picture-left -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"delete-button-wrapper\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"remaining-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"comment-body-wrapper remaining-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"commenter\" href=\"Mypage.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\" target=\"_blank\">");
      out.print(rs.getString("id") );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"comment-body\">");
      out.print(rs.getString("comment") );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<time datetime=\"댓글단 날짜\" title=\"댓글쓴날짜\">");
      out.print(rs.getDate("date") );
      out.write("</time>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- remaining-width -->\r\n");
      out.write("\t");

					if(userid.equals(rs.getString("id"))) { //내가 쓴 댓글만 삭제 가능
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"del-button-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"del-button\" onclick=\"delOk(");
      out.print(rs.getInt("commentsid"));
      out.write(")\">X</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li><!-- comment -->\r\n");
      out.write("\t");
		
					}
				}
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul><!-- op-comments -->\r\n");
      out.write("\t\t\t\t\t</div><!-- comments-inner-wrapper -->\r\n");
      out.write("\t");

			} else { 
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear-fix\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"comments-count\">댓글\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"op-count\">(0)</span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- clear-fix -->\t\r\n");
      out.write("\t");

			}
			
			if(userid != null) {
	
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comment-input-field\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"mentionable-users\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"side-input-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"input\" id=\"comment\" placeholder=\"댓글을 남기세요,,,\" tabindex=\"1\" onkeyup=\"enterkey();\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- input-wrapper -->\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- comment-input-field -->\r\n");
      out.write("\t");

			}
	
      out.write("\r\n");
      out.write("\t\t\t\t\t</div><!-- comment-wrapper -->\r\n");
      out.write("\t\t\t\t</div><!-- side-position -->\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</div><!-- fullview-inner-wrapper -->\r\n");
      out.write("\t\t</section><!-- fillview -->\r\n");
      out.write("\t\t\r\n");

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
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<!-- \t</div>top-upper-body -->\r\n");
      out.write("<!-- \t</div>tip-body -->\r\n");
      out.write("<!-- \t</div>tip-frame -->\r\n");
      out.write("<!-- \t</div>middle -->\r\n");
      out.write("<!-- \t</div>tip-position -->\r\n");
      out.write("\r\n");
      out.write("<!-- </div>dim-layer  -->\r\n");
      out.write("<!-- </div>muktip-modal -->\r\n");
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