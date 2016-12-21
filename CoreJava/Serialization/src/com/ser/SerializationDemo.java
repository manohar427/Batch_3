package com.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* Customer c = new Customer(12, "Abc", "abc@gmail.com");
        System.out.println("Object creation is done.");
        System.out.println(c);
        
        FileOutputStream fo = new FileOutputStream("customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(c);
        oos.close();*/
		
		FileInputStream fip = new FileInputStream("customer.txt");
		ObjectInputStream oip = new ObjectInputStream(fip);
		
		Customer cust = (Customer)oip.readObject();
		
		System.out.println(cust);
		
		oip.close();
	}

}


class Customer implements Serializable
{
	int age;
	String name;
	String email;
	public Customer(int age, String name, String email) {
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + ", email=" + email
				+ "]";
	}
}