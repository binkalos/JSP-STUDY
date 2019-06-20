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
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String address = request.getParameter("address");
	%>
	
	<!-- DB에 insert 해주는 작업 필요함 -->

	<script>
		alert("회원가입에 성공하셨습니다!");
	</script>
	
	<meta http-equiv='refresh' content='1; url=login.jsp'>
</body>
</html>