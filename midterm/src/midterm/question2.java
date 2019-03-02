package midterm;

public class question2 {
	static int num1=1;
	static int num2=2;
	static int num3=3;
	static int sum=1;
	static boolean isOdd=true;

	public static void main(String[] args) {
		
		while(num3<=1000) {
			if(isOdd)
				sum+=num3;
			num1=num2;
			num2=num3;
			num3=num1+num2;

			isOdd=!isOdd;

		}
		System.out.println(sum);
	}
}
