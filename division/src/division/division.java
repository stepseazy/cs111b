
package division;

import java.util.Scanner;

public class division {

	
	public static void main(String[] args) {
		int a, b, result;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		a=input.nextInt();
		b=input.nextInt();
		
		try {
			result=a/b;
			System.out.println("Result= "+result);
		}
			catch(ArithmeticException e ) {
			System.out.println("Exception Caught: Dont devide by 0");
			}
	
}
	
}
