package com.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to Product Management App</h1>");
		
		HttpSession session=request.getSession(false);
		
		out.println("<h2>User Name: "+session.getAttribute("user"));
		out.println("<h2><a href='Logout'>Logout</a>");
		
		
		
		
	}

}
