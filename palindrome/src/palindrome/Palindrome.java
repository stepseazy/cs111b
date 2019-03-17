package palindrome;

public class Palindrome<T> extends Reverse<T> {
	
	private static boolean arraysEqual(int[] a, int[] b) {
		if(a.length!=b.length)
			return false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

	public Palindrome(T obj) {
		super(obj);
	}
	
	public boolean isPalindrome() {
		switch (getType()) {
		case INT_ARRAY:
			return arraysEqual(getOriginalArray(), getReverseArray());
		case STRING:
			return (getOriginalString().contentEquals(getReverseString()));
		default:
			return false;
		}
	}
	
	public void printPalindrome() {
		switch(getType()) {
		case INT_ARRAY:
			printArray(getOriginalArray());
			System.out.println((isPalindrome()?"IS":"IS NOT")+" a palindrome.");
			break;
		case STRING:
			System.out.println(getOriginalString());
			System.out.println((isPalindrome()?"IS":"IS NOT")+" a palindrome.");
			break;
		default:
			break;
		}
	}
}
