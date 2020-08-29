package day26_Arrays_Part3;

public class MethodArrayMy {

	public static void main(String[] args) {
	
		String[]days = creatDaysArray();
		printArray(days);
	}
	
	public static String [] creatDaysArray() {
		
		String [] days = {"Monday", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		 return days;
	}
	
	
	public static void printArray (String[] days) {
		
		for(String eachday : creatDaysArray()) {
			System.out.println(eachday);
		}
		
	}

}
