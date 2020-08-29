package day18_ReadingUserInput;

import java.util.Scanner;

public class Task73GuessSecretNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int secretNumber = (int)(Math.random() * 20 )+ 1;
		System.out.println("Enter your guess number:");
		int guess = scan.nextInt();
		if (secretNumber != guess) {
			System.out.println("please try again your guess is not correct");
			while (guess!= secretNumber) {
				System.out.println("enter a new number:");
				guess = scan.nextInt();
				if (guess == secretNumber) {
					System.out.println("Congrat, you got it. secret number is : " + secretNumber 
							+ " your guess is " + guess );
					break;
				}else {
					if (guess<secretNumber) {
						System.out.println("Your number is too small");
					}else if (guess>secretNumber) {
						System.out.println("Your number is too large");
					}
				}
			}
			
			
			
			
		}else {
			System.out.println("Congrat, you got it. secret number is : " + secretNumber 
							+ " your guess is " + guess );
		}
	}

}
