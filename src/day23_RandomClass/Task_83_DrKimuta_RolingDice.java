package day23_RandomClass;

import java.util.*;



public class Task_83_DrKimuta_RolingDice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
	
		String YesOrNo;

		do {
			int dice1 = rn.nextInt(6)+1;
			int dice2 = rn.nextInt(6)+1;
			System.out.println("rolling the dice...");
			System.out.println("Their values are: " + dice1 + " and " + dice2);
			System.out.print("Roll them again?(y=yes - n=No):");
			YesOrNo = scan.next();
		}while(YesOrNo.equalsIgnoreCase("y"));
			
			System.out.println("Rolling dice is finished");
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
