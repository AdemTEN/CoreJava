package day4_arithmeticOperators;

public class additionAndConcat {

	public static void main (String [] args) {
		
		//number + number = addition
		System.out.println(2 + 2);
		
		//number + string = concatenation
		System.out.println(5 + " hello");
		
		//String + Boolean = concatenation
		System.out.println("hello " + true);
		
		// String + String = concatenation
		System.out.println("hello " + " World");
		
		//boolean + Number ==> ERROR
		
		System.out.println((2 + 0 + 3 + "Cybertek"));
		System.out.println("Cybertek" + 2+0+5);
		//Cybertek + 2=Cybertek2, Cybertek2 + 0 =Cybertek20 , Cybertek20 + 5=Cybertek205==>string + number = String
		System.out.println(2+0+5 +"Cybertek" + 2+0+5);
		System.out.println(2+0+5 +"Cybertek" + (2+0+1));
		
		System.out.println(2 + 3 + 4 +"Cybertek" + 3  );
		
		
		

		
		
		
		
		
		
		
	}
}
