package midtermq3;

public class Employee {

	private String name;
	private int id;
	private String dept;
	private double hourly;
	private int hours;

	public Employee(String string, int i, String string2, double d, int j) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.id = i;
		this.dept = string2;
		this.hourly = d;
		this.hours = j;
	}

	public double getWages() {
		return (hours * hourly);
	}

	public void print() {
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("dept: " + dept);
		System.out.println("hourly rate: " + hourly);
		System.out.println("hours worked: " + hours);
		System.out.println("weeklyWage: " + hours * hourly);
	}

}
