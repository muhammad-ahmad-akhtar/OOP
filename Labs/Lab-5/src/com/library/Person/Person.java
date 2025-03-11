package com.library.Person;

import com.library.Address.*;

public class Person {
	private String name;
	private Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}


	public void showPersonDetails() {
		System.out.printf("%s.%n", this.name);
		this.address.showAddress();
	}

	public Person(Person other) {
		this.name = other.name;
		this.address = new Address (other.address);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Person)) { 
			return false; 
		}

		Person other = (Person) obj;

		return this.name.equals(other.name) && this.address.equals(other.address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}