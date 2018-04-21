package comm.assnmt.OOPServices;

public class Inheritance {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setCircle("Blue", 10.5);
		System.out.println("Shape: Circle "+c1.getCircle()+" Area: "+c1.area(10.5));
		Square s1 = new Square();
		s1.setSquare("Red", 12.25);
		System.out.println("Shape: square "+s1.getSquare()+" Area: "+s1.area(10.5));
	}

}
class Shape{
	String color;
	
	interface Area{
		double area();
	}
}

class Circle extends Shape{
	double radius;
	
	public void setCircle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	public double area(double radius) {
		return radius*radius;
	}
	
	public String getCircle() {
		return "Color: "+this.color+", Radius: "+this.radius;
	}
	
}

class Square extends Shape{
	double side;
	
	public void setSquare(String color, double side) {
		this.color = color;
		this.side = side;
	}
	public double area(double side) {
		return side*side;
	}
	
	public String getSquare() {
		return "Color: "+this.color+", side: "+this.side;
	}
	
}
