<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
 response.setDateHeader ("Expires", 0); //prevents caching at the proxy server  
%>
<jsp:include page="Banner.jsp"/>
<jsp:include page="Menu.jsp"/><hr/>
<h1>About US Page</h1>
<h3>Line 1 of About us</h3>
<h3>Line 2 of About us</h3>

</body>
</html>