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

	String names[]={"프로토콜 이름","서버이름","메소드 방식","컨텍스트 경로","URI","접속한 클라이언트의 IP"};
	String values[]={request.getProtocol(),request.getServerName(),request.getMethod(),request.getContextPath(),request.getRequestURI(),request.getRemoteAddr()};
	
	for(int i = 0;i<names.length;i++){
		out.print(names[i]+":"+values[i]+"<br>");
	}
%>
<hr>
<%
	 Enumeration en = request.getHeaderNames();
	 while(en.hasMoreElements()){
			String headerKey = (String)en.nextElement();
			String headerValue = (String)request.getHeader(headerKey);
			out.print(headerKey+"<br>");
	}
%>
</body>
</html>