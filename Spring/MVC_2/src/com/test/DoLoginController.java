package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;



public class DoLoginController extends SimpleFormController {
       
    protected ModelAndView onSubmit(HttpServletRequest request,
    		HttpServletResponse response, Object command, BindException errors)
    		throws Exception {
    	
    	Login login = (Login)command;
    	System.out.println(login.getPassword());
    	System.out.println(login.getUsername());
    	
    	System.out.println(request.getSession().getId());
    	
    	return new ModelAndView("success.jsp");
    }

}
