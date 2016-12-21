package com.jdk.annotation;

public class Annotation {

	
	public static void main(String[] args) {

	}

}
class A extends Object
{
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Deprecated
	public String getName(){
		return "Abc";
	}
}

class B extends A
{
	@Override
	public String getName() {
		return super.getName();
	}
}