package day7_ControlFlowStatements;

public class Task25 {

	public static void main(String[] args) {

		int a = 9;
		int b = 8;
		int c = 1;
		
		if (a>b && a>c) {
			System.out.println("The greatest number is :" + a);	
		}
		
		if (b>a &&b>c) {
			System.out.println("The greatest number is :" + b);
		}
		
		if (c>a && c>b) {
			System.out.println("The greatest number is :" + a);
		}
	}

}
