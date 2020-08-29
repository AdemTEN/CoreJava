package day13_Methods_Part1;

public class Task_64_StarPattern {

	public static void main(String[] args) {

		starPattern(100);
		
	}
	
	public static void starPattern(int row) {
		
		for (int i = 1; i<=row; i++) {
			
			for(int j = 1; j<=i ;j++  ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
