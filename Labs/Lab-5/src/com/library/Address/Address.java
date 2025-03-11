package com.library.Address;

public class Address{
	private String street;
	private String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public Address(Address other) {
		this.street = other.street;
		this.city = other.city;
	}

	public void showAddress() {
		System.out.printf("%s, %s%n", this.city, this.street);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Address)) { 
			return false; 
		}

		Address other = (Address) obj;

		return this.street.equals(other.street) && this.city.equals(other.city);
	}

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

}