<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id:<%= config.getInitParameter("id") %><br>
pw:<%= config.getInitParameter("pw") %><br>
name:<%= config.getInitParameter("name") %><br>

<hr>
getServeltName() : <%=config.getServletName() %><br>

<%
	Enumeration en = config.getInitParameterNames();
while(en.hasMoreElements()){
	String initkey = (String)en.nextElement();
	String initvalue = config.getInitParameter(initkey);
	out.println(initkey + "<br>" + initvalue + "<br>");
}
%>

<% //exception.printStackTrace(); 
Exception e = new Exception();
e.printStackTrace();
%>
</body>
</html>