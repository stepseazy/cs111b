import java.util.*;
public class monthStringToNum {
	public static void main(String[] args) {
		String month="Mar";
		Dictionary geek = new Hashtable();
	
		geek.put("Jan", "1"); 
        geek.put("Feb", "2");
		geek.put("Mar", "3"); 
        geek.put("Apr", "4");
        geek.put("May", "5");
		

		System.out.println("Month =" + geek.get(month));
		
	}
}
