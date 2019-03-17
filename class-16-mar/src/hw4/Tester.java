package hw4;

public class Tester {
	public static void main(String args[]) {
//		Animal a = new Animal();
//		a.setName("Cheetah");
//		a.makeSound();
//		a = new Dog();
//		a.makeSound();
//		a = new Lion();
//		a.makeSound();

		Cylinder c = new Cylinder(2, 3);
		Cylinder c2 = new Cylinder(1, 3);
		System.out.println(c.getVolume());
		System.out.println(c.getArea());
		System.out.println(c.equals(c2));
	}
}
