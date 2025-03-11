package com.library.Staff;

import com.library.Person.*;

public class Staff {
	private String role;
	private Person person;

	public Staff(String role, Person person) {
		this.role = role;
		this.person = person;
	}

	public Staff(Staff other) {
		this.role = other.role;
		this.person = new Person(other.person);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Staff)) { 
			return false; 
		}

		Staff other = (Staff) obj;

		return this.role.equals(other.role) && this.person.equals(other.person);
	}

	public void showStaffDetails() {
		System.out.printf("Role: %s%n", this.role);
		this.person.showPersonDetails();
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

}