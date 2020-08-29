package day6_logicalOperator;

public class logicalOpertor {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 65;
		int i1 = 5 ;
		int i2 = 10;
		
		boolean res1 = (i1 == i2) & (c2 == c2);//F & T = F 
		boolean res2= (i1 == i2) && (c2 == c2);//F && ===> F first one is F dont care aboout the second.
		System.out.println("res1= " + res1);
		System.out.println("res2= " + res2);
		
		boolean res3 = (c1 == c2 )| (i1 == i2); // T | F = T
		boolean res4 = (c1 == c2 )|| (i1 == i2);// T ||  ====> T first one is true the result is true
		System.out.println("res3= " + res3);
		System.out.println("res4= " + res4);
		
		boolean res5 = (c1 == c2)^(i1 ==i2);//True
		System.out.println("res5= " + res5);
		
		boolean res6 = (c1 == c2)^(i1 !=i2);//false
		System.out.println("res6= " + res6);
		
		
		
		
		
		
		
		
		
		
		
	}

}
