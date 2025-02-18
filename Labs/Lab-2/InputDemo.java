import java.util.Scanner;

public class InputDemo{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		Scanner strinput = new Scanner(System.in);


		System.out.printf("%n|------------------------------------------------------------|%n");

		System.out.printf("%n\t%s\t\t%s%n", "Ahmad Akhtar", "FA24-BCS-061");

		System.out.printf("%n|------------------------------------------------------------|%n%n");

		// Data Types Declaration.
		boolean bool;
		byte b;
		short s;
		long l;
		int i;
		float f;
		double d;
		char c;
		String str;
		String word;
		String sentence;

		// Input & Displaay.

		// Boolean.
		System.out.print("Enter a Boolean: ");
		bool = input.nextBoolean();
		System.out.printf("Boolean is: %b%n%n", bool);

		System.out.printf("--------------------%n%n");

		// Byte.
		System.out.print("Enter a Byte: ");
		b = input.nextByte();
		System.out.printf("Byte is: %d%n%n", b);

		System.out.printf("--------------------%n%n");

		// Short.
		System.out.print("Enter a Short: ");
		s = input.nextShort();
		System.out.printf("Short is: %d%n%n", s);

		System.out.printf("--------------------%n%n");

		// Long.
		System.out.print("Enter a Long: ");
		l = input.nextLong();
		System.out.printf("Long is: %d%n%n", l);

		System.out.printf("--------------------%n%n");

		// Int.
		System.out.print("Enter a Int: ");
		i = input.nextInt();
		System.out.printf("Int is: %,d%n%n", i);

		System.out.printf("--------------------%n%n");

		// Float.
		System.out.print("Enter a Float: ");
		f = input.nextFloat();
		System.out.printf("Float is: %,.2f%n%n", f);

		System.out.printf("--------------------%n%n");

		// Double.
		System.out.print("Enter a Double: ");
		d = input.nextDouble();
		System.out.printf("Double is: %f%n%n", d);

		System.out.printf("--------------------%n%n");

		// String.
		System.out.print("Enter a String: ");
		str = strinput.nextLine();
		System.out.printf("String is: %s%n%n", str);

		System.out.printf("--------------------%n%n");

                // Word.
		System.out.print("Enter a Word: ");
		word = input.next();
		System.out.printf("Word is: %s%n%n", word);

		System.out.printf("--------------------%n%n");

		// Char.
		System.out.print("Enter a Char: ");
		c = input.next().charAt(0);
		System.out.printf("Char is: %c%n%n", c);

		System.out.printf("--------------------%n%n");

	}

}