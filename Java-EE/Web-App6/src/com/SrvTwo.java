package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
PrintWriter out=response.getWriter();
		
		out.println("<h1>SrvTwo Servlet");
		
		HttpSession session= request.getSession(false);
		 
		 out.println("<h2>Session Id: "+session.getId());
		 out.println("<h2>Is New? : "+session.isNew());
		 out.println("<h2>User Name: "+session.getAttribute("user"));
		 session.setMaxInactiveInterval(5);
		 //session.removeAttribute("user");
		 //session.invalidate();
		/*
		 * String s1= (String) request.getAttribute("user");
		 * 
		 * out.println("<h2>User Name: "+s1);
		 */
		
		
		
	}

}
