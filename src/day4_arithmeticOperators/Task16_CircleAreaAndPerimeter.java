package day4_arithmeticOperators;

public class Task16_CircleAreaAndPerimeter {

	public static void main(String[] args) {

		double radius = 20;
		final double PI = 3.14;
		double perimeter = 2 * radius * PI;
		double area = radius * radius * PI;
		
		System.out.println("Perimeter of the Circle = " + perimeter);
		System.out.println("Area of  the Circle = "+ area);
	}

}
