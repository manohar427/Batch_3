package com.listoner;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListoner implements HttpSessionListener {

   int activeCount  = 0;
    public MySessionListoner() {
    }

    public void sessionCreated(HttpSessionEvent arg0) {
    	++activeCount;
    	System.out.println("Current Active Count(New User Added) :"+activeCount);
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
    	--activeCount;
    	System.out.println("Current Active Count(User got removed) :"+activeCount);
    }
	
}
