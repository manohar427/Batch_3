package com.test;

public class Address {
	private String streetName;
	private String city;
	private Mail mail;
	
	public Address(String streetName,String city,Mail mail) {
		this.mail = mail;
		this.streetName = streetName;
		this.city = city;
	}
	public Mail getMail() {
		return mail;
	}
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void  Init() {
		System.out.println("Init");
	}
	
	public void Destroy() {
		System.out.println("Destroy");
	}

}
