package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
    	System.out.println("LoginServlet()");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" I am from do Get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" I am from do Post");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("User Name:"+userName);
		System.out.println("Password:"+password);
		
		
		response.getOutputStream().println(userName + "Loggged in successfully !");
		
		
		//Session :
		HttpSession session = request.getSession();
		session.setAttribute("MyName", "Abc");
		session.setMaxInactiveInterval(2);
		System.out.println("Session id:"+session.getId());
		
		System.out.println(session.getAttribute("MyName"));
		
	}

}
