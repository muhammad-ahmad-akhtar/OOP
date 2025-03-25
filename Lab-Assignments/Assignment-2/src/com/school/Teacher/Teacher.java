package com.school.Teacher;

import com.school.Person.Person;
import com.school.Classroom.Classroom;

public class Teacher extends Person{
	private int id;
	private String subject;
	private Classroom classroom;

	public Teacher(String name, int age, int id, String subject, Classroom classroom) {
		super(name, age);
		this.id = id;
		this.subject = subject;
		this.classroom = classroom;
	}

	public void setSubject(String subject) { this.subject = subject; }

	public int getId() { return this.id; }
	public String getSubject() { return this.subject; }

	public void dispaly() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\n------------------------------------------\n");
		str.append(" Teacher:\n");
		str.append("   ID: " + getId() + "\n");
		str.append("   Name: " + getName() + "\n");
		str.append("   Age: "+ getAge() +"\n");
		str.append("   Subject: "+ getSubject() +"\n");
		str.append("   Class: " + this.classroom.getName() + "-" + this.classroom.getClassCode() + "\n");
		str.append("-----------------------------------------\n\n");
		return str.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		Teacher teacher = (Teacher) obj;
		return this.id == teacher.id;
	}

}