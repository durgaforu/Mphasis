<%@page import="com.Product"%>
<%
	String s1 = request.getParameter("prodId");
	String s2 = request.getParameter("prodName");
	double s3 = Double.parseDouble(request.getParameter("price"));

	Product prod = new Product();
	prod.setProdId(s1);
	prod.setProdName(s2);
	prod.setPrice(s3);

	request.setAttribute("product", prod);

	RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
	rd.forward(request, response);
	

%>