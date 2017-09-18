package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SrvOne() {

		System.out.println("--- SrvOne Object Created");
	}
	
	
	
	
	
	
	public void init() {
		System.out.println("---  Initalizing the Servlet with init method");
	}
	
	public void destroy() {
		System.out.println("----- Servlet is Destroyed");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		out.println("<h1>Hello...</h1>");
		
		
	
		
		
		
	}

}
