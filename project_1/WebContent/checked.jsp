<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String whoareyou = request.getParameter("whoareyou");
	String whoiam="";
	switch(whoareyou){
		case "0": 
			//whoiam = "Wizard(마법사)";
			%>
			<jsp:forward page="gripin.jsp"/>
		<% 	break;
		case "1": 
			//whoiam = "Muggle(사람)"; 
			%>
			<jsp:forward page="book.jsp"/>
		<%	break;
	}
%>
