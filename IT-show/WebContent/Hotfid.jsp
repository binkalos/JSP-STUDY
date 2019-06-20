<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이번달 인기음식</title>
<link rel="stylesheet" href="HotTipStyle.css" >
<script src="js/jquery-3.3.1.min.js"></script>
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
</head>
<body>
	<!-- Top -->
	<%@ include file="TopWrapper.jsp"%>
	<!-- Center -->
		<div class="center">
		<div class="toptip-wrapper"><!-- 메인 팁 담고있는  div -->
	<%   
    request.setCharacterEncoding("utf-8");
	String imgPath = null;
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/mucktip?serverTimezone=UTC&useSSL=false";
	String id = "root";
	String pw = "alflarhkgkrrh1!";
	

	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		 
		pstmt = con.prepareStatement("select * from hotfid");
		rs = pstmt.executeQuery();
	
		if(rs.next()) {
%>
			<div class="maintip" style="background-image:url('img/<%=rs.getString("img") %>');background-size:cover;
				width:600px; height:600px;">
	<%
		}
	%>
				<div class="maintip-inner-wrapper" >
				
				<div class="collection-information">
					<div class="collection-title-wrapper">
						<div class="collection-title-border">
						<p class="collection-title" style="overflow-wrap:break-word;">
							"6월의 인기 음식"<br>"BEST 유행 음식"</p>
						</div><!-- collection-title-border -->
					</div><!-- collection-title-wrapper -->
					
						<p class="collection-description-wrapper" style="overflow-wrap:break-word;">
							"핵인싸가 되고 싶다면..."<br>
						</p><!-- collection-description-wrapper -->
					</div><!-- collection-information -->
				
				</div><!-- maintip-inner-wrapper -->
			  	</div><!-- maintip -->
			  	
			 <div class="nexttip-wrapper">
			 	<div class="nexttip">
			 		<% 	
						pstmt = con.prepareStatement("select * from nexttip");
						rs = pstmt.executeQuery();
							
							if(rs.next()) {
					%>
								<img class="nexttipimg" src="img/<%=rs.getString("img") %>">
					<% 		} %>
			 		<div class="collection-information-right">
					<div class="collection-title-wrapper">
						<div class="collection-title-border">
						<p class="collection-title-right" style="overflow-wrap:break-word;">
							"이번달 인기음식을 다 먹어봤다면?"<br>"이번주 음식 보러가기GG"<br>
							<a class="go-nextpage" href="nextTip.jsp">
								<img class="nextIcon" src="img/nextIcon.png">
							</a>
						</p>
						</div><!-- collection-title-border -->
					</div><!-- collection-title-wrapper -->
					
					</div><!-- collection-information -->
			 	</div><!-- nexttip -->
			 </div><!-- nexttip-wrapper -->
			 
		</div><!-- toptip-wrapper -->
		
		<div class="maintip-feed">
		
			<div class="maintip-contents" style="height: 1550px;"> <!-- 전체 박스 -->
			
				<!-- 첫번째 줄 -->
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					<a class="open-fullview" href="#">게시글</a>
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				
				<!-- 두번째 줄 -->
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				
				<!-- 세번째 줄 -->
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				<div class="mucktip-card"> <!-- 각 게시글 박스 -->
					게시글
				</div>
				
			</div> <!-- maintip-contents -->	
		</div><!-- maintip-feed -->	
		
		</div><!-- center -->
<% }catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
%>
		
	<!-- Footer -->
	<%@ include file="fullView.jsp" %>
	<%@ include file="footer.jsp" %>
</body>
</html>