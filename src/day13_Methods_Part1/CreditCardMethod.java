package day13_Methods_Part1;

public class CreditCardMethod {

	public static void main(String[] args) {

		double salary = 50000;
		int creditRating = 5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}
		
	}

	private static void noQualify() {
		System.out.println("Im sorry you are not qualfied for the CC");
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified CC");
		
	}

}
