package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>SrvOne Servlet</h1>");
		out.println("<h1>Line 1 SrvOne</h1>");

		request.setAttribute("ename", "Parveen");
		
		RequestDispatcher rd=request.getRequestDispatcher("SrvTwo");
		rd.include(request, response);
		out.println("<h1>Last line of  SrvOne</h1>");
		
		

		//response.sendRedirect("SrvTwo");
		
		

	}

}
