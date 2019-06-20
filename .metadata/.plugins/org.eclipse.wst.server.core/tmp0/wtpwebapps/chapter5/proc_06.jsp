<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String hobby = request.getParameter("hobby");
	String tel1 = request.getParameter("telnum1");
	String tel2 = request.getParameter("telnum2");
	String tel3 = request.getParameter("telnum3");
	String tellocal="";
	String address=request.getParameter("address");
	String addressnum="";
	int age = Integer.parseInt(request.getParameter("age"));
	
	if(tel1.equals("010")){
		tellocal="서울에 사는 사람";
	}else if(tel1.equals("011")){
		tellocal="부산에 사는 사람";
	}else{
		tellocal="제주도에 사는 사람";
	}
	
	if(address.equals("seoul1")){
		addressnum="1번 지역";
	}else if(address.equals("seoul2")){
		addressnum="2번 지역";
	}else{
		addressnum="3번 지역";
	}
	

%>
취미:<%=hobby%><br>
전화번호 : <%=tel1%>-<%=tel2%>-<%=tel3%><br>
전화번호로 알 수 있는 지역 : <%=tellocal%><br>
주소:<%=address%><br>
주소상세번호:<%=addressnum%>