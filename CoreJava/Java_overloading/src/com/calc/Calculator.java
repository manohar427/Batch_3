package com.calc;

public class Calculator {

	public int add(int x, int y) {//10,20
		return x + y;
	}

	public String add(String a, String b) {//"abc","pqr"
		return a + b;
	}
	
	public String add(String a, int b) {//"abc","pqr"
		return a + b;
	}

	public double add(double a, double b) {//12.34,45.67
		return a + b;
	}
}
