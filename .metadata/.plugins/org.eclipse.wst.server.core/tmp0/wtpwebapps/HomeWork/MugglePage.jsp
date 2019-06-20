<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="MugglePageStyle.css" >
<title>Muggle shop</title>
</head>
<body>
	<%
		String contentPage2 = request.getParameter("CONTENTPAGE2");
	%>
	<jsp:include page="Muggletop.jsp"/>
	<jsp:include page="Mugglesubmenu.jsp"/>
	
	<jsp:include page="Muggleleft.jsp"/>
	
	<jsp:include page="<%= contentPage2 %>"/>
	
	
</body>
</html>