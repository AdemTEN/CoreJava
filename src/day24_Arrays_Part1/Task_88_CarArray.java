package day24_Arrays_Part1;

import java.util.Random;
import java.util.Scanner;

public class Task_88_CarArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] cars = new String[7];

		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Posche";
		cars[6] = "Ferrari";

		System.out.print("Enter an index number between 0 and 6 o choose your dream car:");
		int index = scan.nextInt();
		System.out.println("Your dream car is: " + cars[index]);

		Random rn = new Random();

		int price = 0;
		if (index <= 2) {
			price = rn.nextInt(20001) + 20000;
		} else if (index <= 4) {
			price = rn.nextInt(30001) + 50000;
		} else if (index <= 6) {
			price = rn.nextInt(50001) + 100000;
		}else {
			System.out.println("Invalid car");
		}

		System.out.print("Price of the car is: $" + price);

	}

}
