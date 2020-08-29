package day13_Methods_Part1;

public class PassArgument {

	public static void main(String[] args) {
		double x = 10.45;
		displayValue(10);
		displayValue((int)(x));
		displayValue((int)(x * 4));
		displayValue();
		
		login("Acer Notebook");

	}
	
	public static void displayValue(int num) {
		
		System.out.println("The value is num:" + num);
		System.out.println("The result is : " + num * 2);
	}

	public static void displayValue() {
		System.out.println("the value is 10.");
	}
	
	public static void login(String browser) {
		System.out.println(browser);
	}
}
