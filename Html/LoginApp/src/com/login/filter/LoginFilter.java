package com.login.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginFilter implements Filter {

   
    public LoginFilter() {
    	System.out.println("LoginFilter LoginFilter() ");
    }

	
	public void destroy() {
		System.out.println("LoginFilter destroy()");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("LoginFilter doFilter() entry");
		String username = request.getParameter("username");
		if("abc".equals(username)){
			chain.doFilter(request, response);
		}else{
			response.getOutputStream().print("Invalid user");
		}
		
		System.out.println("LoginFilter doFilter() exit");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("LoginFilter init()");
	}

}
