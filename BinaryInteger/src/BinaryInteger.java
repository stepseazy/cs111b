public class BinaryInteger {

	public String s = "";

	// construct binary integer from string
	BinaryInteger(String s1) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0' && s.charAt(i) != '1') {
				try {
					throw new Exception("invalid input");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		s = s1;
	}

	// string representation
	public String toString() {
		return s;
	}

	// number of bits
	public int length() {
		return s.length();
	}

	// bitwise not of this binary integer
	public BinaryInteger not() {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '0') {
				temp += '1';
			} else if (s.charAt(i) == '1') {
				temp += '0';
			}
		}

		return (new BinaryInteger(temp));
	}

	// bitwise xor of two binary integers
	public BinaryInteger xor(BinaryInteger b) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			switch (Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(b.toString().charAt(i))) {
			case 0:
				temp += '0';
				break;
			case 1:
				temp += '1';
				break;
			case 2:
				temp += '0';
				break;
			}
		}
		return (new BinaryInteger(temp));
	}

	// number of leading zeros
	public int leadingZeros() {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				count++;
			} else {
				return count;
			}
		}
		return count;
	}

	// is this binary integer > b?
	public boolean isGreaterThan(BinaryInteger b) {
		String bs = b.toString();
		int l1 = s.length();
		int l2 = bs.length();

		if (l1 > l2) {
			for (int i = 0; i < (l1 - l2); i++) {
				bs = "0" + bs;
			}

		} else if (l2 > l1) {
			for (int i = 0; i < (l2 - l1); i++) {
				s = "0" + s;
			}
		}

		int largerSize = (l1 > l2) ? l1 : l2;

		for (int i = 0; i < largerSize; i++) {
			if (s.charAt(i) == '0' && bs.charAt(i) == '1') {
				return false;
			} else if (s.charAt(i) == '1' && bs.charAt(i) == '0') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryInteger a = new BinaryInteger("00011110");
		BinaryInteger b = new BinaryInteger("01010000");
		System.out.println("a                = " + a.toString());
		System.out.println("b                = " + b);
		System.out.println("a.length()       = " + a.length());
		System.out.println("a.not()          = " + a.not());
		System.out.println("a.xor(b)         = " + a.xor(b));
		System.out.println("a.leadingZeros() = " + a.leadingZeros());
		System.out.println("a.isGreaterThan(b) = " + a.isGreaterThan(b));

	}

}
