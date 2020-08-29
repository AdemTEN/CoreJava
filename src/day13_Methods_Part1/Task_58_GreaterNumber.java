package day13_Methods_Part1;

public class Task_58_GreaterNumber {

	public static void main(String[] args) {

		greaterNumber();
		
	}
	
	public static void greaterNumber() {
		
		int num1 = 50;
		int num2 = 55;
		int result;
		
		if (num1>num2) {
			result = num1;
			
		}else {
			result = num2;
			
		}
		System.out.println("The greater number is:" + result);
	}

}
