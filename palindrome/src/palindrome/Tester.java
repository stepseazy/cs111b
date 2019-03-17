package palindrome;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse<String> r = new Reverse<String>("hello");
		int[] i1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Reverse<int[]> i = new Reverse<int[]>(i1);
		r.print();
		i.print();
		
		Palindrome<String> p1=new Palindrome<String>("racecar");
		Palindrome<String> p2=new Palindrome<String>("raceboat");
		int[] i3 = new int[] { 1, 2, 3, 2, 1 };
		int[] i4 = new int[] { 1, 2, 3, 4, 5 };
		Palindrome<int[]> p3=new Palindrome<int[]>(i3);
		Palindrome<int[]> p4=new Palindrome<int[]>(i4);
		p1.printPalindrome();
		p2.printPalindrome();
		p3.printPalindrome();
		p4.printPalindrome();	
	}
}
