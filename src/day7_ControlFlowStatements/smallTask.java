package day7_ControlFlowStatements;

public class smallTask {

	public static void main(String[] args) {
		
		int x =0;
		int y = 20;
		
		if (y == 20) {
			x = 5;
			
		}
		System.out.println("x=" + x + " y=" + y);
	System.out.println("**********************************************");
		
		double hours = 45;
		double pay = 5000;
		double payRate ;
		
		if (hours > 40) {
			payRate = 1.5;
			pay = pay * payRate;
			
		}
	
		System.out.println("Pay = " + pay);
		System.out.println("**********************************************");
		
        int fees = 45;	
		int sales = 60000;
		boolean max = sales >= 50000;
		
		if (max) {
			fees = 50;

		}
		System.out.println("fees: " + fees);
	
		
		System.out.println("**********************************************");
		
		int a = 10;
		int b = 50;
		int c = 105;
		
		if (b == 50 && c >= 100) {
			a= 20;
			
		}
		System.out.println("a is: " + a);
		System.out.println("**********************************************");
		
		int temp =65;
		if (70 <=temp && temp <=80) {
			System.out.println("Ideal Temp");
		}else {
			System.out.println("NOT ideal Temp");
			
			
		}

		
	}

}
