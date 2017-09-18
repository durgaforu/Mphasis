package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		out.println("<h1>SrvTwo Servlet</h1>");
		out.println("<h1>First line of  SrvTwo</h1>");
		out.println("<h2>Employee Name is "+request.getAttribute("ename"));
		
		RequestDispatcher rd=request.getRequestDispatcher("SvThr");
		rd.include(request, response);
		
		out.println("<h1>Last line of  SrvTwo</h1>");
		
		
		
		

		
	}

}
