package soal1;

public class Rectangle extends Shape{
	private double length, width;

	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}
	
	public String toString() {
		return super.toString() + " of length " + length + " and of width " + width;
	}
}