<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer="8kb"
    autoFlush="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
isAutoFlush() : <%=out.isAutoFlush() %><br>
getBuffersize() : <%=out.getBufferSize() %><br>
getRemaning() : <%=out.getRemaining() %><br>

<%out.flush(); %><br>

<hr>

<%
//JspWriter out2 = new JspWriter();
JspWriter choi = pageContext.getOut();
%>
<% out.print("hi"); %>
<% choi.print("hi"); %>

<hr>

<%
//HttpServletRequest request2 = new HttpServeletRequest();
ServletRequest lim = pageContext.getRequest();
String id1 = request.getParameter("id");
String id2 = request.getParameter("id");

%>
ID1:<%=id1 %><br>
ID1:<%=id2 %><br>
</body>
</html>