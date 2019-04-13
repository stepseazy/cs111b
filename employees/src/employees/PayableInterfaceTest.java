package employees;

public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[6];
		payableObjects[0] = new Invoice("0", "basketball", 2, 25.99);
		payableObjects[1] = new Invoice("1", "basketball jersey", 4, 88.95);
		payableObjects[2] = new SalariedEmployee("Steph", "Curry", "111-11-1111", 600.00, new Date(07, 23, 2016));
		payableObjects[3] = new HourlyEmployee("Kevin", "Durant", "222-22-2222", 12.75, 30, new Date(4, 2, 1981));
		payableObjects[4] = new CommissionEmployee("Lebron", "James", "333-33-3333", 23000, .08, new Date(5, 8, 1993));
		payableObjects[5] = new BasePlusCommissionEmployee("Kyrie", "Irving", "444-44-4444", 3000, .05, 400,
				new Date(2, 29, 2000));
		for (Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due",
					currentPayable.getPaymentAmount());
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee) currentPayable)
						.setBaseSalary(((BasePlusCommissionEmployee) currentPayable).getBaseSalary() * (1.1));
				System.out.print("Payment Due after 10% increase");
				System.out.printf("%n%s: $%,.2f%n", "payment due", currentPayable.getPaymentAmount());
			}
		}
	}
}