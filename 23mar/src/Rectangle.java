
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int l, int w) {
		width = w;
		length = l;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Rectangle length: " + length + " height " + width;

	}
}
