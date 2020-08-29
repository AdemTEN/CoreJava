package day23_RandomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random rn = new Random();
		System.out.println(rn.nextInt(100)+10);
		int random = rn.nextInt(50)-50;
		System.out.println(random);
		double random2 = rn.nextDouble();
		System.out.println(random2);
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));
		System.out.println(rn.nextInt(10)+5);
		
		
	}

}
