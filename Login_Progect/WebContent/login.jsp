<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<script language="javascript">
	function check(){
		//alert("aaaaa");
		if(document.frm01.id.value ==""){
			alert("아이디를 입력해주세요!");
			document.frm01.id.focus();
			return;//유효성체크하는 함수
		}
		
		if(document.frm01.pw.value ==""){
			alert("비밀번호를 입력해주세요!");
			document.frm01.pw.focus();
			return;//유효성체크하는 함수
		}
		frm01.submit();
	}
</script>
</head>
<body>
<center>
	<form action="LoginProc.jsp" name="frm01" method="post">
		<table border=1>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" size=11></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="password" name="pw" size=12></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="로그인" onclick="check()">
				<input type="reset" value="취소">
				</td>
			</tr>
			
			</table>
	</form>

</center>
</body>
</html>