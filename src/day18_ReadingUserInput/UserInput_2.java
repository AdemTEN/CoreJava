package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a int number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter a second number:");
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		
		System.out.println("Output:" +  num1  + ":" + num2 + ":" + str);
		
		
	}

}
