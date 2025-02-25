class Student{

	private String regNumber;
	private String name;
	private String address;
	private String phoneNumber;
	private double gpa;
	
	// Auto RegNumber Generator.

	static int id = 1;


	// Constructor

	public Student(String name, String address, String phoneNumber, double gpa){
		 
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gpa = gpa;
		this.regNumber = String.format("FA24-BCS-%03d", id++);

	}


	// Function to Print all Data.

	public void printData(){

		System.out.printf("---------------------------%n");
		System.out.printf(" Reg # %s%n", this.regNumber);
		System.out.printf(" Name: %s%n", this.name);
		System.out.printf(" GPA: %.2f%n", this.gpa);
		System.out.printf(" Ph # %s%n", this.phoneNumber);
		System.out.printf(" Address: %15s%n", this.address);
		System.out.printf("---------------------------%n%n");
	
	}

	
	// Public Set Functions.

	public void setName(String name){

		this.name = name;

	}

	public void setGpa(double gpa){

		this.gpa = gpa;

	}

	public void setAddress(String address){

		this.address = address;

	}

	public void setPhoneNum(String phoneNumber){

		this.phoneNumber = phoneNumber;

	}
}