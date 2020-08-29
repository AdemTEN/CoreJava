package day7_ControlFlowStatements;

public class IfElseStatement {

	public static void main(String[] args) {

		int score = 69;
				
		boolean x = score >=70;
		if (x) {
			System.out.println("Excellent you passed the exam.");
	}
		else {
			System.out.println();
		}
		
System.out.println("*******************************************");
		
		int sales, bonus;
		double commissionRate,salary;
		
		sales = 4000;
		salary = 10000;
		
		if (sales > 5000) {
			bonus = 500;
			commissionRate = 1.12;
			
		}else {
			bonus = 100;
			commissionRate = 1.10;
		}
		salary = salary * 1.12 + bonus;
		System.out.println("Salary " + salary);
		
		
		
		
		
		
		
}
}
