package day15_Method_Part3;

public class Task68_2 {

	public static void main(String[] args) {

		yearsUntilRetirement("Adem", 1982);
		
	}

	public static int calculateAge (int yearBirth) {
		
		return  2020- yearBirth;
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementYears = 65 - calculateAge(year);
			System.out.println(name + " retires in " + retirementYears + " years. ");
		
		
	}
}
