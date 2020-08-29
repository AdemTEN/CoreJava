package day15_Method_Part3;

import review_Session_Println_Variables.week3.yesNo;

public class Task_68RetirementYears {

	public static void main(String[] args) {

		
		yearsUntilRetirement("Mike ",  1990);
		
	}

	public static int calculateAge(int yearBirth) {
		
		int age = 2020 - yearBirth;
		return age;
	}
	
	public static void yearsUntilRetirement(String name, int yearBirth) {
		
		 int retirementYear = 65 - calculateAge(yearBirth);   
		System.out.println(name + "retires in " +  retirementYear + " years." );
	}
}
