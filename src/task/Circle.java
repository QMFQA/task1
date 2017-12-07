package task;

public class Circle extends Figure {
	
	private double radius;

	public Circle(double radius) {
		super("Circle");		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {		
		return this.radius * 2.0 * Math.PI;
	}	

}
