/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-17 02:58:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"http://apis.daum.net/maps/maps3.js?apikey=7e0762dc22ba650124c959074cc14e7f\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div><input id=\"keyWord\" placeholder=\"지도검색 장소입력\">\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<button id=\"mapSearchBTN\" type=\"button\" class=\"btn btn-default\">검색</button></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <div id=\"mapDiv\"></div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t  // 키워드로 지도 검색 코드 메서드를 callback이라는 변수로 저장합니다.그리고 하단부에 input엔터키 이벤트와             \r\n");
      out.write("\t  //버튼클릭 이벤트 메서드에서 따로 불러줍니다(두 이벤트를 같이 쓰기 위해서).\r\n");
      out.write("\r\n");
      out.write("\t  var callback = function(){\r\n");
      out.write("\r\n");
      out.write("\t\t   // 값을 입력하지 않았을 때 안내 경고창\r\n");
      out.write("\r\n");
      out.write("\t\t   if ($('#keyWord').val() == ''){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t alert('위치를 입력해주세요. ex)경기대 수원');\r\n");
      out.write("\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t// 본격적인 지도 검색의 핵심 코드 시작\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar keyWord = $(\"#keyWord\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 한글처리\r\n");
      out.write("\r\n");
      out.write("\t\t\tkeyWord = encodeURIComponent(keyWord);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t// keyword JSON데이터에 접근하기 위한 주소\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar url = \" https://apis.daum.net/local/v1/search/keyword.json?apikey=7e0762dc22ba650124c959074cc14e7f&query=\"+keyWord;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 주소 뒤에 &callback=?을 붙임으로써 JSONP형식의 데이터를 이용하기 위한 메서드\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.getJSON(url + \"&callback=?\" , function(json){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 다음 제공 JSON형식이 channel안에 각 item형식으로 되어 있기 때문에 원하는 단계까지 접근하기                          // 위한 items 변수 선언\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar items = json.channel.item;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// item안의 latitude, longitude 데이터를 활용하기 위한 메서드\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$.each(items, function(i, it){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar latitude = it.latitude;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar longitude = it.longitude;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar pos = latitude + \",\" + longitude;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif(i == 0){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar container = document.getElementById('mapDiv'); \r\n");
      out.write("\r\n");
      out.write("                                      // 지도를 담을 영역의 DOM 레퍼런스\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar options = { // 지도를 생성할 때 필요한 기본 옵션\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tcenter: new daum.maps.LatLng(latitude, longitude), // 지도의 중심좌표.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tlevel: 3 //지도의 레벨(확대, 축소 정도)\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar map = new daum.maps.Map(container, options); // 지도 생성 및 객체 리턴\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 검색 된 후 input에 입력했던 텍스트를 비워주는 코드\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#keyWord\").val(\"\");\r\n");
      out.write("\r\n");
      out.write("\t  }; // 여기까지 callback 변수에 저장된 메서드\r\n");
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t  // 엔터키 누르면 위치검색 가능 메서드\r\n");
      out.write("\r\n");
      out.write("\t  $(\"#keyWord\").keypress(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t    if (event.which == 13) callback();\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t  // 버튼 클릭으로 위치검색 가능 메서드\r\n");
      out.write("\r\n");
      out.write("\t  $(\"#mapSearchBTN\").click(callback);\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
