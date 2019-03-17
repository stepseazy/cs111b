package hw4;

public class Circle {

	private double radius;

	public Circle(double r) {
		radius = r;
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
