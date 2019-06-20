<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>


<% 
if(id.equals("choi")){
	out.println("회원");
	if(pw.equals("1234")){
		out.println("로그인 성공");%>
		<jsp:forward page="LoginOK.jsp" />  
<%	}else{%>

	<jsp:forward page="login.jsp" />
		
<%	}
}else{%>
	<jsp:forward page="insert.jsp" />
<%}%>