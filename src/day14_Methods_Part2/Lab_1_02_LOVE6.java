package day14_Methods_Part2;

public class Lab_1_02_LOVE6 {

	public static void main(String[] args) {

		 love6(7,5);
		 love6(4,5);
		 love6(1,5);
		 love6(6,12);
		 love6(2, 8);
		 
		 
		 
	}
	
	public static void love6(int num1, int num2) {
		int temp;
		if (num1<num2) {
			
			temp= num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 == 6 || num2 == 6 || (num1 + num2) == 6 || (num1 - num2) == 6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}
