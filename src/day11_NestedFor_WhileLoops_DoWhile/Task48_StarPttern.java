package day11_NestedFor_WhileLoops_DoWhile;

public class Task48_StarPttern {

	public static void main(String[] args) {
		int rows = 7;
		
		for (int i = 1 ; i <= rows;i++) {

			for (int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
