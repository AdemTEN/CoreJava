package day13_Methods_Part1;

public class Task_60_CalculatorThreeParameters {

	public static void main(String[] args) {

		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");
	}

	public static void calculator(int number1 , int number2, String operator) {
		
		switch(operator) {
		
		case "+" : System.out.println(number1 + number2);break;
		
		case "-" : System.out.println(number1 - number2);break;
		
		case "*" : System.out.println(number1 * number2);break;
		
		case "/" : System.out.println(number1 / number2);break;
		
		default  : System.out.println("Invalid value:");break;
		
		
		}
		
		
	}
}
