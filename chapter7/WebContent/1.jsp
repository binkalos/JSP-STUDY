<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1.jsp
<!-- 응답은 2.jsp가 한다 주소도 2.jsp(요청은 1.jsp에게 했지만 응답은2.jsp) -->
<%
	response.sendRedirect("2.jsp");
%>
</body>
</html>