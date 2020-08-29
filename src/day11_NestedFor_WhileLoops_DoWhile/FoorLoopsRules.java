package day11_NestedFor_WhileLoops_DoWhile;

public class FoorLoopsRules {

	public static void main(String[] args) {

		int x = 0;
		
		for(long y=0, z=4;x<5 && y<10; x++, y++) {
			System.out.println(z);
			System.out.print(y+ " ");
		}
		System.out.println(x);
		
//		for(;;) {
//			System.out.println("hello");//Sonsuz döngü
//		}
		int i = 1;
		for (;i<=5;i++) {
			System.out.println(i);//i nin type belli degil
		}
		
		int a = 0;
		int b = 0 ;
		for (a= 3,b= 4;a<5&&b<5 ;a++, b++) { //==>FINE
			
		}
		
		int c = 1;
		for ( ;c<=5  ;c++ ) {
			System.out.println(i);//FINE
			
		}
		 for ( ; ;i++ ) {//INFINITIVE
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
