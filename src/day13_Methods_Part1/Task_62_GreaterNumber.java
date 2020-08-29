package day13_Methods_Part1;

public class Task_62_GreaterNumber {

	public static void main(String[] args) {

		greaterNumber(9, 8, 9);
	}

	public static void greaterNumber(int num1, int num2, int num3) {
		
		if (num1 > num2) {
			if(num1 > num3) {
				System.out.println( "num1 is greater.");
			}
		}else if(num2>num3) {
			System.out.println("num2 is greater");
		}else if(num3>num2){
			System.out.println("num3 is greater");
		}else {
			System.out.println("The numbers are equal");
		}
	}
}
