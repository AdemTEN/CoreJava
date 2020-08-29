package day14_Methods_Part2;

public class Lab_1_03_SpecialEleven {

	public static void main(String[] args) {

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(1);
	}

	public static void specialEleven(int number) {
		boolean kontrol = true;
		if (number%11 == 0 || (number)%11 == 1 || (number-1)%11 ==0) {
			System.out.println(kontrol);
		}else {
			System.out.println(!kontrol);
		}
	}
	
}
