package com.school.Principal;

import com.school.Person.Person;

public class Principal extends Person{
	private int experience;

	public Principal(String name, int age, int experience) {
		super(name, age);
		this.experience = experience;
	}

	public void setExperience(int experience) { this.experience = experience; }

	public int getExperience() { return this.experience; }

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\n¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬\n");
		str.append(" Principal:\n");
		str.append("   Name: " + getName() + "\n");
		str.append("   Age: "+ getAge() +"\n");
		str.append("   Experience: "+ getExperience() +"\n");
		str.append("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬\n\n");
		return str.toString();
	}
}