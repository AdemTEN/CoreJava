package day24_Arrays_Part1;

public class AvarageArrayWithLoop {

	public static void main(String[] args) {

		int []scores = {80, 85, 90, 100, 50, 68, 45, 75, 67,67,80, 85, 90, 100, 50, 68, 45, 75, 67,67};
		
		int sum = 0;
		for(int i = 0; i<scores.length;i++) {
			sum += scores[i];
		}
		
		System.out.println("Sum is: " + sum );
		System.out.println("The total element is: " + scores.length);
		double avaregeScore = sum / scores.length;
		System.out.println(avaregeScore);
	
		
	}

}
