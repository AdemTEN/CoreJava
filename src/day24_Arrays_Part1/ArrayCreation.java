package day24_Arrays_Part1;

public class ArrayCreation {

	public static void main(String[] args) {
	
		//Option-1:
		
		int [] numbers ;
		numbers = new int[3];
		
		//Option-2:
		int [] numbers1 = new int[5];
		float[] temp = new float[7];
		char[]letters = new char[50];
		long[]units = new long[50];
		String words[] = new String[5];
		
		System.out.println(numbers[2]);
		System.out.println(temp[5]);
		System.out.println(words[4]);
		
		System.out.println(units[50]);
		
	}

}
