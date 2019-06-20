<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	
	if(age>=20){
		out.println("<b>" + name + "</b>님은 20세 이상이라 주류구입 가능");
	}else{
		out.println("<b>" + name + "</b>님은 20세 미만이라 주류구입 불가능");
	}
%>
</body>
</html>