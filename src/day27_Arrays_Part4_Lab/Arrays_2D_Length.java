package day27_Arrays_Part4_Lab;

public class Arrays_2D_Length {

	public static void main(String[] args) {

		int [][] numbers = {
				{1,2,3,4},           // row-0
				{5,6}, 				 //row-1
				{4,7,8,9,11,24,35}   //row-2
		};	
		
    //		display the number of rows and columns
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		System.out.println("---------------------------------------");
		
		for (int i = 0; i<numbers.length; i++) {
			
			System.out.println("The number of columns in row: " + i + " is " + numbers[i].length);
		}
		
		System.out.println("---------------------------------------");
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]+", ");
			}
			System.out.println();
		}
		
		}
		
	}


