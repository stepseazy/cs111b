package palindrome;

enum types {
	STRING, INT_ARRAY;
}

public class Reverse<T> {
	private types type;
	private String originalString;
	private String reverseString;
	private int[] originalArray;
	private int[] reverseArray;

	public types getType() {
		return type;
	}

	public Reverse(T obj) {
		try {
			getType(obj);
			copy(obj);
			reverse(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getType(T obj) throws Exception {
		String temp = obj.getClass().getName();
		switch (temp) {
		case "[I":
			type = types.INT_ARRAY;
			break;
		case "java.lang.String":
			type = types.STRING;
			break;
		default:
			throw new Exception("this type not supported by reverse class");
		}

	}

	public void copy(T obj) {
		switch (getType()) {
		case INT_ARRAY:
			int length = ((int[]) obj).length;
			setOriginalArray(new int[length]);
			for (int i = 0; i < length; i++) {
				getOriginalArray()[i] = ((int[]) obj)[i];
			}
			break;
		case STRING:
			setOriginalString((String) obj);
			break;
		default:
			break;
		}
	}

	public void reverse(T obj) {
		int length;
		switch (getType()) {
		case INT_ARRAY:
			length = getOriginalArray().length;
			setReverseArray(new int[length]);
			for (int i = 0; i < length; i++) {
				getReverseArray()[i] = getOriginalArray()[length - i - 1];
			}
			break;
		case STRING:
			setReverseString("");
			length = ((String) obj).length();
			for (int i = 0; i < length; i++) {
				setReverseString(getReverseString() + ((String) getOriginalString()).charAt(length - i - 1));
			}
			break;
		default:
			break;
		}
	}

	public static void printArray(int[] a) {
		int length = a.length;
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public void print() {
		switch (getType()) {
		case INT_ARRAY:
			System.out.println("Original: ");
			printArray(getOriginalArray());
			System.out.println("Reversed: ");
			printArray(getReverseArray());
			break;
		case STRING:
			System.out.println("Original: ");
			System.out.println(getOriginalString());
			System.out.println("Reversed: ");
			System.out.println(getReverseString());
			break;
		default:
			break;
		}
	}

	protected String getOriginalString() {
		return originalString;
	}

	private void setOriginalString(String originalString) {
		this.originalString = originalString;
	}

	protected String getReverseString() {
		return reverseString;
	}

	private void setReverseString(String reverseString) {
		this.reverseString = reverseString;
	}

	protected int[] getOriginalArray() {
		return originalArray;
	}

	private void setOriginalArray(int[] originalArray) {
		this.originalArray = originalArray;
	}

	protected int[] getReverseArray() {
		return reverseArray;
	}

	private void setReverseArray(int[] reverseArray) {
		this.reverseArray = reverseArray;
	}

}
