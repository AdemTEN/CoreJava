package day7_ControlFlowStatements;

public class Task28 {

	public static void main(String[] args) {
		
	    double price = 100;
	    double quantity =15;
	    
		double revenue = price * quantity ;
	    double discount = 0 ;
	    
	    
		if (revenue > 5000) {
	    
			discount = revenue * 0.1;    
			revenue = revenue -discount ; 
		}
		System.out.println("Netrevenue is :" + revenue); 
		
		System.out.println("discount is: " + discount);
	}
	

}
