/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-06-17 02:27:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>길 찾기</title>\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=7e0762dc22ba650124c959074cc14e7f&libraries=services\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" id=\"sample5_address\" placeholder=\"주소\">\r\n");
      out.write("<input type=\"button\" onclick=\"sample5_execDaumPostcode()\" value=\"주소 검색\"><br>\r\n");
      out.write("<div id=\"map\" style=\"width:300px;height:300px;margin-top:10px;display:none\"></div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var mapContainer = document.getElementById('map'), // 지도를 표시할 div\r\n");
      out.write("        mapOption = {\r\n");
      out.write("            center: new daum.maps.LatLng(37.537187, 127.005476), // 지도의 중심좌표\r\n");
      out.write("            level: 5 // 지도의 확대 레벨\r\n");
      out.write("        };\r\n");
      out.write(" \r\n");
      out.write("    //지도를 미리 생성\r\n");
      out.write("    var map = new daum.maps.Map(mapContainer, mapOption);\r\n");
      out.write("    //주소-좌표 변환 객체를 생성\r\n");
      out.write("    var geocoder = new daum.maps.services.Geocoder();\r\n");
      out.write("    //마커를 미리 생성\r\n");
      out.write("    var marker = new daum.maps.Marker({\r\n");
      out.write("        position: new daum.maps.LatLng(37.537187, 127.005476),\r\n");
      out.write("        map: map\r\n");
      out.write("    });\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    function sample5_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var fullAddr = data.address; // 최종 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 조합형 주소 변수\r\n");
      out.write(" \r\n");
      out.write("                // 기본 주소가 도로명 타입일때 조합한다.\r\n");
      out.write("                if(data.addressType === 'R'){\r\n");
      out.write("                    //법정동명이 있을 경우 추가한다.\r\n");
      out.write("                    if(data.bname !== ''){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있을 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== ''){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.\r\n");
      out.write("                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');\r\n");
      out.write("                }\r\n");
      out.write(" \r\n");
      out.write("                // 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById(\"sample5_address\").value = fullAddr;\r\n");
      out.write("                // 주소로 상세 정보를 검색\r\n");
      out.write("                geocoder.addressSearch(data.address, function(results, status) {\r\n");
      out.write("                    // 정상적으로 검색이 완료됐으면\r\n");
      out.write("                    if (status === daum.maps.services.Status.OK) {\r\n");
      out.write(" \r\n");
      out.write("                        var result = results[0]; //첫번째 결과의 값을 활용\r\n");
      out.write(" \r\n");
      out.write("                        // 해당 주소에 대한 좌표를 받아서\r\n");
      out.write("                        var coords = new daum.maps.LatLng(result.y, result.x);\r\n");
      out.write("                        // 지도를 보여준다.\r\n");
      out.write("                        mapContainer.style.display = \"block\";\r\n");
      out.write("                        map.relayout();\r\n");
      out.write("                        // 지도 중심을 변경한다.\r\n");
      out.write("                        map.setCenter(coords);\r\n");
      out.write("                        // 마커를 결과값으로 받은 위치로 옮긴다.\r\n");
      out.write("                        marker.setPosition(coords)\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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