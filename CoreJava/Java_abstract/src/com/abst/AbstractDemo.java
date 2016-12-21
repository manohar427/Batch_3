package com.abst;

public class AbstractDemo {
	
	public static void main(String[] args) {

		X_H xh = new X_H();
		//House h = new House();	
	}
}

abstract class House{
	public void getFloor(){
		System.out.println("House floor is cement");
	}
	
	abstract protected void getwindow();
}

class X_H extends House
{
	public void getwindow() {
     System.out.println("X_H window is glass");		
	}
}
