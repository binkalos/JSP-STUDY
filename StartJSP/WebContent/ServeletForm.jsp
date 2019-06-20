<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ServletProc" method="post"><!-- servelet으로 바로 넘겨주기 위해  -->
<!-- post(url나오지 않음 보안 좋음)로 넘기기 위해서 method사용 기본값이 get방식이기 때문 -->
이름 : <input type="text" name="name" size="10"> <br>
아이디 : <input type="text" name="id" size="10"> <br>
비밀번호 : <input type="password" name="pw" size="10"> <br>
취미 : <input type="checkbox" name = "hobby" value="read"> 독서 
	 <input type="checkbox" name = "hobby" value="cook"> 요리
	 <input type="checkbox" name = "hobby" value="swim"> 수영
	 <input type="checkbox" name = "hobby" value="sleep"> 낮잠
<br>

	 <input type="radio" name="major" value="kor">국어
	 <input type="radio" name="major" value="eng">영어
	 <input type="radio" name="major" value="mat">수학
	 <input type="radio" name="major" value="jsp" checked>웹 프로그래밍
<br>

<select name="protocal">
	<option value="http">http</option>
	<option value="ftp">ftp</option>
	<option value="smtp">smtp</option>
	<option value="pop">pop</option>
	<br>
</select>

<input type="submit" value="전송"><!-- button은 유효성 체크를 하지만 submit은 유효성 체크 안함(속도 방면에서 지금은 submit사용) -->
<input type="reset" value="초기화">
</form>




</body>
</html>