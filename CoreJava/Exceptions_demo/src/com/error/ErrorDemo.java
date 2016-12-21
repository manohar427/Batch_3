package com.error;

public class ErrorDemo {

	public static void main(String[] args) {
		getName();
	}

	static public void getName(){
		System.out.println("My Name is BBB....");
		getName();
	}
}
