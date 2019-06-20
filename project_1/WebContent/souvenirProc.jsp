<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="souvenirStyle.css" >
<title>Souvenir</title>
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
<div class="souvenir-wrapper">
	<p class="souvenir"><b>Souvenir</b></p>
	
		<h2 class="summer">Summer</h2><p class="dollar">- $29.95</p>
		
		<div onclick="imgbigview('img/ms1PNG','bigimg'); return false;">
		<img src="img/ms1.PNG" class="ms1" id="thumbnail">
		<h4 class="ms_1">Short T-shirt</h4>
		</div>
		
		<hr style="	left:480px; top:480px;">
		
		<h2 class="winter">Winter</h2><p class="dollar2">- $49.95</p>
		
		<div onclick="imgbigview('img/ms3.PNG','bigimg'); return false;">
		<img src="img/ms3.PNG" class="ms3" id="thumbnail">
		<h4 class="ms_3">Slytherin Hoodie</h4>
		</div>
				 
		<div onclick="imgbigview('img/ms4.PNG','bigimg'); return false;">
		<img src="img/ms4.PNG" class="ms4" id="thumbnail">
		<h4 class="ms_4">Hufflepuff Hoodie</h4>
		</div>
		
		<div onclick="imgbigview('img/ms5.PNG','bigimg'); return false;">
		<img src="img/ms5.PNG" class="ms5" id="thumbnail">
		<h4 class="ms_5">Gryfindor Hoodie</h4>
		</div>
		
		<div onclick="imgbigview('img/ms6.PNG','bigimg'); return false;">
		<img src="img/ms6.PNG" class="ms6" id="thumbnail">
		<h4 class="ms_6">Ravenclaw Hoodie</h4>
		</div>
		
		<div onclick="imgbigview('img/ms7.PNG','bigimg'); return false;">
		<img src="img/ms7.PNG" class="ms7" id="thumbnail">
		<h4 class="ms_7">Hogwarts Hoodie</h4>
		</div>
		
		<hr style="	left:480px; top:1350px;">
		
		<h2 class="cup">Cup</h2><p class="dollar3">- $14.41</p>
	
		<div onclick="imgbigview('img/ms8.PNG','bigimg'); return false;">
		<img src="img/ms8.PNG" class="ms8" id="thumbnail">
		<h4 class="ms_8">Hufflepuff Cup</h4>
		</div>
		
		<div onclick="imgbigview('img/ms9.PNG','bigimg'); return false;">
		<img src="img/ms9.PNG" class="ms9" id="thumbnail">
		<h4 class="ms_9">Slytherin Cup</h4>
		</div>
		
		<div onclick="imgbigview('img/ms10.PNG','bigimg'); return false;">
		<img src="img/ms10.PNG" class="ms10" id="thumbnail">
		<h4 class="ms_10">Ravenclaw Cup</h4>
		</div>
		
		<div onclick="imgbigview('img/ms11.PNG','bigimg'); return false;">
		<img src="img/ms11.PNG" class="ms11" id="thumbnail">
		<h4 class="ms_11">Gryfindor Cup</h4>
		</div>
		
		<hr style="	left:480px; top:2200px;">
		
		<h2 class="etc">ETC</h2><p class="dollar4">- $25.46</p>
		<div onclick="imgbigview('img/ms2PNG','bigimg'); return false;">
		<img src="img/ms2.PNG" class="ms2" id="thumbnail">
		<h4 class="ms_2">Magic House Hat</h4>
		</div>
		
	<!-- 상세이미지 보여주는 공간 
	<div id="bigimg" style="display:none;">
	<img src="" onclick="hide('bigimg')">
	</div>
	-->
</div>
	
</body>
</html>