package assesment1;

public class Rectangle extends Shape {

	
public Rectangle(double length, double breadth) {
		super(length, breadth);
		
	}

	@Override
	public void area() {
	
		double area=length*breadth;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		double length=Double.parseDouble(args[0]);
		double breadth=Double.parseDouble(args[1]);
		Rectangle rectangle =new Rectangle(length,breadth );
				rectangle.area();
	}

}
