package day13_Methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {

		showSum(12 , 10.5);
		showSum(22 , 75);
		showSum(33 , 46.343455);
		showSum(45 , 55.6643);
		
	}

	public static void showSum(int num1 , double num2) {
		double sum;
		sum = num1+ num2;
		System.out.println("The sum is: " + sum);
		
		
	}
}
