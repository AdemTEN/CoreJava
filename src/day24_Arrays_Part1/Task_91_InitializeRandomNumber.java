package day24_Arrays_Part1;

import java.util.Random;

public class Task_91_InitializeRandomNumber {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int []numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = rn.nextInt(100);
			
			System.out.println(i+ ".element= " +numbers[i]);
		} 
	}

}
