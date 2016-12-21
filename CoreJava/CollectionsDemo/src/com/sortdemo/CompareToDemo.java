package com.sortdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareToDemo {

	public static void main(String[] args) {
		Student c1 = new Student("Std 1", 34);
		Student c2 = new Student("Std 2", 567);
		Student c3 = new Student("Std 3", 10);
		
		List list  = new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.sort(list,new Student_IdCompare());
		
		System.out.println("ID Sort:"+list);
		Collections.sort(list,new Student_NameCompare());
		System.out.println("Name Sort:"+list);
	}

}
class Student 
{
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

class Student_IdCompare implements Comparator
{
	public int compare(Object arg0, Object arg1) {
		
		Student s1 = (Student)arg0;
		Student s2 = (Student)arg1;
		return s1.id-s2.id;
	}
}

class Student_NameCompare implements Comparator
{
	public int compare(Object arg0, Object arg1) {
		
		Student s1 = (Student)arg0;
		Student s2 = (Student)arg1;
		return s1.name.compareTo(s2.name);
	}
}
