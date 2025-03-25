package com.comsats.SystemUnit;

public class SystemUnit{
	private String cpuName;
	private	int ramSize;
	private int diskSize;
	private String lcdModel;
	private String systemId;
	private static int count = 0;

	public SystemUnit(String cpuName, String lcdModel, int ramSize, int diskSize){
		this.systemId = String.format(" C + %02d", ++count);
		this.cpuName = cpuName;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.lcdModel = lcdModel;
	}

	public SystemUnit(){
		// Empty.
	}

	// Setter Functions.
	public void setCpuName(String cpuName){
		this.cpuName = cpuName;
	}
	public void setRamSize(int ramSize){
		this.ramSize = ramSize;
	}
	public void setDiskSize(int DiskSize){
		this.diskSize = diskSize;
	}
	public void lcdModel(String lcdModel){
		this.lcdModel = lcdModel;
	}

	// Getter Functions.
	public String getCpuName(){
		return this.cpuName;
	}
	public int getRamSize(){
		return this.ramSize;
	}
	public int getDiskSize(){
		return this.diskSize;
	}
	public String lcdModel(){
		return this.lcdModel;
	}

	@Override
	public String toString() {
		return null; //String.format("\nSystem Details: \nCPU Name: %s\nRAM Size: %s\nDisk Size: %s\nSystem ID: %s\nLCD Model: %s\n", cpuName, ramSize, diskSize, systemId, lcdModel);
	}

}