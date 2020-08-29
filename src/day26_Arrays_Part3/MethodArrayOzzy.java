package day26_Arrays_Part3;

import java.util.Arrays;
import java.util.Random;

public class MethodArrayOzzy {

	public static void main(String[] args) {
		int number = 5;
		printArray(number);
		printArray(number);
	}

	public static int[] createArray(int arraySize) {

		Random rn = new Random();
		int[] myArray = new int[arraySize];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rn.nextInt(100);
		}
		return myArray;
	}

	public static void printArray(int number) {

		for (int value : createArray(number)) {

			System.out.println(value);
		}
	}
	public static void printArrayList(int number) {
		
		System.out.print(Arrays.toString(createArray(number)));
	}
}
