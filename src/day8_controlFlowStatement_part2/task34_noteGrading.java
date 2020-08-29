package day8_controlFlowStatement_part2;

public class task34_noteGrading {

	public static void main(String[] args) {

		int note1 = 100;
		int note2 = 75;
		int note3 = 82;
		double average = (note1 + note2 + note3) / 3.0;
		System.out.println("average:" + average);
		if (average < 60) {
			System.out.println("F");
		}else if (average < 70) {
			System.out.println("D");
		}else if(average <80) {
			System.out.println("C");
		}else if (average <90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
		
		
		
		
	}

}
