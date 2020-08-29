package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {

		/*This program calculates the amount of pay that will be contributed to a retirement plan if 5%,
		 *  8% or 10% of monthly pay is withheld
		 */
		double amountOfPay = 6000.0;
		double discount1 = 0.05;
		double discount2 = 0.08;
		double discount3 = 0.1;
		
		double contributionPay = amountOfPay * discount1;
		double amountOfContributedPay1 = contributionPay + amountOfPay;
		System.out.println("If 5% : " + amountOfContributedPay1);
		
	    contributionPay = amountOfPay * discount2;
		double amountOfContributedPay2 = contributionPay + amountOfPay;
		System.out.println("if 8% : " + amountOfContributedPay2);
		
	    contributionPay = amountOfPay * discount3;
		double amountOfContributedPay3= contributionPay + amountOfPay;
		System.out.println("if 10%: " + amountOfContributedPay3);
		
		
	}

}
