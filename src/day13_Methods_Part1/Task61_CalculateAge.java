package day13_Methods_Part1;

public class Task61_CalculateAge {
	public static void main(String[] args) {
		
		calculateAge(2020, 1982);
		calculateAge(2020, 2012);
	}

	public static void calculateAge(int currentYear, final int birthYear ) {
		
		int age = currentYear - birthYear;
		System.out.println("The age is: " + age);
		
	}
}
