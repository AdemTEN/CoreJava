package day10_TurnaryAndFORLoops;

import java.util.Scanner;

public class Task45_LargessNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		
		for (int i = 0  ; i< 10; i++ ) {
			 if ( n1 < n2) {
				 System.out.println(n2 + "is largest");
				 
			 }else if(n1 == n2) {
				 System.out.println(n1 + "and" + n2 + "is equal");
			 }else {
				 System.out.println(n1 + "is largest");
			 }
		}
		    
 		
		
		
		
		
		
		
		
		
	}

}
