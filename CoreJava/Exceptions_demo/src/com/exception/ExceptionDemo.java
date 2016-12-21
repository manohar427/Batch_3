package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		int avg = new ExceptionDemo().getAvg(10, 10, 0);
		System.out.println("Avg :" + avg);
	}

	public int getAvg(int a, int b, int c) {

		int avg = 0;
		try {
			
			
			System.out.println("Open DB connection");
			avg = (a + b) / c;
			
		} catch (ArithmeticException ex) {
			System.out.println("Exception occured : Dont pass 0 as input ");
		}finally{
			System.out.println("close db connection");
		}
		
		return avg;
	}
}
