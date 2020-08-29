package day13_Methods_Part1;

import java.util.Scanner;

public class Task_63_FahrenheitToCelcius {

	public static void main(String[] args) {

		fahrenheitToCelcius(50);
	}

	public static void fahrenheitToCelcius(double fahrenheit ) {
		
		double celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println(fahrenheit + " fahrenheit is "+ celcius + " celcius. ");
		
	}
}
