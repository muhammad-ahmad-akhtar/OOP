package com.comsats.Lab;

import com.comsats.Employee.Employee;
import com.comsats.SystemUnit.SystemUnit;
import java.util.Arrays;

public class Lab {
    private String labName;
    private Employee[] labStaff;
    private SystemUnit[] computers;
    private boolean hasMultimedia;

    public Lab(String labName, Employee[] labStaff, SystemUnit[] computers, boolean hasMultimedia) {
        this.labName = labName;
        this.hasMultimedia = hasMultimedia;
        
        // Initialize labStaff array if provided, else set to empty array.
        if (labStaff != null) {
            this.labStaff = new Employee[labStaff.length];
            for (int i = 0; i < labStaff.length; i++) {
                this.labStaff[i] = labStaff[i];
            }
        } else {
            this.labStaff = new Employee[0];
        }
        
        // Initialize computers array if provided, else set to empty array.
        if (computers != null) {
            this.computers = new SystemUnit[computers.length];
            for (int i = 0; i < computers.length; i++) {
                this.computers[i] = computers[i];
            }
        } else {
            this.computers = new SystemUnit[0];
        }
    }

    public Lab() {
        // Empty.
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Lab: " + labName + "\n\n");

        str.append("Lab's Staff:\n");
        for (int i = 0; i < labStaff.length; i++) {
            str.append(labStaff[i] + "\n");
        }
        
        str.append("Lab's Systems:\n");
        for (int i = 0; i < computers.length; i++) {
            str.append(computers[i] + "\n");
        }
        
        return str.toString();
    }
}
