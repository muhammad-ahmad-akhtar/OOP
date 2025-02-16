import java.util.Scanner;

class Shapes{

	public static void main(String[] args){
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		x = input.nextInt();

		//Rectangle Shape
		for(int i = 0; i < x; i++){
			if ((i==0) || (i==x-1)){
				for (int j = 0; j < x; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				System.out.print("*");
				for(int j = 0; j < x-2; j++){
					System.out.print(" ");}
				System.out.print("*\n");
			}
		}

		System.out.println("\n\n");

		// Oval Shape
		for (int i = 0; i < x; i++){
			if ((i==0) || (i==x-1)){

				for(int j = 0; j < x/3; j++){
					System.out.print(" ");
				}

				for(int j = 0; j < x/3; j++){
					System.out.print("*");
				}
					
				System.out.println();
				continue;
			}

			if ((i==1) || (i==x-2)){

				for(int j = 0; j < (x/3)/2; j++){
					System.out.print(" ");
				}

				for(int j = 0; j < (x/3)/2; j++){
					System.out.print("*");
				}

				for(int j = 0; j < (x - ((x/3)/2)*4); j++){
					System.out.print(" ");
				}

				for(int j = 0; j < (x/3)/2; j++){
					System.out.print("*");
				}

					
				System.out.println();
				continue;
			}
			
			for(int k = 0; k < x; k++){
				if ((k==0) || (k==x-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\n\n");

		// Arrow Shape
		for (int i = 0; i < x; i++){
			if (i < x/3){
				for(int j = 0; j < (x/3)-(i+1); j++){
					System.out.print(" ");
				}
				for(int j = 0; j < ((i*2)+1); j++){
					System.out.print("*");
				}
			}
			else{
				for(int j = 0; j < (x/3)-1; j++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("\n\n");

		// Diamond Shape
		int temp = 1;
		for (int i = 0; i < x; i++){
			for (int  j = ((x-1)/2)-i; j > 0; j--){
				System.out.print(" ");
			}
			for (int j = 0; j < (i-((x-1)/2)); j++) {
				System.out.print(" ");
			}
			if ((i == 0) || (i == x-1)){
				System.out.print("*");
			}
			if ((i != 0) && (i != x-1)){
				System.out.print("*");
			}

			if ((i > 0) && (i < x-1)){
				for (int j = temp; j > 0; j--){
					System.out.print(" ");
				}
				if (i < (x-1)/2){
					temp += 2;
				}
				else{
					temp -= 2;
				}
			}

			if ((i != 0) && (i != x-1)){
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}