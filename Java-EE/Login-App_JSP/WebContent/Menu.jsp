<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
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
<center>
<a href="Welcome.jsp">Home</a> |
<a href="AboutUs.jsp">About Us</a> |
<a href="Clients.jsp">Clients</a> |
<a href="Products.jsp">Products</a> |
<a href="Logout">Logout</a> |
User: ${sessionScope.user}
</center>
</body>
</html>