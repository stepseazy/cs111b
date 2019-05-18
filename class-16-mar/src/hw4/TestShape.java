package hw4;

public class TestShape {

	public TestShape() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Shape t1 = new Triangle();
		System.out.println(t1.toString());
		Shape t2 = new Triangle(3, 4);
		System.out.println(t2.toString());
		System.out.println(t2.getArea());
	}

}
