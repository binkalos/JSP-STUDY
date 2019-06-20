<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="choi.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>







안녕하세요 <br>
 
<%
	String name = "홍길동";
	out.println(name + "의 홈페이지 입니다. <br>");
	for(int i=1; i<7; i++) {
		out.print("<h" + i + ">");  //<h1><h2><h3>......<h6>
		out.print("방탄소년단 최고~~");
		out.print("</h" + i + ">");		
	} //for
%>

<hr>

<%= new Date() %>

<br>
<%
	int a = 0, sum = 0;
	do {
		a++;
		sum += a;
	} while(a<10);

	out.println("10까지의 합은 " + sum + "입니다. <br>");
%>

<%= "10까지의 합은 " + sum + "입니다." %> <br>

<br>

<%= name + "님의 전화는 " + tel + "입니다." %> <br>

<%! 
	String tel = "123-4567"; 

	public int add(int a, int b) {
		return a+b;
	}
%>

<br>

<%
	out.println(add(10, 20));
%>

<br>

<%= add(10,20) %>


















<%= 10 / 0 %>



</body>
</html>