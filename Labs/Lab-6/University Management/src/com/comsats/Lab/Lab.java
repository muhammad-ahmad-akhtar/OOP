package com.comsats.Lab;

import com.comsats.Employee.Employee;
import com.comsats.SystemUnit.SystemUnit;
import java.util.Arrays;

public class Lab {
    private String labName;
    private Employee labStaff;
    private SystemUnit[] computers;
    private boolean hasMultimedia;

    public Lab(String labName, Employee labStaff, SystemUnit[] computers, boolean hasMultimedia) {
        this.labName = labName;
        this.hasMultimedia = hasMultimedia;
	this.labStaff = labStaff;
        
        // Initialize computers array
        this.computers = new SystemUnit[computers.length];
        for (int i = 0; i < computers.length; i++){
        	this.computers[i] = computers[i];
        } 
    }

    public Lab() {}


	@Override
	public String toString() {
	    StringBuilder str = new StringBuilder();
	    str.append("\nLab: ").append(labName).append("\n");
	
	    str.append("Lab Staff:\n");
	    if (labStaff != null) {
	        for (Employee staff : labStaff) {
	            str.append("  - ").append(staff).append("\n");
	        }
	    } else {
	        str.append("  - No staff assigned\n");
	    }
	
	    str.append("Lab Systems:\n");
	    if (computers != null) {
	        for (SystemUnit computer : computers) {
	            str.append("  - ").append(computer).append("\n");
	        }
	    } else {
	        str.append("  - No computers available\n");
	    }	

	    return str.toString();
	}

}
