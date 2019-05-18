package hw4;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		this.radius = 0.0;
		this.color = "red";
		// TODO Auto-generated constructor stub
	}

	public Circle(double r) {
		radius = r;
		color = "red";
		// TODO Auto-generated constructor stub
	}

	public Circle(double r, String c) {
		radius = r;
		color = c;
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

	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";

	}
}
