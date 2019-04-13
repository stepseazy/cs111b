package employees;

public abstract class Employee implements Payable {
	private final String firstName;
	private final String lastName;
	private final String SocialSecurityNumber;
	private final Date birthDate;

	public Employee(String fn, String ln, String ssn, Date bd) {
		this.firstName = fn;
		this.lastName = ln;
		this.SocialSecurityNumber = ssn;
		this.birthDate = bd;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String toString() {
		return String.format("%s %s%nsocial security number: %s%nDOB: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber(), getBirthDate());
	}

	public abstract double earnings();

	public double getPaymentAmount() {
		return this.earnings();
	}
}
