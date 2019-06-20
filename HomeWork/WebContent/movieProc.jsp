<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="movieStyle.css" >
<title>Movie</title>
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
<div class="movie-wrapper">
	<p class="movie"><b>Movie</b></p><p class="dollar">- $14.99</p>
		
		<h2 class="first">first-DVD</h2>
		<div onclick="imgbigview('img/m1.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m1.PNG" class="m1" id="thumbnail">
		<h4 class="m_1">harry potter and<br>the sorcerer's stone</h4>
		</div>
	  	
	  	<h2 class="second">second-DVD</h2>
		<div onclick="imgbigview('img/m2.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m2.PNG" class="m2" id="thumbnail">
		<h4 class="m_2">harry potter and <br>the chamber of secrets</h4>
		</div>
		 
		<h2 class="third">third-DVD</h2>
		<div onclick="imgbigview('img/m3.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m3.PNG" class="m3" id="thumbnail">
		<h4 class="m_3">harry potter and <br>the prisoner of azkaban</h4>
		</div>
		
		<h2 class="forth">forth-DVD</h2>
		<div onclick="imgbigview('img/m4.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m4.PNG" class="m4" id="thumbnail">
		<h4 class="m_4">harry potter and <br>the goblet of fire</h4>
		</div>
		
		<h2 class="fifth">fifth-DVD</h2>
		<div onclick="imgbigview('img/m5.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m5.PNG" class="m5" id="thumbnail">
		<h4 class="m_5">harry potter and <br>the order of the phoenix</h4>
		</div>
		
		<h2 class="sixth">sixth-DVD</h2>
		<div onclick="imgbigview('img/m6.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m6.PNG" class="m6" id="thumbnail">
		<h4 class="m_6">harry potter and <br>the half blood prince</h4>
		</div>
		
		<h2 class="seventh">seventh-DVD</h2>
		<div onclick="imgbigview('img/m7.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/m7.PNG" class="m7" id="thumbnail">
		<h4 class="m_7">harry potter and <br>the deathly hallows</h4>
		
		<hr>
		
		<h2 class="all">ALL-DVD</h2><p class="dollar2">- $99.98</p>
		<div onclick="imgbigview('img/all.PNG','bigimg'); return false;" class="imgbigview">
		<img src="img/all.PNG" class="allm" id="thumbnail">
		<h4 class="all_m">harry potter collection DVD</h4>
		
</div>	
	
	<!-- 상세이미지 보여주는 공간 
	<div id="bigimg" style="display:none;">
	<img src="" onclick="hide('bigimg')">
	</div>
	-->
</body>
</html>