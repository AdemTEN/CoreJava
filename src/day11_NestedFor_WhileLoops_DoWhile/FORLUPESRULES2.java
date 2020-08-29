package day11_NestedFor_WhileLoops_DoWhile;

public class FORLUPESRULES2 {

	public static void main(String[] args) {
////
////		for ( ; ;i++ ) {//Not compile i is not declared a variable
////			System.out.println(i);
////	}
////		
////		for (;a<=5;) {// a is not declared as a variable
////			System.out.println(a);
////		}
//		
		int x =0;
//		for ( ; ; x++) {//INFINITIVE THERE IS NO CONDITIOIN:
//			System.out.println(x);
//		}
		for( ;x<5 ; ) {//UNREACHABLE CODE CONDITIOIN IS SAME==INFINITIVE
		System.out.println(x);	
		}
	}
}