package day24_Arrays_Part1;

import java.util.*;

public class Task_86_MonthArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] month = new String[12];

		month[0] = "January";
		month[1] = "February";
		month[2] = "March";
		month[3] = "April";
		month[4] = "May";
		month[5] = "June";
		month[6] = "July";
		month[7] = "August";
		month[8] = "September";
		month[9] = "October";
		month[10] = "November";
		month[11] = "December";

		System.out.print("Enter the index of month number:");

		int indexNumber = scan.nextInt();

		System.out.println("The month name is<" + month[indexNumber] + ">");
		System.out.println(month);

	}

}
