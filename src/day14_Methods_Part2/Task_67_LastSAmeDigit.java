package day14_Methods_Part2;

public class Task_67_LastSAmeDigit {

	public static void main(String[] args) {

		boolean isLastDigit1 = lasDigit(7, 17);
		if (isLastDigit1) {
			System.out.println("The last digits are same");
		}else {
			System.out.println("The last digits are not same");
		}
		boolean isLastDigit2 = lasDigit(6, 17);
		boolean isLastDigit3 = lasDigit(3, 113);
		System.out.println(lasDigit(16, 236));
		
		
	}

	public static boolean lasDigit(int num1, int num2) {
		boolean digit = true;
		if(num1%10 == num2%10) {
			System.out.println(digit);
		}else {
			System.out.println(!digit);
		}
		return digit;
		
		
	}
}
