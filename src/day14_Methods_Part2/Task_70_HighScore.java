package day14_Methods_Part2;

public class Task_70_HighScore {

	public static void main(String[] args) {

		int score = calculateHighScorePosition(50);
		String playerName = " Adem managed to get in to position " ;
		String position = " on the high score table ";
		displayHighScorePosition(playerName, position);
		System.out.println(playerName + score + position);
	    System.out.println(playerName + calculateHighScorePosition(400) + position);
		
	}
	public static void displayHighScorePosition(String playerName , String table) {
		
		
	}
	public static int calculateHighScorePosition(int score) {
		
	
		if (score >= 1000) {
			return  1;
		}else if (500 <= score && score < 1000){
			return  2;
		}else if(100 <= score && score <500){
			return  3;
		}else {
			return  4;
		}
		
		
	}
	
}
