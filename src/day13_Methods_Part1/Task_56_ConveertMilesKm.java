package day13_Methods_Part1;

import java.util.Scanner;

public class Task_56_ConveertMilesKm {

	public static void main(String[] args) {
		System.out.println("Convert miles into Km method");
		convertKM();
		convertKM();
	}

	public static void convertKM() {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the value of miles:");
		double miles = scan.nextInt();		
		double km = miles * 1.609344;
		System.out.println(miles +" miles is: " + km + " km");
	}
}
