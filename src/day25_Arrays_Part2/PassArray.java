package day25_Arrays_Part2;

public class PassArray {

	public static void main(String[] args) {

		int[] numbers = new int[4];
		
		getValues(numbers);
		
		System.out.println("Here are the nubers that you entered");
		
		showValues(numbers);
		
	}
	public static void getValues(int [] numbers) {
		
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 120;
		numbers[3] = 25;
		
	}
	public static void showValues(int []numbers) {
		
		for(int values: numbers) {
			System.out.println(values);
		}
	}
	

}
