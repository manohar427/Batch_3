package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AddressManager {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/test/Mail.xml"));
		Address m = (Address)bf.getBean("Address");
		System.out.println(m.getCity());
		System.out.println(m.getMail().getMailid());
		System.out.println(m.getStreetName());
	}
}
