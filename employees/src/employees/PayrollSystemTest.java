package employees;

import java.util.Calendar;

public class PayrollSystemTest {
	public static void main(String[] args) {
		// Create subclass objects
		SalariedEmployee e0 = new SalariedEmployee("Steph", "Curry", "111-11-1111", 600.00, new Date(07, 23, 2016));
		HourlyEmployee e1 = new HourlyEmployee("Kevin", "Durant", "222-22-2222", 12.75, 30, new Date(4, 2, 1981));
		CommissionEmployee e2 = new CommissionEmployee("Lebron", "James", "333-33-3333", 23000, .08,
				new Date(5, 8, 1993));
		BasePlusCommissionEmployee e3 = new BasePlusCommissionEmployee("Kyrie", "Irving", "444-44-4444", 3000, .05, 400,
				new Date(2, 29, 2000));
		PieceWorker e4 = new PieceWorker("Kevin", "Love", "555-555-5555", 1200, 1.1, new Date(2, 29, 2000));

		// create four-element Employee array
		Employee[] employees = new Employee[5];
		// Initialize array with Employees
		employees[0] = e0;
		employees[1] = e1;
		employees[2] = e2;
		employees[3] = e3;
		employees[4] = e4;
		for (Employee e : employees) {
			if (e.getBirthDate().getMonth() == Calendar.getInstance().get(Calendar.MONTH) + 1) {
				System.out.printf("%s%n%s: $%,.2f%n", e, "earned", e.getPaymentAmount());
				System.out.printf("Birthday bonus : $%,.2f%n", 100.00);
				System.out.printf("earned $%,.2f%n%n", e.getPaymentAmount() + 100);
			}
			// Otherwise
			else
				System.out.printf("%s%n%s: $%,.2f%n%n", e, "earned", e.getPaymentAmount());
		}
		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
		}
	}
}