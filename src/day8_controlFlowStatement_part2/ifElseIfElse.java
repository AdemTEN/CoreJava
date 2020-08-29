package day8_controlFlowStatement_part2;

public class ifElseIfElse {

	public static void main(String[] args) {

		int day = 8;
		
		if(day == 1) {
			System.out.println("Monday");
		
		}else if (day == 2){
			System.out.println("Tuesday");
		}else if (day == 3) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else if (day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Not a valid day");
		}
		
		System.out.println("****************************************");
		
         int age =12 ;
         
         if (2 < age && age <=5) {
        	 System.out.println("Kindergten");
         }else if (5<age && age <=12 ) {
        	 System.out.println("Grundschule");
        	 
         }else if(12 < age || age < 18 ) {
        	 System.out.println("Mittelchule");
        	 
         }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
