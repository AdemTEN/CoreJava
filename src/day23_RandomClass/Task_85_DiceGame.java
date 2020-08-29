package day23_RandomClass;

import java.util.Random;

public class Task_85_DiceGame {

	public static void main(String[] args) {

		Random rn = new Random();

		int computerDice;
		int userDice;
		int countComputer = 0;
		int countUser = 0;
		System.out.println("Computer Dice:          User Dice:\n-----------------------------------");
		for (int i = 0; i < 10; i++) {
			computerDice = rn.nextInt(6) + 1;
			userDice = rn.nextInt(6)+1;
			System.out.println("     "+ computerDice + "                      " + userDice);
			
			if (computerDice == userDice) {
				continue;

			} else if (computerDice > userDice) {
				countComputer++;
			} else {
				countUser++;
			}

		}
		System.out.println("-----------------------------------");
		if (countComputer>countUser) {
			System.out.println("The winner is computer.");
			
		}else if(countComputer<countUser) {
			System.out.println("The winner is user.");
		}else {
			System.out.println("There is no winner.");
		}
		System.out.println("Computer has won: " + countComputer + ", User has won: " + countUser + " times"  );
	}
}
