package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		/*
		 * Map hmap = new HashMap();
		 * 
		 * hmap.put("A","A value"); hmap.put("89","88 value");
		 * hmap.put("77","77 value"); hmap.put("B","B value");
		 * hmap.put("C","C value");
		 * 
		 * System.out.println("H map:"+hmap);
		 */

		/*
		 * Map lhmap = new LinkedHashMap();
		 * 
		 * lhmap.put("A","A1 value"); lhmap.put("A","A2 value");
		 * lhmap.put("89","88 value"); lhmap.put("77","77 value");
		 * lhmap.put("B","B value"); lhmap.put("C","C value");
		 * 
		 * System.out.println("LH map:"+lhmap);
		 */

	/*	Map tmap = new TreeMap();

		tmap.put("A", "A1 value");
		tmap.put("A", "A2 value");
		tmap.put("89", "88 value");
		tmap.put("77", "77 value");
		tmap.put("B", "B value");
		tmap.put("C", "C value");

		System.out.println("T map:" + tmap);*/
		
		Student s1 = new Student("Std1", 10);
		Student s2 = new Student("Std1", 10);
		Student s3 = new Student("Std3", 11);
		
		
		Map tmap = new HashMap();

		tmap.put(s1, "S1 value");
		tmap.put(s2, "s2 value");
		tmap.put(s3, "s3 value");

		System.out.println("T map:" + tmap);
		
	}

}

class Student
{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
// Map - i
// HashMap -c
// LinkedHashMap - c
// TreeMap -c