package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MailManager {
	 
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/test/Mail.xml"));
        Mail m = (Mail)bf.getBean("Mail");
        System.out.println(m);
	}
}
