<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setStatus(200);
%>

이런 에러가 발생했군요... <br>
최대한 빠르게 복구하겠습니다... <br>

<b>예외 타입</b> : <%= exception.getClass().getName() %>
<br>
<b>예외 메시지</b> : <%= exception.getMessage() %>















</body>
</html>