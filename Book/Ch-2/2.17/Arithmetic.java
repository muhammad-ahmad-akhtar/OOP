import java.util.Scanner;

class Arithmetic{

	public static void main(String[] arg){

		Scanner input = new Scanner(System.in);
		
		int x , y , z;

		System.out.print("What's X: ");
		x = input.nextInt();

		System.out.print("What's Y: ");
		y = input.nextInt();

		System.out.print("What's Z: ");
		z = input.nextInt();

		System.out.printf("%nSum (x+y+z) is: %d%n", x+y+z);
		System.out.printf("%nProduct (x*y*z) is: %d%n", x*y*z);
		System.out.printf("%nAverage ((x+y+z)/3) is: %d%n", (x+y+z)/3);
		
		if ((x > y) && (x > z)){
			System.out.printf("%n%d is the largest.%n", x);}
		else if ((y > x) && (y > z)){
			System.out.printf("%n%d is the largest.%n", y);}
		else{
			System.out.printf("%n%d is the largest.%n", z);}

		if ((x < y) && (x < z)){
			System.out.printf("%n%d is the smallest.%n", x);}
		else if ((y < x) && (y < z)){
			System.out.printf("%n%d is the smallest.%n", y);}
		else{
			System.out.printf("%n%d is the smallest.%n", z);}
		
	}

}