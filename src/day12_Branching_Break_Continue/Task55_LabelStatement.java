package day12_Branching_Break_Continue;

public class Task55_LabelStatement {

	public static void main(String[] args) {

		int i = 0;
		ozzy:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break ozzy;//INFINITIVE
//							break ozzy;//buraya ozzy yazmasaydik sadece ilk while blogundan cikrdik. label yaparak outer 
							// hangi bloga aitse o bloktan cikar.
						}
					}
			}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
