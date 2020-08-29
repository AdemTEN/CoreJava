package day5_unary_assignment_relation_operators;

public class mixedInteger {

	public static void main(String[] args) {

		int i1 = 5 ;
		int i2 = 10;
		float f1 = 15.5F;
		double d1 = 20.5;
		
	    int res1 = i1 + i2; 
		float res2 = i1 + f1; // result is bigger one ==> int + float = float
		System.out.println(res2);
		
		double res3 = i2 + d1;// int + double = double ==>bigger one
		
		short firstNumber = 10;
		short secondNumber = 20;
		int thirdNumber = firstNumber + secondNumber;
		// OR
		short thirdNumber2 = (short)(firstNumber + secondNumber);
		
		
		byte b1 = 20;
		byte b2 = 2 ;
		byte b3 = (byte)(b1 * b2);
		//OR
		int  b4 = b1 *b2;
		
		int x = 126;
		int y = 1;
		byte z = (byte)(b1 + b2);//Explicit Casting (Narrowing ) is required ama 5 koysarsam 1 yerine  data kaybi
        System.out.println(z);
		byte a = 126  + 1;// 1 yerine 2 koysam out of limit 128 i gecemez byte..
		
		
		
		
		
		
		
		
		
		
	}

}
