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
<%
	request.setCharacterEncoding("utf-8");
	
	String num=request.getParameter("num");
	String name=request.getParameter("name");
	String grade=request.getParameter("grade");
	String subject=request.getParameter("subject");
	
	Enumeration en = request.getParameterNames();
%>
학번:<%=num %><br>
이름:<%=name %><br>
학년:<%=grade %><br>
과목:<%=subject %><br>
<hr>
<%
//키 값들만 나옴 만약 values값까지 나오게 하고 싶으면 String value = request.getParameter(key);
	while(en.hasMoreElements()){
		String key = (String)en.nextElement();//키값 옮겨주는거
		String value = request.getParameter(key);
		out.print(key+"<br>");
	}
%>
<hr>
<%
	request.setAttribute("일", "1");//직접 넣기 위해 사용
	request.setAttribute("이", "2");
	request.setAttribute("삼", "3");
	
%>
<%= request.getAttribute("이") %><!--한글 "이"에 값2가 나옴 -->

<%
	Enumeration en1 = request.getAttributeNames();

	while(en1.hasMoreElements()){
		String key = (String)en1.nextElement();//키값 옮겨주는거
		String value = request.getParameter(key);
		out.print(key+ ":" +"<br>" + value);
	}
%>
</body>
</html>