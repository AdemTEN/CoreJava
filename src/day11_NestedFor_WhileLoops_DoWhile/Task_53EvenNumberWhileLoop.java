package day11_NestedFor_WhileLoops_DoWhile;

public class Task_53EvenNumberWhileLoop {

	public static void main(String[] args) {
		int sumEven = 0;
		int i = 0;
		while (i<100) {
			if (i%2 == 0 ) {
				sumEven += i;
				System.out.print(i+" ");
			}
			
			i++;
		}
		System.out.println();
		System.out.println(sumEven);
		
		sumEven = 0;
		i = 0;
		do {
			if (i%2 == 0) {
			sumEven += i;
			}
			i++;
		}while(i<100);
		System.out.println(sumEven);
	}

}
