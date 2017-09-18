package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvOne extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		ServletContext application = getServletContext();

		ServletConfig config = getServletConfig();

		out.println("<h1>SrvOne Servlet");
		out.println("<h2>Company Name: " + application.getInitParameter("company"));
		out.println("<h2>Emp Id: " + config.getInitParameter("empId"));
		out.println("<h2>Emp Name: " + config.getInitParameter("empName"));

	}

}
