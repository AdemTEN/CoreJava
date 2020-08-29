package day23_RandomClass;

import java.util.Random;

public class Task_84_CoinToss {

	public static void main(String[] args) {

		Random rn = new Random();
		int random;
		for (int i = 1;i <=10; i++) {
			random = rn.nextInt(2);
			if(random == 0) {
				System.out.println(i+" Heads");
			}else {
				System.out.println(i+" Tails");
			}
			
		}
		
	}

}
