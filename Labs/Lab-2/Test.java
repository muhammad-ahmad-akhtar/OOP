import java.util.Scanner;


public class Test{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		


		// Square.
		System.out.printf("%n|----------------Square-------------|%n%n");

		Square sq = new Square();

		double len;
		System.out.print("What's the Length: ");
		len = input.nextDouble();

		// Calling set Length Function.
		sq.setLength(len);
		System.out.printf("%nLength of Square is: %.2f%n", sq.getLength());
		System.out.printf("Area of Square is: %.2f%n", sq.calArea());
		System.out.printf("Perimeter of Square is: %.2f%n", sq.calPerimeter());



		// Rectangle.
		System.out.printf("%n%n|----------------Rectangle-------------|%n%n");

		Rectangle rec = new Rectangle();

		double length;
		double width;
		System.out.print("What's the Length: ");
		length = input.nextDouble();
		System.out.print("What's the Width: ");
		width = input.nextDouble();


		// Calling set Length Function.
		rec.setLength(length);
		rec.setWidth(width);
		System.out.printf("%nLength of Rectangle is: %.2f%n", rec.getLength());
		System.out.printf("Width of Rectangle is: %.2f%n", rec.getWidth());
		System.out.printf("Area of Rectangle is: %.2f%n", rec.calArea());
		System.out.printf("Perimeter of Rectangle is: %.2f%n", rec.calPerimeter());


		// Circle.
		System.out.printf("%n|----------------Circle--------------|%n%n");

		Circle cir = new Circle();

		double radius;
		System.out.print("What's the Radius: ");
		radius = input.nextDouble();

		// Calling set Length Function.
		cir.setRadius(radius);
		System.out.printf("%nRadius of Circle is: %.2f%n", cir.getRadius());
		System.out.printf("Area of Circle is: %.2f%n", cir.calArea());
		System.out.printf("Circumference of Circle is: %.2f%n", cir.calCircumference());
	}
}