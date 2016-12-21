package com.object;

public class ObjectClassDemo {

	public static void main(String[] args) {
      Student std = new Student();
      System.out.println(std);
      System.out.println("HashCode Value:"+std.hashCode());
	}
}
class Student  extends Object
{
	public String toString() {
		return "My own toString()";
	}
	public int hashCode() {
		return super.hashCode();
	}
}
