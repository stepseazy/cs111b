package hw4;

abstract public class Shape {

	private String color;

	public Shape() {
		this.color = "red";
	}

	public Shape(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color=" + color;
	}

	abstract double getArea();

}
