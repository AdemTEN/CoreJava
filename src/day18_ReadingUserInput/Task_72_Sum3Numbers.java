package day18_ReadingUserInput;

import java.util.Scanner;

public class Task_72_Sum3Numbers {

	public static void main(String[] args) {

		int sum = sum1();
		int sum2 = 0;
		System.out.println("Total of three number is:" + sum);
		if (sum < 35) {
			 sum2 = sum2();
			 System.out.println("The total of four number is: " + sum2);
		}else {
			Scanner scan3= new Scanner(System.in);
			System.out.println("Enter an extra number");
			int c = scan3.nextInt();
			sum2 = sum2();
			sum2 += c;
			System.out.println("The total of 5 number is: " + sum2);
		}

	}

	public static int sum1() {

		System.out.print("Enter three integer number:");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		return n1 + n2 + n3;

	}

	public static int sum2() {
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter four number");
		int a = scan2.nextInt();
		int b = scan2.nextInt();
		int c = scan2.nextInt();
		int d = scan2.nextInt();
		return a + b + c + d;
	}

}
