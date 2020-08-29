package day25_Arrays_Part2;

import java.util.Arrays;

public class SameArray {

	public static void main(String[] args) {
		
		int[] array1 = {2,4,6,8,10};
		int[] array2 = array1;
		
		array1[1] = 50000;
		array2[3] = 10000;
		
		System.out.println("The contants of array1:");
		for(int values : array1) {
			System.out.println(values);
		}
		
		System.out.println("The contents of array2:");
		for(int values : array2) {
			System.out.println(values);
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
