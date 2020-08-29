package day25_Arrays_Part2;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] pruducts = { "Timberlad", "Shirt", "Watch", "Bag", "Shoes" };
		double[] prices = { 120.0, 12.99, 300, 25, 67.89 };

		for (String eachProducts : pruducts) {
			System.out.println(eachProducts);
		}
		
		for(double eachPrices : prices) {
			System.out.println(eachPrices);
			
		}
		System.out.println("------------------------");
		//print product in reverse order:
		for(int i= pruducts.length-1; i>=0;i--) {
			System.out.println(pruducts[i]);
		}
		
	}

}
