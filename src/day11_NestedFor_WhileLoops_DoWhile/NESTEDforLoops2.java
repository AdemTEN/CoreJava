package day11_NestedFor_WhileLoops_DoWhile;

public class NESTEDforLoops2 {

	public static void main(String[] args) {
		
		for (int i=0  ; i<3; i++) {
			System.out.println("Outer Loop at state: " + i);
			
			for (int p=0; p <=3; p++) {
				System.out.println("Inner loop at state: " + p);
				
				if(p == 3) {
					System.out.println();
				}
			}
		}

		
	}

}
