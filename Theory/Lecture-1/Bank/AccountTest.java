import java.util.Scanner;

public class AccountTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		Account acc1 = new Account();

		System.out.printf("Initial name is: %s%n%n", acc1.getName());
		System.out.println("Please enter the name: ");
		String name = input.nextLine();
		acc1.setName(name);
		System.out.println();
		System.out.printf("Name in object acc1 is: %n%s%n", acc1.getName());
	}

}