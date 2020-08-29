package day14_Methods_Part2;

public class Lab_1_06_CigarParty {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
		
	}
	
	public static void cigarParty(int numberCigar, boolean isWeekend) {
		
		if (isWeekend) {
			if(numberCigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if (40<=numberCigar && numberCigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
		
		
		
		
		
//		if (40<=number && number<=60) {
//			
//				System.out.println(true);	
//			
//			
//		}else if (number>=40 && weekend){
//			
//			System.out.println(true);
//			
			
//		}else {
//			System.out.println(false);
//		}
		
		
		
	}

}
