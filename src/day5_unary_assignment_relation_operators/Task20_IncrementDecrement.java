package day5_unary_assignment_relation_operators;

public class Task20_IncrementDecrement {

	public static void main(String[] args) {

		int a = 1;
		int result = -a-- + a++ / -a-- * --a;
		//a in memory : 1 --> 0 -->1 --> 0 --> -1
		
		//result : -1 + 0 / -1 * -1
		System.out.println(result);
		System.out.println(a);
		
		
		
		
		
		
	}

}
