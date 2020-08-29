package day5_unary_assignment_relation_operators;

public class typeCasting {

	public static void main(String[] args) {

		byte b;
		int i = 81;
		double d = 323.142;
		float f = 72.38F;
		char c = 'A';

		c = (char)i;
		System.out.println("i = " + i + " c = " + c);
		
		i = (int)d;
		System.out.println("d = " + d + " i = " + i);//Explicit ==> lost data
		
		i = (int)f;
		System.out.println("f = " + f + " i = " + i);//Explicit == lost data 
		
		b = (byte)d;
		System.out.println("d = " + d + " i = " + b);//Explicit == lost data
		
		short n1 = 2;
		short n2 = 3;
		short n3 = (short)(n1 + n2);//int + int = Int ==>  day_4_slayt 25
		System.out.println(n3);
		
		
		
		
		
	}

}
