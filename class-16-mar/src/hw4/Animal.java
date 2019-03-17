package hw4;

public class Animal {
	private String name;

	public void makeSound() {
		System.out.println("hunky dory");
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		Animal a = new Animal();
		a.makeSound();
	}

}
