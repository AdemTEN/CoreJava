package day10_TurnaryAndFORLoops;

public class SumOfOddAndEvenNumbers {

	public static void main(String[] args) {

		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1 ; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				sumEven += i;
			}else {
				System.out.println(" "+ i  );
				sumOdd += i;

			}
			
		}
		
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of odd numbe " + sumOdd);	
		
	}

}
