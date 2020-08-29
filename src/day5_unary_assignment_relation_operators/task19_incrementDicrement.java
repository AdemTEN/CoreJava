package day5_unary_assignment_relation_operators;

public class task19_incrementDicrement {

	public static void main(String[] args) {

		int a = 50;
		a = --a + a++ +a-- +a++;
		// a in memory :50-->49-->50-->49-->50
		
		// result : 49 + 49+ 50 +49
		
		System.out.println(a);
		//System.out.println(result);
	}

}
