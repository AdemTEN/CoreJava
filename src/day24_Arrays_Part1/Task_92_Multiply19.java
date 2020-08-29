package day24_Arrays_Part1;

import java.util.Arrays;

public class Task_92_Multiply19 {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		
		storeNumberInArray(numbers);
		multiply19EachArrayNumber(numbers);
		printEachArray(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
	}

	public static void printEachArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void multiply19EachArrayNumber(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] *= 19;
		}
	}

	public static void storeNumberInArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;

		}
	}

}
