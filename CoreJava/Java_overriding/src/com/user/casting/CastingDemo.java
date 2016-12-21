package com.user.casting;

public class CastingDemo {

	public static void main(String[] args) {
      
		House house = new X_House(); 
		
		//house.getFloor();
		//house.getWindow();
		
		X_House xh = (X_House)house;
		xh.getFloor();
		xh.getWall();
		xh.getWindow();
		
		
House house1 = new Y_house(); 
		
		//house.getFloor();
		//house.getWindow();
		
		Y_house xh1 = (Y_house)house1;
		xh1.getCeiling();
		xh1.getWindow();
		xh1.getCeiling();
		
		
	}

}
class House
{
	public void getWindow(){
		System.out.println("House window build with wood");
	}
	
	public void getFloor(){
		System.out.println("House Floor build with cement");
	}
}

class X_House extends House
{
	public void getFloor() {
		System.out.println("X_House Floor build with Marbles");
	}
	
	public void getWall(){
		System.out.println("X_House my wall color is white");
	}
}

class Y_house extends House
{
	public void getWindow(){
		System.out.println("Y_house window build with Glass");
	}
	public void getCeiling(){
		System.out.println("Y_house my sel is roof");
	}
}