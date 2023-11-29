package soal1;

public class Sphere extends Shape{
	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return 4*Math.PI*(radius*radius);
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
}