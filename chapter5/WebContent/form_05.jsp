<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="proc_05.jsp" method="post">
	이름:<input type="text" name="name"><br>
	전화번호:<select name="local">
			 <option value="서울">서울</option>
			 <option value="경기">경기</option>
		   </select>
		   -
		   <input type="text" name="tel"><br>
	지역:<br>
	<input type="radio" name="localnum" value="0">0<br>
	<input type="radio" name="localnum" value="1">1<br>
	<input type="radio" name="localnum" value="2">2<br>
	<input type="radio" name="localnum" value="3">3<br>
	<input type="radio" name="localnum" value="4">4<br>
	
	나이 : <input type="text" name="age"><br>
	
	<input type="submit" value="입력완료">
</form>
</body>
</html>