class CircleTest{

	public static void main(String[] args){

		// Circle Class Objects.

		Circle c1 = new Circle();


		// Functions Call for Class Circle.

		System.out.println("Before setting radius: "+c1.getRadius());

		c1.setRadius(2.20);

		System.out.println("After setting radius: "+c1.getRadius());

		System.out.println("Area of Circle: "+c1.calArea());

	}

}