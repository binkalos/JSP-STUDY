<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
getProtocol() : <%= request.getProtocol() %><br>
getServername() : <%= request.getServerName() %><br>
getMethod() : <%= request.getMethod() %><br>
getQueryString() : <%= request.getQueryString() %><br> <!-- 요즘 사용하지 않음 -->
getRequestURI() :<%= request.getRequestURI() %><br>
getRequestURL() :<%= request.getRequestURL() %><br><!-- 전체 주소 다 나옴 -->
getRemoteHost() :<%= request.getRemoteHost() %><br>
getRemoteAddr() :<%= request.getRemoteAddr() %><br>
getServerPort() : <%= request.getServerPort() %><br>
getContextpath() : <%= request.getContextPath() %><br>
</body>
</html>