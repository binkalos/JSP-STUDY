<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="bookStyle.css" >
<title>Book</title>

  <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                  
                var xOffset = 10;
                var yOffset = 30;
 
                $(document).on("mouseover","#thumbnail",function(e){ //마우스 오버시
                     
                    $("body").append("<p id='preview'><img src='"+ $(this).attr("src") +"' width='400px' /></p>"); //보여줄 이미지를 선언                       
                    $("#preview")
                        .css("top",(e.pageY - xOffset) + "px")
                        .css("left",(e.pageX + yOffset) + "px")
                        .fadeIn("fast"); //미리보기 화면 설정 셋팅
                });
                 
                $(document).on("mousemove","#thumbnail",function(e){ //마우스 이동시
                    $("#preview")
                        .css("top",(e.pageY - xOffset) + "px")
                        .css("left",(e.pageX + yOffset) + "px");
                });
                 
                $(document).on("mouseout","#thumbnail",function(){ //마우스 아웃시
                    $("#preview").remove();
                });
                  
            });
        </script>
             
        <style>
            /* 미리보기 스타일 셋팅 */
            #preview{
                z-index: 9999;
                position:absolute;
                border:0px solid #ccc;
                background:#333;
                padding:1px;
                display:none;
                color:#fff;
            }
        </style>


</head>
<body>
<div class="book-wrapper">
	<p class="book"><b>Book</b></p><p class="dollar">- $12.99</p>
		
		<h2 class="first">first-book</h2>
		<div onclick="imgbigview('img/book1.jpg','bigimg'); return false;" class="imgbigview">
		<img src="img/book1.jpg" class="book1" id="thumbnail">
		<h4 class="book_1">harry potter and<br>the sorcerer's stone</h4>
		</div>
	  	
	  	<h2 class="second">second-book</h2>
		<div onclick="imgbigview('img/book2.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book2.PNG" class="book2" id="thumbnail">
		<h4 class="book_2">harry potter and <br>the chamber of secrets</h4>
		</div>
		 
		<h2 class="third">third-book</h2>
		<div onclick="imgbigview('img/book3.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book3.PNG" class="book3" id="thumbnail">
		<h4 class="book_3">harry potter and <br>the prisoner of azkaban</h4>
		</div>
		
		<h2 class="forth">forth-book</h2>
		<div onclick="imgbigview('img/book4.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book4.PNG" class="book4" id="thumbnail">
		<h4 class="book_4">harry potter and <br>the goblet of fire</h4>
		</div>
		
		<h2 class="fifth">fifth-book</h2>
		<div onclick="imgbigview('img/book5.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book5.PNG" class="book5" id="thumbnail">
		<h4 class="book_5">harry potter and <br>the order of the phoenix</h4>
		</div>
		
		<h2 class="sixth">sixth-book</h2>
		<div onclick="imgbigview('img/book6.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book6.PNG" class="book6" id="thumbnail">
		<h4 class="book_6">harry potter and <br>the half blood prince</h4>
		</div>
		
		<h2 class="seventh">seventh-book</h2>
		<div onclick="imgbigview('img/book7.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/book7.PNG" class="book7" id="thumbnail">
		<h4 class="book_7">harry potter and <br>the deathly hallows</h4>

</div>	
	
	<!-- 상세이미지 보여주는 공간 
	<div id="bigimg" style="display:none;">
	<img src="" onclick="hide('bigimg')">
	</div>
	-->
</body>
</html>