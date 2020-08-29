package day19_StringManipulation_Part1;

import java.util.Scanner;

public class Task_75_TotalCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your first name:");
		String fname = scan.next();
		
		System.out.println("Enter your last name:");
		String lname = scan.next();
		
		System.out.println("Total characters in your first and last name is:  " +( fname.length() + lname.length()));

	}

}
