package HW5_8;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle(){
		
	}
	public Circle(double r){
		radius =r;
		
	}
	
	public double getRadius()
	{
		return radius;
	}
	public double getArea() {
		double sum =getCircumference()* Math.pow(radius, 2);
		return sum;
	}
	public double getCircumference() {
		return Math.PI;
	}
	public String toString() {
		return "Circle[radius= "+radius+"]";
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.toString());
		System.out.println(c.getArea());
		
		// TODO Auto-generated method stub

	}
}
