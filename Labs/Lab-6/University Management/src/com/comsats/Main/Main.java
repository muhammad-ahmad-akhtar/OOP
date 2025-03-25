package com.comsats.Main;

import com.comsats.University.University;
import com.comsats.Campus.Campus;
import com.comsats.Department.Department;
import com.comsats.Employee.Employee;
import com.comsats.Lab.Lab;
import com.comsats.SystemUnit.SystemUnit;

public class Main {
    public static void main(String[] args) {

        // Employees (HODs).
        Employee hodA = new Employee("Dr. Ahmad Ali Khan", "HOD CS");
        Employee hodB = new Employee("Dr. Abdul Wahab", "HOD SE");
        //Employee hodC = new Employee("Dr. Shahmeer Shahzad", "HOD DS");
        //Employee hodD = new Employee("Dr. Muhammad-Bin-Mohsin", "HOD AI");
        //Employee hodE = new Employee("Dr. Ali Raza", "HOD Pharmacy");

        // Lab Incharges.
        Employee labIncharge1 = new Employee("Ms. Shahnawaz Anwar", "Lab Incharge");
        Employee labIncharge2 = new Employee("MR. Shahbaz Ali", "Lab Incharge");
        Employee labIncharge3 = new Employee("Mr. Mustafa Kamal", "Lab Incharge");

        // System Units.
        SystemUnit computers[] = new SystemUnit[]{
            new SystemUnit("Intel i7", "Dell 24in", 16, 512),
            new SystemUnit("AMD Ryzen 5", "LG 27in", 8, 256),
            new SystemUnit("Intel i5", "HP 22in", 12, 1000),
            //new SystemUnit("AMD Ryzen 7", "Samsung 32in", 32, 2000),
            //new SystemUnit("Intel Celeron", "Generic 19in", 4, 128),
            //new SystemUnit("AMD Athlon", "AOC 20in", 6, 500),
            //new SystemUnit("Intel i9", "ASUS 27in", 64, 1024),
            //new SystemUnit("AMD Ryzen 9", "BenQ 24in", 32, 2048),
            //new SystemUnit("Intel Pentium", "ViewSonic 22in", 8, 250),
            //new SystemUnit("AMD Threadripper", "Dell 34in", 128, 4000),
            //new SystemUnit("Intel Xeon", "LG 29in", 64, 8000),
            //new SystemUnit("AMD EPYC", "HP 27in", 256, 16000),
            //new SystemUnit("Intel Atom", "Generic 17in", 2, 64),
            //new SystemUnit("AMD Sempron", "AOC 19in", 4, 120),
            //new SystemUnit("Intel Core m3", "Samsung 21in", 8, 256)
        };


        // Labs.
        Lab labs[] = new Lab[]{
            new Lab("Lab-A", labIncharge1, computers, true),
            new Lab("Lab-B", labIncharge2, computers, true),
            //new Lab("Lab-C", labIncharge2, computers, true),
            //new Lab("Lab-D", labIncharge3, computers, true),
            //new Lab("Lab-E", labIncharge2, computers, true),
            //new Lab("Lab-F", labIncharge3, computers, true),
            //new Lab("Lab-G", labIncharge1, computers, true),
            //new Lab("Lab-H", labIncharge2, computers, true),
            //new Lab("Lab-I", labIncharge1, computers, true),
            //new Lab("Lab-J", labIncharge2, computers, true)
        };

        // Departments.
        Department departments[] = new Department[]{
            new Department("Computer Science", hodA, labIncharge1, labs),
            //new Department("Software Engineering", hodB, labIncharge3, labs),
            //new Department("Data Science", hodC, labIncharge1, labs),
            //new Department("Artificial Intelligence", hodD, labIncharge3, labs), // Fixed spelling
            //new Department("Pharmacy", hodE, labIncharge2, labs),
        };

        // Campuses.
        Campus campuses[] = new Campus[]{
            new Campus("CUI, Lahore", departments, hodA),
            new Campus("CUI, Islamabad", departments, hodB),
            //new Campus("CUI, Sahiwal", departments, hodC),
            //new Campus("CUI, Attock", departments, hodD),
        };

        // University.
        University comsats = new University("Comsats, CUI", campuses);

        // Print the university details.
        System.out.println(comsats);
    }
}
