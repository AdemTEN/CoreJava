package day13_Methods_Part1;

public class DeepandDeeper {

	public static void main(String[] args) {

		System.out.println("I am starting in main");
		deep();
		System.out.println("Now I am back in main");
		deep();
		deeper();
		deep();
	}
	
	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now I am back in deep");
	}

	public static void deeper() {
		System.out.println("I am in deeper");
	}
}
