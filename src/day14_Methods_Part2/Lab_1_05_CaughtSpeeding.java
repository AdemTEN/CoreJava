package day14_Methods_Part2;

public class Lab_1_05_CaughtSpeeding {

	public static void main(String[] args) {

		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		caughtSpeeding(86, true);
	}
	
	public static void caughtSpeeding(int speed, boolean birthday) {
		int result;
		if (birthday) {
			
			if(speed<= 65) {
				result = 0 ;
			}else if(66<=speed && speed <=85) {
				result = 1;
			}else {
				result = 2;
			}
		}else {
			if (speed<=60) {
				result = 0;
			}else if(61<=speed && speed <= 80 ) {
				result = 1;
			}else {
				result = 2;
			}
		}
		System.out.println("Result: " + result);
	}

}
