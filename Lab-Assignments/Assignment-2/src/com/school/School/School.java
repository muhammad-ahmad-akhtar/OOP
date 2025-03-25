package com.school.School;

import com.school.Classroom.Classroom;
import com.school.Principal.Principal;

public class School{
	private String name;
	private String address;
	private Classroom classroom[];
	private Principal principal;

	public School(String name, String address, Classroom classroom[], Principal principal) {
		this.name = name;
		this.address = address;
		this.classroom = new Classroom[2];
		for(int i = 0; i < classroom.length; i++) {
			this.classroom[i] = classroom[i];
		}
		this.principal = principal;
	}
	
	public void setName(String name) { this.name = name; }
	public void setAddress(String address) { this.address = address; }

	public String getName() { return this.name; }
	public String getAddress() { return this.address; }

	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nSchool Details:\n");
		str.append("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		str.append(" Name: " + this.name + "\n");
		str.append(" Address: " + this.address + "\n");
		str.append(principal);
		for(int i = 0; i < classroom.length; i++) {
			str.append(classroom[i] + "\n\n");	
		}
		str.append("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		return str.toString();
	}

}