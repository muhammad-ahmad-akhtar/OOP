package com.comsats.Campus;

import com.comsats.Department.Department;
import com.comsats.Employee.Employee;
import java.util.Arrays;

public class Campus {
    private String name;
    private Department[] departments;
    private Employee directorName;

    public Campus(String name, Department[] departments, Employee directorName) {
        this.name = name;
        this.directorName = directorName;
        this.departments = new Department[departments.length];
        
        for (int i = 0; i < departments.length; i++) {
            this.departments[i] = departments[i];
        }
    }

    public Campus() {}

@Override
public String toString() {
    return "\nCampus: " + name + 
           "\n  Director: " + directorName +
           "\n  Departments: " + Arrays.toString(departments).replace(",", "").replace("[", "").replace("]", "");
}

}
