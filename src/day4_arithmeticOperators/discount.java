package day4_arithmeticOperators;

public class discount {

	public static void main(String[] args) {

		//this program calculates the sale price of an
		// item that is regulary priced at $59, with a 20% discount on it
		
		double regularPrice = 59;
		double discount; 
		double salesPrice;
		
		discount = 20 / 100.0;
		double discountPrice = regularPrice * discount;
		salesPrice = regularPrice - discountPrice;
		System.out.println("Regular Price = $ " +regularPrice);
		System.out.println("Discount Amount = $ " + discountPrice);
		System.out.println("Sales Price of the Pruduct is = $ " + salesPrice);
		
		
		
		
	}

}
