package day27_Arrays_Part4_Lab;

public class Task_95_StudentsScores {

	public static void main(String[] args) {

		int[][] scores = { 
				{ 68, 75, 54, 80 }, 
				{ 100, 64, 20, 50 }, 
				{ 10, 35, 40, 90 } 
				};
		
		double averageOfStudent1 = 0;
		int sum = 0;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < scores[i].length; j++) {

				sum += scores[i][j];
			}
			averageOfStudent1 = sum / scores[i].length;
		}
		System.out.println("Average Score of Student 1 is : " + averageOfStudent1);
		System.out.println();
		System.out.println("######### CALCULATE MATH SCORES ######");

		int sumOfMathScores = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < 1; j++) {
				sumOfMathScores += scores[i][j];
			}
		}
		System.out.println("Sum of the Math Scores is: " + sumOfMathScores);

		System.out.println("###### FOR EACH LOOP ######");
		
		int avgOfstdnt1 = 0;
		int sumOfstdnt1 = 0;
		for(int values : scores[0]) {
			 sumOfstdnt1 += values;
		}
		avgOfstdnt1 = sumOfstdnt1 / 4;
		System.out.println(avgOfstdnt1);
	}

}
