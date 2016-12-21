package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {


	public static void main(String[] args) {
		Map tmap = new TreeMap();

		

		Customer c1 = new Customer("Cust 1", "C901");
		Customer c2 = new Customer("Cust 2", "C12");
		Customer c3 = new Customer("Cust 3", "C183");
		
		tmap.put(c3, "C3 value");
		tmap.put(c2, "C2 value");
		tmap.put(c1, "C1 value");
		
		System.out.println("T map:" + tmap);
	}

}


class Customer implements Comparable
{
	String name;
	String id;
	public Customer(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	public int compareTo(Object arg0) {
		Customer c = (Customer)arg0;
		return -(this.id.compareTo(c.id));
	}
}