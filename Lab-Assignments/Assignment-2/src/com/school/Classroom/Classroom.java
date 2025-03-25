package com.school.Classroom;

import com.school.Teacher.Teacher;
import com.school.Student.Student;
import com.school.Person.Person;

public class Classroom {
	private String name;
	private String classCode;
	private Teacher teacher;
	private Student student[];

	public Classroom(String name, String classCode, Teacher teacher, Student student[]) {
		this.name = name;
		this.classCode = classCode;
		this.teacher = teacher;
		this.student = new Student[5];
		int maxStudents = Math.min(student.length, 5);
		for(int i = 0; i < student.length; i++){
			this.student[i] = student[i];
		}
	}

	public Classroom() {}
	
	public void setName(String name) { this.name = name; }
	public void setClassCode(String classCode) { this.classCode = classCode; }

	public String getName() { return this.name; }
	public String getClassCode() { return this.classCode; }

	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		str.append(" Class Details: \n");
		str.append("   Name: " + this.name + "\n");
		str.append("   Class-Code: " + this.classCode + "\n");
		str.append("   " + teacher);
		for(int i = 0; i < student.length; i++){
			str.append(this.student[i]);
		}
		str.append("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		return str.toString();
	}

}