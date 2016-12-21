package com.app.user;

import com.app.calc.Calculator;


public class CalcUser extends Calculator{
	
	
  public static void main(String[] args) {
	  Calculator calc = new Calculator();
	  
	  int results = calc.add(10, 20);
	  System.out.println("results:"+results);
	  
	  CalcUser cuser = new CalcUser();
	  cuser.add(10, 20);
  }
}
