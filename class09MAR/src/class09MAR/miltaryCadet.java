package class09MAR;

public class miltaryCadet {
	static void checkCadetValidity(int age, int weight) throws InvalidCadetException {
		if (age > 40 || weight < 40) {
			throw new InvalidCadetException("too old");

		}
	}

	public static void main(String args[]) {
		System.out.println("welcome to the military, pls chk validity");
		try {
			checkCadetValidity(60, 35);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("have a nice day");
	}
}
