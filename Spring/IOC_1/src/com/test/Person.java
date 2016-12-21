package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Person {
	private String age;
	private String name;
	private String[] lovers;
	private ArrayList mails;
	private HashSet jobs;
	private HashMap education;

	public Person() {
		System.out.println("Person()");
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getLovers() {
		return lovers;
	}

	public void setLovers(String[] lovers) {
		this.lovers = lovers;
	}

	public ArrayList getMails() {
		return mails;
	}

	public void setMails(ArrayList mails) {
		this.mails = mails;
	}

	public HashSet getJobs() {
		return jobs;
	}

	public void setJobs(HashSet jobs) {
		this.jobs = jobs;
	}

	public HashMap getEducation() {
		return education;
	}

	public void setEducation(HashMap education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", lovers="
				+ Arrays.toString(lovers) + ", mails=" + mails + ", jobs="
				+ jobs + ", education=" + education + "]";
	}

}
