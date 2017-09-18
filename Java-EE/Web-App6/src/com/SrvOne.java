package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();	
		out.println("<h1>SrvOne Servlet");
		
		 HttpSession session= request.getSession(true);
		 
		 out.println("<h2>Session Id: "+session.getId());
		 out.println("<h2>Is New? : "+session.isNew());
		 
		
		 session.setAttribute("user", "Praveen");
		 session.setAttribute("url", "abc.com");
		 session.setAttribute("reqType", "POST");
		
		
		/*request.setAttribute("user", "Praveen");
		out.println("Usrr Name: "+request.getAttribute("user"));*/
		
		//response.sendRedirect("SrvTwo");
		 //out.println("<h2><a href='SrvTwo'>Go to SrvTwo</a>");

		out.println("<h2><a href='SrvThr'>Go to SrvThr</a>");
		
		
		
		
		
		
	}

}
