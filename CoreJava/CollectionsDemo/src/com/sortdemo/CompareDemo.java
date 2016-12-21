package com.sortdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CompareDemo {

	public static void main(String[] args) {
      
		Customer c1 = new Customer("Cust 1", "C901");
		Customer c2 = new Customer("Cust 2", "C12");
		Customer c3 = new Customer("Cust 3", "C183");
		
		List list  = new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
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
		return (this.id.compareTo(c.id));
	}
}