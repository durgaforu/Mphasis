package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String pid= request.getParameter("prodId");
		String pname=request.getParameter("prodName");
		double price=Double.parseDouble(request.getParameter("price"));
		String desc=request.getParameter("description");
		String store=request.getParameter("storeName");
		String membership=request.getParameter("membership");
		String tax[]=request.getParameterValues("tax");
		
		
		
		out.println("<h2>Product Id: "+pid);
		out.println("<h2>Name: "+pname);
		out.println("<h2>Price: "+price);
		out.println("<h2>Description: "+desc);
		out.println("<h2>Store: "+store);
		out.println("<h2>Membership Type:: "+membership);
		out.println("<h2>Tax Info</h2>");
		for(String t:tax) {
			out.println("<h2>"+t);
		}
		
		out.println("<h2><a href='Form.html'>Add Another  Record</a>");
		

	}
	
	
}
