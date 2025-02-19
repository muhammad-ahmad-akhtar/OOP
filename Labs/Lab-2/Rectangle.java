public class Rectangle{

	private double length;
	private double width;

	public void setLength(double len){

		this.length = len;
	
	}

	public void setWidth(double width){

		this.width = width;
	
	}


	public double getLength(){

		return length;

	}

	public double getWidth(){

		return width;

	}

	public double calArea(){

		return length * width;

	}

	public double calPerimeter(){

		return 2 * ( length + width );

	}

}