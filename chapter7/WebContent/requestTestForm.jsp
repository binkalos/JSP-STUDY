<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="requestTestProc.jsp">
		이름:<input type="text" name="num"><br>
		학번:<input type="text" name="name"><br>
		학년:<input type="radio" name="gender" value="1">1학년
			<input type="radio" name="gender" value="2">2학년
			<input type="radio" name="gender" value="3" checked="checked">3학년
		<br>
		
		과목:<select name="subject">
				<option value="java">java</option>
				<option value="jsp">jsp</option>
				<option value="css">css</option>
			</select>
		<br>
		
		<input type="submit" value="입력완료">
		
	</form>
</body>
</html>