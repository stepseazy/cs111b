package hw4;

public class Triangle extends Shape {

	double height;
	double base;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(double h, double w) {
		super();
		base = w;
		height = h;
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return .5 * height * base;
	}
}
