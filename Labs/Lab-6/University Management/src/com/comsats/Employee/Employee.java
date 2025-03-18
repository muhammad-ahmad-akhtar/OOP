package com.comsats.Employee;

public class Employee{
	private String name;
	private String role;

	public Employee(String name, String role){
		this.name = name;
		this.role = role;
	}

	public Employee(){
		// Empty.
	}
	
	@Override
	public String toString(){
		return String.format("%s is %s.", this.name, this.role);
	}
}