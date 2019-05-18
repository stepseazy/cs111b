
public class Triangle implements Shape {
	int base;
	int height;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {

		// TODO Auto-generated method stub
		return base * height * .5;
	}

	@Override
	public String toString() {
		return "Rectangle base: " + base + " height " + height;

	}

}
