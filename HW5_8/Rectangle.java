package HW5_8;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
		
	}
	public Rectangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return (width+length)*2;
	}
	public String toString() {
		return "Rectangle[Length= "+length+",width= "+width+"]"; 
	}
	
	public static void main(String[] args) {
		Rectangle re = new Rectangle(5.5f, 3.2f);
		System.out.println(re.toString());
		System.out.println(re.getArea());
		
		// TODO Auto-generated method stub

	}

}
