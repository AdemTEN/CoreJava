package day18_ReadingUserInput;

import java.util.Scanner;

public class Task_73_GuessSecretNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 20) + 1;
		int guess;
		do {
			System.out.print("Enter your guess number:");
			guess = scan.nextInt();
			if (guess == secretNumber) {
				System.out.println(
						"Congrat, you got it!!!.\n Secret number is : " + secretNumber + "\n Your guess is : " + guess);
				break;
			} else {
				if (guess < secretNumber) {
					System.out.println("Your guess is too small");
				} else
					System.out.println("Your guess is too large");
			}

		} while (guess != secretNumber);

	}
}
