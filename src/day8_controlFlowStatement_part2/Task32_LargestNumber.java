package day8_controlFlowStatement_part2;

public class Task32_LargestNumber {

	public static void main(String[] args) {

		int a = 5;
		int b = 8;
		int c = 8;
		
		if ((a>b) && (a>c)) {
			System.out.println("a is largest");
			
		}else if ((b>a) && (b>c)) {
			System.out.println("b is largest");
		}else if ((c>a) && (c>b)) {
		    System.out.println("c is largest");
		}else {
			System.out.println("numbers are equal");
		}
	}
}

