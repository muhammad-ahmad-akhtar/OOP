package com.comsats.Campus;

import com.comsats.Department.Department;
import java.util.Arrays;

public class Campus {
    private String name;
    private Department[] departments;
    private String directorName;

    public Campus(String name, Department[] departments, String directorName) {
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
        return "Campus Name: " + name + "\nDirector: " + directorName +
               "\nDepartments: " + Arrays.toString(departments);
    }
}
