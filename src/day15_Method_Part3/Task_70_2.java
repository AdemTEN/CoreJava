/* Create a method called displayHighScorePosition. It should have a players name as a
parameter, and a 2nd parameter as a position in the high score table. You should
display the players name along with a message like “managed to get into position”
and the position they got and a further message “on the high score table”
§ Create a 2nd method called calculateHighScorePosition. It should be sent one
argument only., the player score. It should return an int. The return data should be :
1 – if the score is >=1000
2 – if the core is >=500 and <1000
3- if the score is >=100 and <500
4- in all other cases
§ Call both methods and display the results of the following:
a score of 1500, 900, 400 and 50

*/

package day15_Method_Part3;

import java.util.Scanner;

public class Task_70_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the score: ");
		int score = scan.nextInt();
		
		displayHighScorePosition("Adem ", calculateHighScorePosition(score));
	}
	
	public static void displayHighScorePosition(String playerName, int position) {
		
		System.out.println(playerName +" managed to get in to position " + position + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if (score >= 1000) {
			return 1;
		}else if (500<=score && score<1000) {
			return 2;
		}else if (100<=score && score<500) {
			return 3;
		}else {
			return 4;
		}
	}

}
