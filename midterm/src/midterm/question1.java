package midterm;

import java.util.Scanner;

public class question1 {
	static int arraySize=0;
	static int[] a= new int[arraySize];
	
	static private int getMin() {
		int min=a[0];
		for(int i=1;i<arraySize;i++) {
			if(a[i]<min)
				min=a[i];
			
		}
		return min;
	}
	static private int getMax() {
		int max=a[0];
		for(int i=1;i<arraySize;i++) {
			if(a[i]>max)
				max=a[i];
			
		}
		return max;
	}
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num elements");
		arraySize=scan.nextInt();
		a= new int[arraySize];
		
		for(int i=0;i<arraySize;i++) {
			System.out.println("enter a number");
			
			a[i]=scan.nextInt();
		}
		for(int i=0;i<arraySize;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("min= "+getMin());
		System.out.println("max= "+getMax());
	}
}
