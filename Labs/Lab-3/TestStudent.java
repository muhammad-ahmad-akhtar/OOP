import java.util.Scanner;

class TestStudent{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		// Constructor: name, address, phoneNumber, gpa.
		Student S1 = new Student("Ahmad Akhtar", "Thokar Niaz Baig, Lahore.", "+92-3494443857", 3.87);
		Student S2 = new Student("Ahmad Ali Khan", "Iqbal Town, Lahore.", "+92-3102125834", 3.93);
		Student S3 = new Student("Abdul Wahab", "Johar Town, Lahore.", "+92-3426472823", 3.55);
		Student S4 = new Student("Shahmeer Shahzad", "Defense Housing Society", "+92-3452243986", 3.33);


		String username, password;

		System.out.printf("+----------------------+%n%n");
		System.out.print("Username: ");
		username = input.nextLine();
		System.out.print("Password: ");
		password = input.nextLine();
		System.out.printf("+----------------------+%n%n");

		if(UserInfo.validateLogin(username, password)){
		
			S1.printData();
			S2.printData();
			S3.printData();
			S4.printData();

		}
	}
}