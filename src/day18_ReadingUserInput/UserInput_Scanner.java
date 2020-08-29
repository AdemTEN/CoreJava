package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput_Scanner{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a int value :");
		int b2 = input.nextInt();
		System.out.println("Enter a byte value");
		byte b1 = scan.nextByte();
		scan.close();
	
		System.out.println(b1);
		System.out.println(b1*4);
		
		
		
		
		
		
	}

}
