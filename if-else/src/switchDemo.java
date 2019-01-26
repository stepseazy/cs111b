
public class switchDemo {
	public static void main(String[] args) {
		int month=8;
		String monthString="";
		
		switch(month) {
		case 1: 
			monthString="January";
			break;
		case 2:
			monthString="Feb";
			break;
		case 3: 
			monthString="Mar";
			break;
		case 4:
			monthString="Apr";
			break;
		case 5: 
			monthString="may";
			break;
		case 6:
			monthString="Jun";
			break;
		case 7: 
			monthString="Jul";
			break;
		case 8:
			monthString="Aug";
			break;
		}
		System.out.println("Month =" + monthString);
		
	}
}
