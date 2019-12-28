package assesment1;

public class Circle extends Shape {

	public Circle(double radius) {
		super(radius);
		
	}
	final double pi=3.14;
	@Override
	public void area() {
		
		double area=pi*radius*radius;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		double radius= Double.parseDouble(args[0]);
		Circle circle=new Circle(radius);
		circle.area();
	}

}
