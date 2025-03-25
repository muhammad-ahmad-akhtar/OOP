package com.school.Main;

import com.school.Principal.Principal;
import com.school.Teacher.Teacher;
import com.school.Student.Student;
import com.school.Classroom.Classroom;
import com.school.School.School;

public class Main {
	public static void main(String[] args) {

	Principal principal = new Principal("Dr. Zafar Khan", 55, 30);

	Student student[] = new Student[]{
		new Student("Ahmad Akhtar", 15, "S001"),
		new Student("Mateen Ahmad", 16, "S002"),
		new Student("Razi Rehman", 15, "S003"),
		new Student("Akif Ashfaq", 16, "S004"),
		new Student("Usman Atique", 15, "S005")
	};

	Classroom class1 = new Classroom("Grade 10", "G10", null, student);
	Classroom class2 = new Classroom("Grade 11", "G11", null, student);

	Teacher teacher1 = new Teacher("Humayun Abdul", 40, 101, "Mathematics", class1);
	Teacher teacher2 = new Teacher("Ayesha Anam", 45, 102, "Science", class2);

	Classroom[] classrooms = new Classroom[]{
		new Classroom("Grade 10", "G10", teacher1, student),
		new Classroom("Grade 11", "G11", teacher2, student)
	};

	School school = new School("The Trust High School", "123 West Wood", classrooms, principal);

	class1 = new Classroom("Grade 10", "G10", teacher1, student);
	class2 = new Classroom("Grade 11", "G11", teacher2, student);

	school.display();

        System.out.println("\n====== Equals() Method Demonstration ======\n\n");

        System.out.println("Comparing student1 and student2: " + student[1].equals(student[2]) + "\n");

        System.out.println("Comparing teacher1 and teacher2: " + teacher1.equals(teacher2));
    }
}
