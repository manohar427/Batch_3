package com.abst;

public class InterfaceDemo {
	
	public static void main(String[] args) {

		//1
		//2-100
		//3
		//4
		System.out.println(Car.price1);
		//5
		//Car.price = 1001;
		//6
		//Car c = new Car();
		
		Car car = new BMW();
		
		car.getDoor();
		car.getWheel();
		
	}

}

 interface Car
{
	static final int price1 = 1000;
	 public void getWheel();
	
	 public void getDoor();
	
}
 interface Car1
 {
	 static final int price2 = 100;
	 public void getWheel();
		
	 public void getDoor(); 
 }
 
 class A
 {
	 
 }
 class BMW extends A implements Car,Car1
 {
	 
	 public void getDoor() {
		System.out.println("My car Door");
	}
	 
	 public void getWheel() {
		 System.out.println("My car Wheel");
	}
 }