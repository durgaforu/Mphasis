package com.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.model.User;
import com.product.service.UserService;
import com.product.service.UserServiceImpl;


@WebServlet("/checkUser")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		User user=new User();
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		
		UserService userService=new UserServiceImpl();
		boolean status= userService.validateUser(user);
		
		if(status) {
			HttpSession session=request.getSession(true);
			session.setAttribute("user",user.getUserName());
			response.sendRedirect("Welcome");
		}else {
			response.sendRedirect("Login.html");
		}
		
		
		
		
		
	}

}
