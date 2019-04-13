package employees;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	// constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary,
			Date birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
}
