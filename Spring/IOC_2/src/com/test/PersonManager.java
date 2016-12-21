package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PersonManager {

	 
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/test/Person.xml"));
		
		Person p = (Person)bf.getBean("Person");
		Person p2 = (Person)bf.getBean("Person");
		
		Address a1 = (Address)bf.getBean("Address");
		Address a2 = (Address)bf.getBean("Address");
		
		System.out.println(p);
		System.out.println(p2);
		
		/*System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getEducation());
		System.out.println(p.getJobs());
		System.out.println(p.getMails());
		
		System.out.println(a1.getCity());
		System.out.println(a1.getStreetName());
		System.out.println("Address");*/
		
		
	}

}
