<%@page import="com.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Product Page</h1> <hr/>
<%
Product prod= (Product) request.getAttribute("product");
out.println("<h1>Product Id: "+prod.getProdId());
out.println("<h1>Product Nane: "+prod.getProdName());
out.println("<h1>Price: "+prod.getPrice());


%>



</body>
</html>