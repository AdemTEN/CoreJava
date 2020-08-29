package day7_ControlFlowStatements;

public class ifStatements {

	public static void main(String[] args) {

		//int score = 80;
		int score = 69;
		
		boolean x = score >=70;
		if (x) {
			System.out.println("Excellent you passed the exam.");
		}
		System.out.println("Sorry you could not passed the exam");
		System.out.println("*******************************************");
		
		int sales, bonus;
		double commissionRate,salary;
		
		sales = 5200;
		salary = 10000;
		
		if (sales > 5000) {
			bonus = 500;
			commissionRate = 1.12;
			salary = salary * 1.12 + bonus;
		}
		System.out.println("Salary " + salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
