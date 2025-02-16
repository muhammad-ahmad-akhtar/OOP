import java.util.Scanner;

class Compare{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int x , y;
		
		System.out.printf("What's X: ");
		x = input.nextInt();

		System.out.printf("What's Y: ");
		y = input.nextInt();
		
		if (x > y){
			System.out.printf("%n%d is larger.", x);}
		else if (y > x){
			System.out.printf("%n%d is larger.", y);}
		else{
			System.out.printf("%nThese numbers are equal.");}
		System.out.println();
	}

}