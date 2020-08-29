package day14_Methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {

		sum(3,4);
		System.out.println(sum(3,4));
		//OR
		int x = sum(3,4);
		System.out.println(x);
	}
	
	public static int sum(int num1, int num2) {
		        //void
		int result = num1 + num2;
		System.out.println(result);
		return result;
		
	}

}
