package day15_Method_Part3;

public class Task71_02 {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(-10, 0);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if (feet<0 || (inches <0 || inches>12)) {
			System.out.println("Invalid feet or inches!!!");
			return -1;
		}
		
		double centimeters = feet * 12 * 2.54 + inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches= " + centimeters + " cetimeters" );
		return centimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches<0) {
			System.out.println("invalid  inches!!");
			return -1;
		}
		double feetInInches = (int)inches / 12;
		double remainInches = inches % 12;
		System.out.println(inches +" inches= " + feetInInches + " feet " + remainInches + " inches" );
		return calcFeetAndInchesToCentimeters(feetInInches, remainInches);
	}
}
