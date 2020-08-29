package day10_TurnaryAndFORLoops;

public class Task42_SumOfOddAndEvenNumbers {

	public static void main(String[] args) {
		int sumOfEven = 0;
		System.out.print("The sum of even numbers are: ");
		for (int i = 1; i < 100; i++ ) {
			if(i % 2 == 0) {
				sumOfEven += i;
			System.out.print(i + "+" );
      		}
		}
			System.out.println("=" +sumOfEven);
			int sumOdd = 0;
			System.out.print("The sum of odd numbers are: ");
		for (int i = 1 ;i<100;i ++) {
			if(i % 2 != 0) {
				sumOdd += i;
				System.out.print(i + "+");
			}
		}
		System.out.println("=" + sumOdd);

	}	

}
