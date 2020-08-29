package day24_Arrays_Part1;

public class FindAvarage {

	public static void main(String[] args) {
		
		int[] score ;
		score = new int[5];
		
		score[0] = 85;
		score[1] = 70;
		score[2] = 95;
		score[3] = 90;
		score[4] = 100;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int avarageScore = (score[0] + score[1] + score[2] + score[3]+ score[4]) / 5 ;
		System.out.println("Average:" + avarageScore);
	}

}
