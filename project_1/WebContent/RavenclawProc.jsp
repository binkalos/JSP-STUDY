<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="RavenclawStyle.css" >
<title>Ravenclaw</title>
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
	<!-- 기숙사 별 로고  -->
	<img src="img/r.PNG" class="rimg">
	
	<!--  Ravenclaw -->
<div class="uniform-wrapper">
	<p class="uniform"><b>Uniform</b><p class="dollar">- 5 Galleon</p></p>
	
		<div onclick="imgbigview('img/rc.png','bigimg'); return false;" class="imgbigview">
		<img src="img/rc.png" class="rcimg" id="thumbnail">
		<h4 class="rch"> Ravenclaw uniform</h4>
		</div>
	
	<p class="add-uniform"><b>Cloths</b><p class="dollar2">- 3 Galleon</p></p>
	
		<div onclick="imgbigview('img/rh.PNG','bigimg'); return false;">
		<img src="img/rh.PNG" class="rhimg" id="thumbnail">
		<h4 class="rhh">Winter hat</h4>
		</div>
		
		<div onclick="imgbigview('img/rs.PNG','bigimg'); return false;">
		<img src="img/rs.PNG" class="rsimg" id="thumbnail">
		<h4 class="rsh">Muffler</h4>
		</div>
		
		<div onclick="imgbigview('img/rtie.PNG','bigimg'); return false;">
		<img src="img/rtie.PNG" class="rtieimg" id="thumbnail">
		<h4 class="rtieh">Tie</h4>
		</div>
		
	<p class="stick"><b>Wands</b><p class="dollar3">- Free for Wizard</p></p>
	
		<div onclick="imgbigview('img/j1.PNG','bigimg'); return false;">
		<img src="img/j1.PNG" class="j1img" id="thumbnail">
		<h4 class="j1h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
		<div onclick="imgbigview('img/j2.PNG','bigimg'); return false;">
		<img src="img/j2.PNG" class="j2img" id="thumbnail">
		<h4 class="j2h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
		<div onclick="imgbigview('img/j3.PNG','bigimg'); return false;">
		<img src="img/j3.PNG" class="j3img" id="thumbnail">
		<h4 class="j3h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
		<div onclick="imgbigview('img/j4.PNG','bigimg'); return false;">
		<img src="img/j4.PNG" class="j4img" id="thumbnail">
		<h4 class="j4h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
		<div onclick="imgbigview('img/j5.PNG','bigimg'); return false;">
		<img src="img/j5.PNG" class="j5img" id="thumbnail">
		<h4 class="j5h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
		<div onclick="imgbigview('img/j6.PNG','bigimg'); return false;">
		<img src="img/j6.PNG" class="j6img" id="thumbnail">
		<h4 class="j6h">Collectible Wand by<br>The Noble Collection</h4>
		</div>
		
	<!-- 상세이미지 보여주는 공간
	<div id="bigimg" style="display:none;">
	<img src="" onclick="hide('bigimg')">
	</div>
	-->
</div>
</body>
</html>