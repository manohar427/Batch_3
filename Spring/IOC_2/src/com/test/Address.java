package com.test;

public class Address {

	private String streetName;
	private String city;

	public Address() {
		System.out.println("Address");
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

	public void Init() {
		System.out.println("Init");
	}

	public void Destroy() {
		System.out.println("Destroy");
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}

}
