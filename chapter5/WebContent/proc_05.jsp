<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String name=request.getParameter("name");
	String local=request.getParameter("local");
	String tel = request.getParameter("tel");
	String localNumber = request.getParameter("localnum");
	int age = Integer.parseInt(request.getParameter("age"));
	String localNum = "";
	String localName="";
	
	if(local.equals("서울")){
		localNum="02";
		
	}else if(local.equals("경기")){
		localNum="03";
	
	}
	
	switch(localNumber){
	case "0":
		localName="서울0"; break;
	case "1":
		localName="서울1"; break;
	case "2":
		localName="서울2"; break;
	case "3":
		localName="서울3"; break;
	case "4":
		localName="서울4"; break;
		
	}
	out.println(name+" 님의 전화번호는" + localNum + "-" + tel + "입니다." +"<br>"+ "지역은" + localName + "이고, 나이는 " + age);
	
%>