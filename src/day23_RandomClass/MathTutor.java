package day23_RandomClass;

//import java.util.Random;
//import java.util.Scanner;

import java.util.*;

public class MathTutor {

	public static void main(String[] args) {

		int number1;
		int number2;
		int sum;
		int userAnswer;

		Scanner scan = new Scanner(System.in);
		Random rn = new Random();

		do {
			number1 = rn.nextInt(100);
			number2 = rn.nextInt(100);

			System.out.println("What is the answer to the following problem?");

			System.out.print(number1 + "+" + number2 + " =? ");
			userAnswer = scan.nextInt();
			sum = number1 + number2;
			if (sum == userAnswer) {
				System.out.println("Right answer!You got it.");
				break;
			} else {
				System.out.println("Sorry, Wrong answer!!! The correct answer is: " + sum);
			}
		} while (sum != userAnswer);

	}

}
