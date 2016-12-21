package com.jdk.enumdemo;

public class EnumDemo {

	public static void main(String[] args) {
		getPersonDetails(10, "Pqr", Gender.MALE);
	}

	public static void getPersonDetails(int age, String name, Gender gender) {
		System.out.println("Age:" + age + ",name:" + name + ",gender:" + gender);
	}
}
enum Gender
{
	MALE,FEMALE
}

