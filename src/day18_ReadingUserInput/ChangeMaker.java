package day18_ReadingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a whole number between 1-99 as a cent:  ");
		System.out.println("You have can only enter three times wrong value.");
		int counter = 3;
		for (int i = 1; i <= 3; i++) {

			int cent = scan.nextInt();
			if (1 <= cent && cent <= 99) {
				changeMaker(cent);
				System.out.println("Correct!!!");
				break;
			} else {
				System.out.println("Invalid value!!!");
				counter--;
				if (counter == 0) {
					System.out.println("Finished!!! You can not enter any more a value");
				} else {
					System.out.println(
							"Enter a valid value please.  Try again. You can enter only  " + counter + "  times.");
				}
			}
		}


	}

	public static void changeMaker(int cent) {

		int quarter = cent / 25;
		int dimes = cent % 25 / 10;
		int nickels = cent % 25 % 10 / 5;
		int pennies = cent % 25 % 10 % 5 / 1;
		System.out.println(cent + " cent: " + quarter + " quarters " + dimes + " dimes " + nickels + " nickels "
				+ pennies + " pennies ");

	}

}
