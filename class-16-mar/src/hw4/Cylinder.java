package hw4;

public class Cylinder extends Circle {

	private double height;

	public Cylinder() {
		super();
		height = 1.0;

		// TODO Auto-generated constructor stub
	}

	public Cylinder(double h) {
		super();
		height = h;
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double r, double h) {
		super(r);
		height = h;
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double r, double h, String c) {
		super(r, c);
		height = h;
		// TODO Auto-generated constructor stub
	}

	public double getVolume() {
		return getArea() * getHeight();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Cylinder) || o == null) {
			return false;
		}
		return (((Cylinder) o).getArea() == getArea());
	}

	public String toString() {
		return "this is a cylindier. wip";

	}
}
