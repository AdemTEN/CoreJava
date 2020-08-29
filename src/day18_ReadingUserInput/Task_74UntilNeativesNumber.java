package day18_ReadingUserInput;

import java.util.Scanner;

public class Task_74UntilNeativesNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int sum = 0;
		do {
			System.out.print("Enter three number: ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			sum = sum + a + b + c;
			System.out.println("The total is: " + sum);

		} while (a > 0 && b > 0 && c > 0);
		
		System.out.print(" You enter a negative number. The last result is : " + sum);

	}

}
