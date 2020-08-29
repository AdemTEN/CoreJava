package day6_logicalOperator;

public class task_logicalOperator2 {

	public static void main(String[] args) {

		String outside= "Shinny";
		int degree =70 ;
		boolean comp = (!(outside == "Rainny" || degree == 70));
		System.out.println(comp);
		
		System.out.println("***************************");
		int b = 2;
		boolean res = ++b == 2|| --b ==2 && --b ==2;
					  // 3==2 ||   2 == 2 &&  1 == 2
					  //   F  ||      T   &&     F
		              //   F  ||          F
					 //			res = F
		System.out.println(res);	
		System.out.println("***************************");
		boolean x = true, z = true;
		int y = 20;
		x = (y!=10)||(z=false);
		System.out.println(x);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
