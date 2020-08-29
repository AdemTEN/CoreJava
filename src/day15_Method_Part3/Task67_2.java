package day15_Method_Part3;

public class Task67_2 {

	public static void main(String[] args) {

		
		if (isLastDigit(15,7)) {
			System.out.println("The last digits are  same");
		}else {
			System.out.println("The last digits are diffferent");
		}
	}

	public static boolean isLastDigit (int num1, int num2) {
		
		if(num1%10 == num2%10) {
			return true;	
		
		}else {
			return false;
		}
		
	}
}
