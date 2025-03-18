package com.comsats.Main;

import com.comsats.University.University;
import com.comsats.Campus.Campus;
import com.comsats.Department.Department;
import com.comsats.Employee.Employee;
import com.comsats.Lab.Lab;

public class Main {
    public static void main(String[] args) {
        Employee hod = new Employee("Dr. John", "HOD CS");
        Employee labIncharge = new Employee("Ms. Alice", "Lab Incharge");
        Lab[] labs = {new Lab("AI Lab", new Employee[]{labIncharge}, null, true)};
        
        Department csDept = new Department("Computer Science", hod, labIncharge, labs);
        Campus mainCampus = new Campus("Main Campus", new Department[]{csDept}, "Dr. Smith");
        
        University university = new University("COMSATS University", new Campus[]{mainCampus});

        System.out.println(university);
    }
}
