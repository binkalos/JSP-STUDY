<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기-결과화면</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name= request.getParameter("name");
	String title= request.getParameter("title");
	String content= request.getParameter("content");
	
	Date date = new Date();
	Long time = date.getTime();
	String filename=time+".txt";
	
	PrintWriter writer = null;
	String result=null;
	
	try{
		String filepath = application.getRealPath("/WEB-INF/bbs/"+filename);
		writer = new PrintWriter(filepath);
		writer.println("제목 : " + title + "<br>");
		writer.println("글쓴이 : " + name + "<br>");
		writer.println(content);
		writer.flush();
		result = "OK";
		//out.println("게시물이 저장되었습니다.");
	}catch(Exception e){
		e.printStackTrace();
		result="fail";
	}finally{
		writer.close();
		response.sendRedirect("boardResult.jsp?result="+result);
	}
%>
</body>
</html>

<meta http-equiv='refresh' content='3;url=main.jsp'>