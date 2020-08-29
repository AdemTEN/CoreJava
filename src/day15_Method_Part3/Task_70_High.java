package day15_Method_Part3;

public class Task_70_High {
	
	public static void main(String[] args) {
		
		int x = highScorePosition(900);
		displayHighScorePosition("Haci", x);
		displayHighScorePosition("Adem", highScorePosition(1500));
	}

	public static void displayHighScorePosition(String playersName, int scorePosition ) {
		
		System.out.println(playersName + " managed to get into position " +scorePosition 
				+ " on the high score table");
		
	}
	
	public static int highScorePosition( int score) {

		if (score>=1000) {
			return 1;
		}else if(500<=score && score<1000) {
			return 2;
		}else if(100<=score && score<500) {
			return 3;
		}else {
			return 4;
			
		}
	}
}
