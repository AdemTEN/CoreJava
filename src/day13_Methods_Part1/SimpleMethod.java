package day13_Methods_Part1;

public class SimpleMethod {

	public static void main(String[] args) {
		
		System.out.println("Hello from main Method");
		displayMessage();
		System.out.println("Back in the main Method");
		
	}

	public static void displayMessage() {
		
		System.out.println("Hello from the method");
	}
}
