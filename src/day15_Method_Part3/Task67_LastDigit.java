package day15_Method_Part3;

public class Task67_LastDigit {

	public static void main(String[] args) {

		 boolean lastdigit = sameLastDigit(3, 1113);
		if (lastdigit) {
			System.out.println("The last two digit is same ");
		}else {
			System.out.println("The last digits are difference");
		}
	}

	public static boolean sameLastDigit(int num1, int num2) {
		
		if (num1%10 == num2%10) {
			return true;
		}else {
			return false;
		}
		
	}
}
