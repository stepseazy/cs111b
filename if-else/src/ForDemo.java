
public class ForDemo {
	public static void main(String[] args) {
//		for (int i=1;i<11;i++) {
//			System.out.println("Square is : "+ Math.pow(i, 3) );
//		};
		for (int i=1;i<12;i++) {
			for (int j=0;j<60;j+=5) {
				for (int k=0;k<60;k+=5) {
					System.out.println(calcNum(i)+":"+calcNum(j)+":"+calcNum(k));
				};
			};
		};
	}
	static String calcNum(int i) {
		return ((i>9)?""+i:("0"+i));
	}
	
}
