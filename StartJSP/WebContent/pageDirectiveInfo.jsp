<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="2019.04.05두번째 수정" 
    import = "java.sql.Timestamp"
    import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page디렉티브 연습  - info속성</title>
</head>
<body>
<h2>page디렉티브 연습 - info속성</h2>
<%
Timestamp now = new Timestamp(System.currentTimeMillis());
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
String strDate = format.format(now);
%>