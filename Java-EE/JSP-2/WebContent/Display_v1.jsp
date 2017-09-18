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
	<h1 align="center">Welcome to Product Page</h1>
	<hr />

	<jsp:useBean id="prod" class="com.Product" scope="request" />

	<table align="center">

		<tr>
			<th>Product Id</th>
			<th>Produt Name</th>
			<th>Price</th>
		</tr>

		<tr>
			<td><jsp:getProperty property="prodId" name="prod" /></td>
			<td><jsp:getProperty property="prodName" name="prod" /></td>
			<td><jsp:getProperty property="price" name="prod" /></td>
		</tr>


	</table>

	<hr />

</body>
</html>