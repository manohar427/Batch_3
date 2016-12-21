package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PersonManager {

	public static void main(String[] args) {
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/test/Person.xml"));
		
		ApplicationContext bf = new ClassPathXmlApplicationContext("com/test/Person.xml");
		
		Person p1 = (Person) bf.getBean("x");
		Person p2 = (Person) bf.getBean("x");
        
	System.out.println(p1.getAge());
	System.out.println(p2.getAge());
		/*System.out.println(p);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getEducation());
		System.out.println(p.getJobs());
		System.out.println(p.getMails());*/
	}
}
