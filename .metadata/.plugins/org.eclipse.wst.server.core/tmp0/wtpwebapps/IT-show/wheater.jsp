<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="firstPageStyle.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/jquery.xdomainajax.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/weather_js.js"></script>
<script>
	$(document).ready(function(){
		$(".open-fullview").click(function() {
			$("#dim-layer").css("display", "block");
		});
		
		$(".close-fullview").click(function() {
			$("#dim-layer").css("display", "none");
		});
	});

</script>
<script type="text/javascript">
    realTimeWeather();
</script>
<title>날씨 연습</title>
</head>
<body>
<%@ include file="TopWrapper.jsp"%>
<%--
	//연결 + 옵션 설정하기
	String url = "";
	url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2647061000";
	
	DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	Document doc = docBuilder.parse(url);
	doc.setDocumentURL(url);
	
	NodeList nodeMomList = doc.getDocumentElement().getChildNodes();
	List xmlList = new ArrayList();
	
--%>
<!--  
  <div class="vis-weather">
        <h2 class="vh_hide">날씨정보</h2>
        <p class="weather-date"></p>
        <ul>
            <li class="weather-temp"></li>
            <li id="RN1">시간당강수량 : ?</li>
            <li class="weather-state-text"></li>
        </ul>
    </div>
    -->
    
    <div class="weather">
    	<!-- 오른쪽에 이미지 -->
    	<div class="weather-img">
    		<!-- 날씨에 따라 이미지 들어가기..?? 가능? -->
    	</div>
    	<!-- 왼쪽에 정보 -->
    	<div class="vis-weather">
	        <h2 class="vh_hide">날씨정보</h2>
	        <p class="weather-date"></p>
	        <ul>
	            <li class="weather-temp"></li>
	            <li id="RN1">시간당강수량 : ?</li>
	            <li class="weather-state-text"></li>
	        </ul>
    	</div>
    </div><!-- weather -->
    
    <div class="top-bar">
			<p class="top-label">추천음식</p>
		</div>
		
		<div class="muktip-contents" style="height: 1550px;"> <!-- 전체 박스 -->
		
			<!-- 첫번째 줄 -->
			<div style="top:0px; left:0px;"> <!-- 각 게시글 박스 -->
				<a class="open-fullview" href="#">게시글</a>
			</div>
			<div style="top:0px; left:260px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:0px; left:520px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:0px; left:780px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			
			<!-- 두번째 줄 -->
			<div style="top:310px; left:0px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:310px; left:260px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:310px; left:520px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:310px; left:780px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			
			<!-- 세번째 줄 -->
			<div style="top:620px; left:0px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:620px; left:260px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:620px; left:520px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			<div style="top:620px; left:780px;"> <!-- 각 게시글 박스 -->
				게시글
			</div>
			
		</div> <!-- muktip-contents -->	
		</div><!-- muktip-feed -->	
	
		</div><!-- top-tip-fid -->
	</section><!-- main-page -->
	
	<%@ include file="fullView.jsp" %>
	<%@ include file="footer.jsp" %>
</body>
</html>