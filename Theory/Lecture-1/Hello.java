import java.util.Scanner;

public class Hello{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		int name;

		System.out.print("Enter a Number: ");
		name = input.nextInt();
		System.out.printf("Your number was , %d.", name);

	}

}