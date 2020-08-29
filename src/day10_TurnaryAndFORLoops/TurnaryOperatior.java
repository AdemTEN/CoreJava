package day10_TurnaryAndFORLoops;

public class TurnaryOperatior {

	public static void main(String[] args) {

		String result;
		int score = 88;
//		if (score > 60) {
//			result = "pass";
//		}else {
//			result = "fail";
//		}
		
		
		result = (score > 60) ? "pass" : "fail";
		System.out.println(result);
		
		
		int x = 5;
		System.out.println(x > 2 ? x > 4 ? x < 10 ? 66 : 8 : 7: 6 ) ;
		
		if (x>2) {
			if(x>4) {
				System.out.println(12);
				if(x < 10) {
					System.out.println(66);
				}else {
					System.out.println(8);
				}
			
			}else {
				System.out.println(7);
			}
		}else {
			System.out.println(6);
		}
		
		
		
		
		
		
		
		
		
	}

}
