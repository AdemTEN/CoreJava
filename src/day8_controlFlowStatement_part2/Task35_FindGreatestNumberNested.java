package day8_controlFlowStatement_part2;

public class Task35_FindGreatestNumberNested {

	public static void main(String[] args) {

		int n1 = 500000;
		int n2 = 4000;
		int n3 = 3000;
		
		if (n1>n2) {
			if (n1>n3) {
				System.out.println("n1 is greatest");
			}
		}else {
			if (n2>n3) {
				System.out.println("n2 is greatest");
			}else {
				System.out.println("n3 is greatest");
			}
			
		}
		
		
}
}
