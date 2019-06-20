<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="HarryfirstStyle.css" >
<title>첫화면</title>
</head>
<body>

	<jsp:include page="top.jsp"/>
	<hr><!-- 일단 공간 나누는 정도로 사용 -->
	
	<!-- 질문 -->
	<div class="center">
		<div class="question-wrapper">
				<img src="img/question.png" class="question">
			
			<form action="checked.jsp" method="post">

					<div class="checked-user">
						<label class="Wizard">
							<input type="radio" name="whoareyou" value="0" class="wradio">
							<img src="img/wizard.png" class="wimg">
						</label>
						<label class="Muggle">
							<input type="radio" name="whoareyou" value="1" class="mradio">
							<img src="img/muggle.png" class="mimg" >
						</label>
					</div><!--checked-user-->
			
					 	<button type="submit" class="ok">
							<img src="img/ok.png" class="okimg">
						</button>
			
			</form>	
		</div><!-- question-wrapper -->
		
	</div><!-- center -->
	
	<!-- footer -->
		<jsp:include page="Harryfooter.jsp"/>
</body>
</html>