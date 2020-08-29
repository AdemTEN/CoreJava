package day11_NestedFor_WhileLoops_DoWhile;

public class NESTEDForLoops {

	public static void main(String[] args) {
			int i =0;
			int j = 0;
		for ( i=1; i<=5 ; i++) {
			
			System.out.println("Outer loop itertion"+ i);
			
			for (j=1; j<=2;j++) {
			
				System.out.println("i=" + i + " ; j= " + j);
				
				
			}
		}
		
		System.out.println(i);
	System.out.println(j);
	}

}
