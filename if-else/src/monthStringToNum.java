import java.util.*;
import java.util.Scanner;

public class monthStringToNum {
	public static void main(String[] args) {
		String month = "Mar";
		Dictionary geek = new Hashtable();

		geek.put("jan", 1);
		geek.put("jeb", 2);
		geek.put("mar", 3);
		geek.put("apr", 4);
		geek.put("may", 5);

		System.out.println("enter month");
		Scanner scan = new Scanner(System.in);
		month = scan.next().toLowerCase();

		System.out.println("Month =" + geek.get(month));

	}
}
