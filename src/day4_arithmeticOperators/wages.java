package day4_arithmeticOperators;

// This Program calculates hourly wages plus overtime 

public class wages {

	public static void main(String[] args) {
		
		double regularWage; //The calculate regular wage
		double basePay = 25; //The base pay
		double regularHours = 40; //The hours less overtime
		double overtimeWage; // Overtime Pay wages
		double overTimePay = 37.5;
		double overTimeHours = 15; // Total Wages
		double totalWage;
		
		regularWage = basePay * regularHours;
		
		overtimeWage = overTimePay * overTimeHours;
		
		totalWage = regularWage + overtimeWage;
		System.out.println("Wages for this week are = $ " + totalWage );
		
		
		
		
		
		
		
		
		
	
	}

}
