import java.util.Scanner;
public class pyramid {
	public static void main(String[] args) {
		int res=0;
		System.out.println("Enter Number of lines to print");
		Scanner scan=new Scanner(System.in);
		res=scan.nextInt();
		if(res>7) {
			res=7;
		}
		long multiplier=1;
		for(int i=1;i<=res;i++) {
			System.out.println(multiplier);
			System.out.println(multiplier*multiplier);
			multiplier*=10;
			multiplier+=1;
		}
	}
}
