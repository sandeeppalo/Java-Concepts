
package assesment1;

public abstract class Shape {

	
	public Shape(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		
	}
	

	public Shape(double radius) {
		super();
		this.radius = radius;
	}


	protected double length;
	protected double breadth;
	protected double radius;
	public  abstract void area();

}
