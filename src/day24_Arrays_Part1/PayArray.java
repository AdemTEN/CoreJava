package day24_Arrays_Part1;

import java.util.Arrays;
import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int grossPayOfEachEmployee = 0;
		int totalPay = 0;
		final int EMPLOYEE =  5;
		final int WAGE_PER_HOUR ;
		System.out.print("Enter the one hour gross to pay:");
        WAGE_PER_HOUR = scan.nextInt();
        
		int[] hours = new int[EMPLOYEE];

		for (int i = 0; i < hours.length; i++) {
			System.out.print("Enter the total hours of the " + (i+1) +".employee:");
			hours[i] = scan.nextInt();
			
			grossPayOfEachEmployee = hours[i] * WAGE_PER_HOUR;
			totalPay += grossPayOfEachEmployee;
			System.out.println(i + 1 + ".employee gross pay is: " + grossPayOfEachEmployee+ "\n");
			
		}
		
	
		System.out.println("Total pay is: $" + totalPay);
		System.out.println("Hours for each employee ==>"+ Arrays.toString(hours));
	}

}
