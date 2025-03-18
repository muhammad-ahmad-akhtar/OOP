package com.comsats.Department;

import com.comsats.Employee.Employee;
import com.comsats.Lab.Lab;
import java.util.Arrays;

public class Department {
    private Employee hod;
    private Employee labIncharge;
    private String name;
    private Lab[] labs;

    public Department(String name, Employee hod, Employee labIncharge, Lab[] labs) {
        this.name = name;
        this.hod = hod;
        this.labIncharge = labIncharge;
        this.labs = new Lab[labs.length];

        for (int i = 0; i < labs.length; i++) {
            this.labs[i] = labs[i];
        }
    }

    public Department() {}

    @Override
    public String toString() {
        return "Department Name: " + name + 
               "\nHead of Department: " + hod +
               "\nLab Incharge: " + labIncharge +
               "\nLabs: " + Arrays.toString(labs);
    }
}
