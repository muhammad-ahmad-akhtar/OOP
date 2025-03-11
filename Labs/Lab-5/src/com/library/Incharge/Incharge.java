package com.library.Incharge;

import com.library.Person.*;

public class Incharge {
	private String designation;
	private Person person;

	public Incharge(String designation, Person person) {
		this.designation = designation;
		this.person = person;
	}

	public Incharge(Incharge other) {
		this.designation = other.designation;
		this.person = new Person(other.person);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Incharge)) { 
			return false; 
		}

		Incharge other = (Incharge) obj;

		return this.designation.equals(other.designation) && this.person.equals(other.person);
	}

	public void showInchargeDetails() {
		System.out.printf("Incharge Designation: %s%n", this.designation);
		this.person.showPersonDetails();
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return this.designation;
	}

}