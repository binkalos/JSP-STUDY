<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>회원 정보 입력</h2>

<form action="proc.jsp" method="post">
이름 : <input type="text" name="name"><br>
ID : <input type="text" name="id"><br>
PW : <input type="password" name="pw"><br>
성별 : 남<input type="radio" name="gen" value="M">
	   여<input type="radio" name="gen" value="F" checked><br>
메일 수신 여부 : 공지메일<input type="checkbox" name="inotice">
			 광고메일<input type="checkbox" name="cnotice">
			 배송메일<input type="checkbox" name="dnotice"><br>
			 
<select name="hero">
	<option>라인</option>
	<option>디바</option>
	<option>정크렛</option>
	<option>메르시</option>
</select>

<input type="submit" value="확인">
<input type="reset" value="취소">
</form>