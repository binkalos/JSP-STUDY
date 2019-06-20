<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String gen = request.getParameter("gen");
	
	if(gen.equals("M")){
		gen="남자";
	}else{
		gen="여자";
	}
	
	String inotice = request.getParameter("inotice");
	String cnotice = request.getParameter("cnotice");
	String dnotice = request.getParameter("dnotice");
	
	String hero = request.getParameter("hero");
	
%>
이름 : <%= name%><br>
ID : <%= id%><br>
PW : <%= pw %><br>
성별 : <%= gen%><br>

공지메일 : <%= notice(inotice)%><br>
광고메일 : <%= notice(cnotice)%><br>
배송메일 : <%= notice(dnotice)%><br>
 
<%!
//메소드 만들때는 <%! 쓰고 출력할때는 <%= 쓰고 순수자바는 <% 이거 사용 
	public String notice(String notice){
		if(notice==null){
			return "받지않음";
		}else if(notice.equals("on")){
			return "받음";
		}else{
			return notice;
		}
	}
%>

영웅 : <%= hero%><br>