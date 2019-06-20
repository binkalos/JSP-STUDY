<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="proc_06.jsp" method="post">
	취미 :<br>
	<select name="hobby">
		<option value="sleep">잠</option>
		<option value="bike">자전거</option>
	</select><br>
	
	전화번호:<select name="telnum1">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="012">012</option>
		   </select>-<input type="text" size="5" name="telnum2">-<input type="text" size="5" name="telnum3"><br>
	주소:<br>
	<input type="radio" name="address" value="seoul1">서울<br>
	<input type="radio" name="address" value="seoul2">서울<br>
	<input type="radio" name="address" value="seoul3">서울<br>
	<input type="radio" name="address" value="seoul4">서울<br>
	
	나이:<input type="text" name="age"><br>
	
	<input type="submit" value="전송">
</form>
</body>
</html>