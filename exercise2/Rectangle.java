package exercise2;

public class Rectangle extends Shape {
	public double width;
	public double length;
	
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.setWidth(1.0);
		this.setLength(1.0);
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setLength(length);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return 2*(this.width + this.length);
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
}
