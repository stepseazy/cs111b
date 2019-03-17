package palindrome;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse<String> r = new Reverse<String>("hello");
		Integer[] i1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Reverse<Integer[]> i = new Reverse<Integer[]>(i1);
		i.print();
	}

}
