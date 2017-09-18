package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvThr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>SrvThr Servlet</h1>");
		out.println("<h1>First line of  SrvThr</h1>");
		out.println("<h2>Employee Name in SrvThr is "+request.getAttribute("ename"));
		out.println("<h1>Last  line of  SrvThr</h1>");

	}

}
