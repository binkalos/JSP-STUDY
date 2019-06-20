<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
아아<br>

<%!
	String str1 = "전역변수"; //멤버 변수
%>

아아2<br>

<%!
	public String getStr() {
		return str1;
	}
%>

아아3<br>

<%
	String str2 = "지역변수";
	out.println(str1 + "<br>");
	out.println(str2 + "<br>");
%>

<%= str1 %> <br>
<%= str2 %> <br>

<%
String str[]={"jsp","java","HTML5","Android"};
int i = (int)(Math.random()*str.length);
%>
<%=str[i]%>재미있다.
<br>
<%
StringBuffer sf = new StringBuffer("한강가자 우리 눈누");
sf.reverse();
out.println(sf.toString());
%>
<br>

<%
out.println(sf);%>