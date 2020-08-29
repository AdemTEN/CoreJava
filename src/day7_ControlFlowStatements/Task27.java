package day7_ControlFlowStatements;

public class Task27 {

	public static void main(String[] args) {

	
		int hour = 10;
		
		if (hour < 12) {
			System.out.println("Good morning");
		}
		
		if (12 <= hour && hour < 15 ) {
			System.out.println("Good afternoon");
		}
		
		if (hour >= 15) {
			System.out.println("Good evening");
		}
	}
	

}
