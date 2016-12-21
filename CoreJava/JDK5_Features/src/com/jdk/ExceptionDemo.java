package com.jdk;

import java.io.FileOutputStream;

public class ExceptionDemo {

	
	public static void main(String[] args) {
  //1.
		try
      {
    	  
      }catch(ArrayIndexOutOfBoundsException|ArithmeticException e){
    	  
      }
		
		//2.
		int x=782_77;
		int x2 = 0x101010;
		System.out.println(x2);
		//3.
		
		try(FileOutputStream out = new FileOutputStream("abc.txt"))
		{
			out.close();
		}catch(Exception e){
			
		}
		
		//4.
		int x3 =100;
		switch( x3)
		{
		case 100: System.out.println("ok");
		}
		
		/*String name ="abc";
		switch( name)
		{
		case "ty": System.out.println("ok");
		break;
		case "tdsady": System.out.println("ok");
		break
		case "ty": System.out.println("ok");
		}*/
		
	}

}
