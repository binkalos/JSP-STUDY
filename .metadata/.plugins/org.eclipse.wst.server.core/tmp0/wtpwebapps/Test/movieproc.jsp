<%@page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  String dirPath = application.getRealPath("/WEB-INF/movie");
  //out.println(dirPath);
  File dir = new File(dirPath);
  String FileNames[] = dir.list();
  
  //for(int i = 0; i<FileNames.length;i++){
	 // out.print(FileNames[i]+"<br>");
  //}
%>
<h4>영화 목록</h4>
<%
for(String filename :FileNames){%>
	<a href="movieReader.jsp?FILE=<%=filename%>"><%= filename %></a><br>
<%}
%>
</body>
</html>