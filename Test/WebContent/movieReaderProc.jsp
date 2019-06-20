<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
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
	request.setCharacterEncoding("UTF-8");
	String filename = request.getParameter("FILE");
%>
<h4>파일이름:<%= filename  %></h4>
<%
	BufferedReader reader = null;
	try{
		String filepath = application.getRealPath("/WEB-INF/movie");
		reader = new BufferedReader(new FileReader(filepath));
		
		while(true){
			String str = reader.readLine();
			if(str==null)break;
			out.println(str+"<br>");
		}
	}catch(Exception e){
		
	}finally{
		reader.close();
	}
%>


</body>
</html>