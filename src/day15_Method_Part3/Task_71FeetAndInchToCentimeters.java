package day15_Method_Part3;

public class Task_71FeetAndInchToCentimeters {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeter(6, 0);

		calcFeetAndInchesToCentimeter(-10, 0);
		calcFeetAndInchesToCentimeter(0, 1);

		calcFeetAndInchesToCentimeter(100);
		
		calcFeetAndInchesToCentimeter(167);
	}

	public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
		if (feet >= 0 && (0 <= inches && inches <= 12)) {
			double centimeters = (feet * 12) * 2.54 + inches * 2.54 ;
			System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " centimeters");
			return centimeters;
		} else {
			System.out.println("invalid feet or inches");
			return -1;
		}

	}

	public static double calcFeetAndInchesToCentimeter(double inches) {

		if (inches >= 0) {
			double feetInInches = (int)(inches / 12);
			double remainInches = inches % 12;
			System.out.println(inches + "inches= " + feetInInches + " feet " + remainInches + " inches.");
			return calcFeetAndInchesToCentimeter(feetInInches, remainInches);
		} else {
			System.out.println("invalid output");
			return -1;
			
		}

	}

}
