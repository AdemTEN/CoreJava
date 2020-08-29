package day10_TurnaryAndFORLoops;

import javax.print.DocFlavor.STRING;

public class Task44_SpeedsInKilometer {

	public static void main(String[] args) {
		 final int STARTING_KPH = 60;
		 final int MAX_POINT = 130;
		 final int INCREAMENT = 10;
		
		System.out.println("KPH\t\t\tMPH");
		System.out.println("___________________________________");
		double mph= 0.0; 
		for (int kph = STARTING_KPH;kph<=MAX_POINT;kph +=INCREAMENT) {
			mph = kph * 0.6214;
			System.out.println(kph + "\t\t\t" + (int)(mph * 10)/ 10.0);
		}
		
		
		
		
		
	}

}
