package com.school.Student;

import com.school.Person.Person;

public class Student extends Person{
	private String rollNumber;

	public Student(String name, int age, String rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
	}

	public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

	public String getRollNumber() { return this.rollNumber; }

	public void dispaly() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		str.append(" Student:\n");
		str.append("   Name: " + getName() + "\n");
		str.append("   Age: "+ getAge() +"\n");
		str.append("   Roll: "+ getRollNumber() +"\n");
		str.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
		return str.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		Student student = (Student) obj;
		return this.rollNumber.equals(student.rollNumber);
	}

}