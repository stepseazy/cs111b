package palindrome;

public class Reverse<T> {

	T original;
	T reverse;

	public Reverse(T o) {
		try {
			copy(o);
			reverse(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copy(T o) throws Exception {
		if (o instanceof String) {
			original = o;
		} else if (o instanceof Integer[]) {
			int length = ((Integer[]) o).length;
			Integer[] temp = new Integer[length];
			original = (T) temp;
			for (int i = 0; i < length; i++) {
				((Integer[]) original)[i] = ((Integer[]) o)[i];
			}
		} else {
			throw new Exception("this type not supported");
		}
	}

	public void reverse(T o) {
		if (o instanceof String) {
			String temp = "";
			int length = ((String) o).length();
			for (int i = 0; i < length; i++) {
				temp += ((String) original).charAt(length - i - 1);
			}
			reverse = (T) temp;
		} else if (o instanceof Integer[]) {
			for (int i = 0; i < ((Integer[]) o).length; i++) {
				((Integer[]) reverse)[i] = ((Integer[]) original)[i];
			}
		}
	}

	public void print() {
		if (original instanceof String) {
			System.out.println(original);
			System.out.println(reverse);
		} else if (original instanceof Integer[]) {
			for (int i = 0; i < ((Integer[]) original).length; i++) {
				System.out.println(((Integer[]) original)[i]);
			}
			for (int i = 0; i < ((Integer[]) reverse).length; i++) {
				System.out.println(((Integer[]) reverse)[i]);
			}
		}
	}

}
