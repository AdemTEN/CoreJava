package day13_Methods_Part1;

public class Task_59_PayInHour {

	public static void main(String[] args) {

		PayCalculator(8, 10.45);
		PayCalculator(40, 15);
	}

	public static void PayCalculator(double hour, double hourlyPay) {
		
		double payForHours = hour * hourlyPay ;
		System.out.println("The pay for hours: " + payForHours);
		
		
		
		
		
	}
}
