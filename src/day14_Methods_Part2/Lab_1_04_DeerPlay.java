package day14_Methods_Part2;

public class Lab_1_04_DeerPlay {

	public static void main(String[] args) {

		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);
		deerPlay(45, true);
	}

	public static void deerPlay(double temperature, boolean isSummer) {
		
		if ((60<= temperature && temperature<=90) || (isSummer == true && (60<= temperature && temperature <=100 ))){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
//		if(isSummer) {
//			if(60<=temperature && temperature<=100) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//		}else {
//			if (60<=temperature && temperature<=90) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//		}
		
		
	}
}
