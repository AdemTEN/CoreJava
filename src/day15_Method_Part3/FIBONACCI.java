package day15_Method_Part3;

public class FIBONACCI {

	public static void main(String[] args) {
		
		int number = 10;
		int x = 0;
		int y = 1;
		int z = 0;
		
	for (int i = 1 ; i <= number ; i++) {
		
		System.out.print(z+ ", ");
		z = x + y;
		x = y;
		y = z;
	}
	}
}
