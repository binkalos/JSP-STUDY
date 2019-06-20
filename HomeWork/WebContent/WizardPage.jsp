<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="WizardPageStyle.css" >
<title>Wizard shop</title>
</head>
<body>
	<%
		String contentPage = request.getParameter("CONTENTPAGE");
	%>
	<jsp:include page="Wizardtop.jsp"/>
	<jsp:include page="submenu.jsp"/>
	
	<!-- left -->
	<jsp:include page="left.jsp"/>
	
	<jsp:include page="<%= contentPage %>"/>
	
</body>
</html>