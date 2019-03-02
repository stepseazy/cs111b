package midterm;

import java.util.Scanner;

public class question1 {
	static final int ARRAY_SIZE=10;
	static int[] a= new int[ARRAY_SIZE];
	
	static private int getMin() {
		int min=a[0];
		for(int i=1;i<ARRAY_SIZE;i++) {
			if(a[i]<min)
				min=a[i];
			
		}
		return min;
	}
	static private int getMax() {
		int max=a[0];
		for(int i=1;i<ARRAY_SIZE;i++) {
			if(a[i]>max)
				max=a[i];
			
		}
		return max;
	}
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.println("enter a number");
			
			a[i]=scan.nextInt();
		}
		System.out.println("min"+getMin());
		System.out.println("max"+getMax());
	}
}
