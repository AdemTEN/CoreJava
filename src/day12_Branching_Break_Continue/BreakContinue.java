package day12_Branching_Break_Continue;

public class BreakContinue {

	public static void main(String[] args) {
		int i = 0;
		for ( i=1; i<=5;i++) {
			if(i==4) {
//				break;
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println(i);
		
		
		
		
		
	}

}
