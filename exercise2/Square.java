package exercise2;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side); // Call superclass rectangle(double, double)
	}
	
	public Square (double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	public void setLength(double side) {
		setSide(side);
	}
	
	public String toString() {
		return "A Square with side=" + getSide() + ", which a subclass of " + super.toString();
	}
}
