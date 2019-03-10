package midterm;

public class newClass {
	public static void main(String args[]) {
		try {
			try {
				try {
					int arr[] = { 1, 2, 3, 4 };
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic exceptopn innermost");
				}
			} catch (Exception e3) {
				System.out.println("Arithmetic exceptopn second block");
			}
		} catch (Exception e1) {
			System.out.println("Arithmetic exceptopn third block");
		}
	}
}
