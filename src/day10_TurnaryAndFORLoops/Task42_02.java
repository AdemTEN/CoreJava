package day10_TurnaryAndFORLoops;

public class Task42_02 {

	public static void main(String[] args) {

		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i<100 ; i++) {
			if (i%2 == 0 ) {
				sumEven += i;
				System.out.print(i+ "    ");
			}else {
				sumOdd += i;
				System.out.println(i+" ");
			}
				
		}
		System.out.print(sumEven);
		System.out.print("  " + sumOdd);
		

	}

}
