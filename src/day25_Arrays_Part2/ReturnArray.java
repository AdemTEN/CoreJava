package day25_Arrays_Part2;

public class ReturnArray {

	public static void main(String[] args) {

		double[] values;

		values = getArray();

		for (double numbers : values) {

			System.out.println(numbers);

		}
	}

	public static double[] getArray() {

		double[] array = { 1.0, 2.5, 3.4, 4, 5, 6, 7 };

		return array;
	}

}
