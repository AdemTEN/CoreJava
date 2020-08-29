package day26_Arrays_Part3;

import java.util.Arrays;

public class Split_Array {

	public static void main(String[] args) {
		
		String str = "Today i don't want to go outside";
		
		String [] array = str.split("i");
		System.out.println(array.length);
		
		for (String words : array) {
			System.out.println(words);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(array[2]);
		System.out.println(array[2].charAt(0));
		
		String str1 = "Yaklasik 1.080.000.000 sonuc bulundu (0,63 saniye) ";
		String []array1 = str1.split("Yaklasik ");
		
		System.out.println(Arrays.toString(array1));
		for(String words1: array1) {
			System.out.println(words1);
		}
		
	}

}
