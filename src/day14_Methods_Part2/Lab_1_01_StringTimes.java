package day14_Methods_Part2;

public class Lab_1_01_StringTimes {

	public static void main(String[] args) {

	stringTimes("Hi", 4);	
	stringTimes("Hi" ,2);
	stringTimes("Hi", 1);
	}

	
	public static void stringTimes(String hello, int number) {
//		String str = "";
		for(int i = 1; i<=number;i++) {
//			str = str + hello;
			System.out.print(hello);
		}
		System.out.println();
	}
}
