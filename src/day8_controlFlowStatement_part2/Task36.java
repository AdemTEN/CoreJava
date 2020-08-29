package day8_controlFlowStatement_part2;

public class Task36 {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		String operator = "*";
		int result= 0;
		
		switch(operator) {
		 case "+" : 
			 System.out.println(result=a+b);
		 	 break;
		 case "-" :
			 System.out.println(result=a-b);
			 break;
		 case "*":
			 System.out.println(result=a*b);
			 break;
		 case "/":
			 System.out.println(result=a/b);
			 break;
			 
		 default :
			 System.out.println("invalid operator");break;
		}
		System.out.println("Result is:" + result );
	}

}
