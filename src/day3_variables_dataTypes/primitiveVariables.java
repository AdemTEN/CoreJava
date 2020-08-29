package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128; => out of range
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 5000;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;// it is for easy to read.
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		long l1 = 5000; // suffix L is optional . 5000 literal is range of integer
		long l2 = -2147483649L; // computer understands it int. suffix L is mandatory, this number is out of  int range 
		long creditCardNumber = 5485_3434_4564_6566L;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		float f1 = 2.1F; // float numbers default is double
		
		double PI = 3.1425555455526555646464;
		
		System.out.println("f1 = " + f1);
		System.out.println("Pi = " + PI);
		
		char c1 = 'A';
		char c2 = 65;// decimal value corresponding to character 'A'
		char c3 = '\u0041';// uni Code table
		char c4 = '\u0063';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		char c5 = 8865;
		
		System.out.println(c5);
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam: " + status);
		System.out.println("He is 16, can he take driving licence? :" + status2);
		
		
		String name = "Adem TEN";
		String age = "38";
		System.out.println("My name is = " + name);
		System.out.println("My age is = " + age);
		
		char al1 = '\u0028';
		System.out.println(al1);
		
		
		
		
		
		
		
		

	}

}
