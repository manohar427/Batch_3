package com;


//client 
public class ThowDemo {

	public static void main(String[] args) {

		MyDriverClass mc = new MyDriverClass();
		Object o = null;
		try {
			o = mc.getDriver();
		} catch (ClassNotFoundException e) {
			System.out.println("Some exception happend at Servier side");
		}
		catch (ArithmeticException e) {
			System.out.println("Some exception happend at Servier side due to DOVIDE BY ZEORO");
		}catch (Exception e) {
			System.out.println("Some Unknown exception");
		}
		System.out.println("Object val :"+o);
	}
}
//server
class MyDriverClass
{
	public Object getDriver()throws ClassNotFoundException,ArithmeticException,Exception{
		Object obj = null;
		try {
			obj.getClass();
			obj = Class.forName("com.MyDriverClass");
			
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			throw e;
		}catch (ArithmeticException e) {
			throw e;
		}catch(Exception e){
			throw e;
		}
		
		return obj;
	}
}

