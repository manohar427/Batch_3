package com.exception;

public class CompileExceptionDemo {

	public static void main(String[] args) {
		getDBConnection();
		
	}

	static public void getDBConnection(){
		
		try
		{
			Object obj = Class.forName("com.exception.ExceptionDemo");
			System.out.println(obj.getClass());
		}catch(ClassNotFoundException ex){
			System.out.println("Unable to fine this class");
		}
		
	}
}
