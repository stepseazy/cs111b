package hw4;

public class Cylinder extends Circle {

	private double height;

	public Cylinder(double r, double h) {
		super(r);
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
}
