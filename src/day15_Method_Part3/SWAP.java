package day15_Method_Part3;

public class SWAP {
	
	public static void main(String[] args) {
		// 1. SOLUTION:
		int n1 = 10;
		int n2 = 20;
	    int n3; 
	    
	    n3 = n1;
	    n1 = n2;
	    n2 = n3;
	
	    // 2.SOLUTION:without using a third variable
	    
	    n1 = n1 + n2;
	    n2 = n1 - n2;
	    n1 = n1 - n2;
	
	
	
	
	}
	
	
	
	

}
