package day8_controlFlowStatement_part2;

public class Task33 {

	public static void main(String[] args) {

		double marks = -50;
		
		if (0<marks && marks < 60 ) {
			System.out.println("Fail");
		}else if (60<= marks && marks <=90) {
			System.out.println("Pass");
		}else if (marks > 90) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("invalid marks");
		}
		
		
		
		
		
	}

}
