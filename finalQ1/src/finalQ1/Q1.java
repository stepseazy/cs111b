package finalQ1;

import java.util.ArrayList;

public class Q1 {

	static ArrayList<Integer> numArray;

	// multiply large numbers > INT_MAX/LONG_MAX
	static void multiply(int x) {
		int carry = 0;
		int size = numArray.size();
		for (int i = 0; i < size; i++) {
			int res = carry + numArray.get(i) * x;

			numArray.set(i, res % 10);
			carry = res / 10;
		}
		while (carry != 0) {
			numArray.add(carry % 10);
			carry /= 10;
		}
	}

	static void factorial(int n) {
		numArray = new ArrayList<Integer>();
		numArray.add(1); // adds 1 to the end

		for (int i = 1; i <= n; i++)
			multiply(i);
	}

	// sum digits of n!
	static int findSumFactorial(int n) {
		factorial(n);

		// Find sum of digits in vector v[]
		int sum = 0;
		int size = numArray.size();
		for (int i = 0; i < size; i++)
			sum += numArray.get(i);
		return sum;
	}

	public Q1() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {

		System.out.println(findSumFactorial(100));

	}

}
