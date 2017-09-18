package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("---- Welcome to SrvOne");

		PrintWriter out = response.getWriter();
		String s1 = "Praveen";
		
		out.println("<h1>My First Servlet Aplication</h1>");
		out.println("<h1>Welcome dear " + s1);

	}

}
