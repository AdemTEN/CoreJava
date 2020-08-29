/*Write a RainFall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:
- total rainfall for the year
- the average monthly rainfall
- the month with the most rain
- the month with the least rain
Input Validation: Do not accept negative numbers
for the monthly rainfall figures.
 * 
 */
package day26_Arrays_Part3;

import java.util.Scanner;

public class Task_RainFall {

	public static void main(String[] args) {

		System.out.println("Please enter the following rainfall for months ehead: ");
		System.out.println("Month Rainfall (In inches)");

		String[] monthsArray = createMonthsArray();
		double[] rainFallArray = createRainFallArray(12);

		showBothArray(monthsArray, rainFallArray);
		System.out.println("The sum of the all the rain is:" + sumOfAllTheRain(rainFallArray) + "inches");
		System.out.println("The average rainfall was: " + averageRainFall(rainFallArray) + " inches");
		System.out.println("The max rain is:" +maxRain(rainFallArray)+ "inches");
		System.out.println("The min rain is:" +minRain(rainFallArray)+ "inches");
		
	}

	public static String[] createMonthsArray() {

		String[] monthsArray = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		return monthsArray;

	}

	public static double[] createRainFallArray(int arraySize) {

		double[] rainFallArray = new double[arraySize];
		return rainFallArray;
	}

	public static void showBothArray(String[] monthsArray, double[] rainFallArray) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < monthsArray.length; i++) {
			System.out.print(monthsArray[i] + ":");
			rainFallArray[i] = scan.nextDouble();
			if(rainFallArray[i]<0) {
				System.out.println("Do not enter negative value please RE-Enter.");
				rainFallArray[i] = scan.nextDouble();	
			}
		}
	}

	public static double sumOfAllTheRain(double[] rainFallArray) {

		double sumRainFall = 0;

		for (double i : rainFallArray) {
			sumRainFall += i;
		}

		return sumRainFall;

	}

	public static double averageRainFall(double[] rainFallArray) {

		return sumOfAllTheRain(rainFallArray) / 12;
	}

	public static double maxRain(double[] rainFallArray) {

		double max = 0;
		for (double i : rainFallArray) {
			if(i > max) {
				max = i;
			}
			
		}
		return max;
	}
	
	public static double minRain(double [] rainFallArray) {
		double min = 0;
		for (double i : rainFallArray) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}

}
