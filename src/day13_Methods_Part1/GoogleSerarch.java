package day13_Methods_Part1;

public class GoogleSerarch {

	
	
	public static void main(String[] args) {
		extracted();
		
	}

	public static void extracted() {
		for (int i = 0; i < 100; i++) {
			navigateGoogle();
			searchForShoes();
			printResults();
		}
	}

	public static void navigateGoogle() {

		System.out.println("launch chrome browser");
		System.out.println("navigate to google.com");
	}

	public static void searchForShoes() {

		System.out.println("type shoes into search field");
		System.out.println("click search botton");
	}

	public static void printResults() {

		System.out.println("result for shoes....");
		System.out.println();
	}

}
