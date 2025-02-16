import java.util.Scanner;

class Arithmetic{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int a, b;

		// Getting Input from User for Two Numbers.

		System.out.print("What's A: ");
		a = input.nextInt();

		System.out.print("What's B: ");
		b = input.nextInt();

		System.out.printf("%nSum (a+b) is: %d%n", a+b);
		System.out.printf("Product (a*b) is: %d%n", a*b);
		System.out.printf("Difference (a-b) is: %d%n", a-b);
		System.out.printf("Quotient (a/b) is: %d%n", a/b);
	}

}