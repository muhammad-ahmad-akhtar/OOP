class Circle{
	
	// Data.

	private double radius;


	// Functions.

	public void setRadius(double argradius){
		radius = argradius;
	}
	
	public double getRadius(){
		return radius;
	}

	public double calArea(){
		return radius*radius*2*3.14;
	}

}