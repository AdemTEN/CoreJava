package day24_Arrays_Part1;

import java.util.Scanner;

public class Task_87_DayArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String[] day = new String[7];
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wed";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		System.out.print("Enter the index number of the day:");
		int index = scan.nextInt();
		System.out.println("Today is " + day[index]);
		
	}

}
