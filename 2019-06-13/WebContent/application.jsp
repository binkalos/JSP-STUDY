<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

getServerInfo() : <%= application.getServerInfo() %><br>
getRealPath() : <%= application.getRealPath("/1.jsp") %><br><!-- 이게 웹 컨텐트의 물리적인 경로 -->

<%
application.log("2019.6.20 update by Lee");
%>

</body>
</html>