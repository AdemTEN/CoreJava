package day14_Methods_Part2;

public class Tak68_TwoMethodsMikeAge {

	public static void main(String[] args) {

		
		 yearsUntilRetirement("Mike", 1990);
		
		
	}

	public static int calculateAge(int birthYear) {
		
		int age = 2020 - birthYear;
		return age;
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		
		int retirementAge = 65 - (calculateAge(year)) ; 
		
		System.out.println(name + " retires in " + retirementAge + " years");
	}
}
