<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link  rel="stylesheet" href="houseTestStyle.css" >
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<title>HouseTest</title>
   <script type="text/javascript">
			$(document).ready(function () {
		        $('.next').click(function () {
		          // getter
		          var radioVal = $('input[name="answer"]:checked').val();
		          var sum=0;
		          //alert(radioVal);
		          if(radioVal=="a1"){
		        	  sum+=1;
		          }else if(radioVal=="a2"){
		        	  sum+=2;
		          }else if(radioVal=="a3"){
		        	  sum+=3;
		          }else if(radioVal=="a4"){
		        	  sum+=4;
		          }
		          alert("sum :" + sum );
		        });
		        

   });
	</script>
</head>
<body>
	<div class="center">
		<p id="q">Question</p>
		<h2>사람들이 나를 (   ) 하면 좋겠다.</h2>
			<div class="radio">
				<input type="radio" name="answer" value="a1"> 1.용감하다고 생각
				<br>
				<input type="radio" name="answer" value="a2"> 2.높이 평가
				<br>
				<input type="radio" name="answer" value="a2"> 3.친절하다고 생각
				<br>
				<input type="radio" name="answer" value="a3"> 4.지혜롭다고 생각
			</div>
			
		<h2>당신이 가장 견디기 힘든것은?</h2>
			<div class="radio2">
				<input type="radio" name="answer" value="a1"> 1.용기 없이 숨는 것
				<br>
				<input type="radio" name="answer" value="a2"> 2.무시당하는것
				<br>
				<input type="radio" name="answer" value="a2"> 3.소외당하는 친구를 보는것
				<br>
				<input type="radio" name="answer" value="a3"> 4.멍청하다고 놀림받는것
			</div>
	</div>
	
	<div class="next-wrapper">
		<a href="houseTestProc2.jsp">
			<img src="img/next.png" class="next">
		</a>
	</div>
	

	
</body>
</html>