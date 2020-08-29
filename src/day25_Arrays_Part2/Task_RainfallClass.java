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
package day25_Arrays_Part2;

import java.util.Scanner;

public class Task_RainfallClass {

	public static void main(String[] args) {

		

		System.out.println("Please enter the following rainfall for months ehead: ");
		System.out.println("Month Rainfall (In inches)");

		String[] months = extracted();
		double[] rainFall = extracted2();

		showArrays( months, rainFall);
		
		System.out.println("The sum of the rain is: " + totalRainfallForTheYear(rainFall) + " inches");
		System.out.println("The average rainfall was: " + averageMonthlyRainfall(rainFall) + " inches");
		System.out.println("The max rain is: " + maxRainfall(rainFall));
		System.out.println("The min rain is:" + minRainfall(rainFall));

	}

	public static double[] extracted2() {
		double[] rainFall = new double[12];
		return rainFall;
	}

	public static String[] extracted() {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months;
	}

	public static void showArrays(String[] months, double[] rainFall) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < months.length; i++) {

			System.out.print(months[i] + ":");
			rainFall[i] = scan.nextDouble();

		}
	}

	public static double totalRainfallForTheYear(double[] rainFall) {

		double totalRainfall = 0;
		for (int i = 0; i < rainFall.length; i++) {
			totalRainfall += rainFall[i];

		}
		return totalRainfall;

	}

	public static double averageMonthlyRainfall(double[] rainFall) {

		return totalRainfallForTheYear(rainFall) / 12;
	}

	public static double maxRainfall(double[] rainFall) {

		double max = 0;

		for (int i = 0; i < rainFall.length; i++) {
			if (rainFall[i] > max) {
				max = rainFall[i];
			}
		}
		return max;
	}

	public static double minRainfall(double[] rainFall) {

		double min = 5;
		for (int i = 0; i < rainFall.length; i++) {
			if (rainFall[i] < min) {
				min = rainFall[i + 1];
			}
		}
		return min;
	}

}
