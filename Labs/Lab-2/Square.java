public class Square{

	private double length;

	public void setLength(double len){

		this.length = len;
	
	}

	public double getLength(){

		return length;

	}

	public double calArea(){

		return length * length;

	}

	public double calPerimeter(){

		return 2 * (length + length);

	}

}