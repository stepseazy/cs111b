package adder;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {

	int x;
	int y;
	int response;
	int result;
	double result2;
	public void add() {
		result=x+y;
	}
	public void subtract() {
		result=x-y;
	}
	public void multiply() {
		result=x*y;
	}
	public void divide() {
		result2=(double)x/(double)y;
	}	
	public void squareRoot() {

		result2=Math.sqrt(x);
	}
	public void factorial() {
		result=1;
		for(int i=x;i>0;i--) {
			result=result*i;
		}
	}
	public static void main(String[] args) {
		Calculator myCalculator=new Calculator();
		System.out.println("chose one: add(1), subtract(2), multiply(3), divide(4), squareRoot(5) or factorial(6)?");
		Scanner scan=new Scanner(System.in);
		myCalculator.response=scan.nextInt();
		System.out.println("enter 1st num");
		Scanner scan2=new Scanner(System.in);
		myCalculator.x=scan2.nextInt();
		if(myCalculator.response<5) {
			System.out.println("enter 2nd num");
			Scanner scan3=new Scanner(System.in);
			myCalculator.y=scan3.nextInt();
		}
		switch(myCalculator.response) {
		case 1:
			myCalculator.add();
			System.out.println(myCalculator.result);
			break;
		case 2:
			myCalculator.subtract();
			System.out.println(myCalculator.result);
			break;
		case 3:
			myCalculator.multiply();
			System.out.println(myCalculator.result);
			break;
		case 4:
			myCalculator.divide();
			System.out.println(myCalculator.result2);
			break;
		case 5:
			myCalculator.squareRoot();
			System.out.println(myCalculator.result2);
			break;
		case 6:
			myCalculator.factorial();
			System.out.println(myCalculator.result);
			break;
		}
	}	
}
