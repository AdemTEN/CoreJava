package day14_Methods_Part2;

public class Task_69PrimeNumber {

	public static void main(String[] args) {
		
		int number = 2;
		
		if (isPrime(number)) {
			System.out.println(number + " is prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
		      
	
	}

	public static boolean isPrime(int number) {
		boolean isPrime= true;
		
		if (number == 0 || number == 1) {
			
			isPrime=false;
		}else {
			
			for(int i = 2; i<number; i++) {
				
				if (number % i == 0) {
					
					isPrime = false;
					
					break;
				}
			}
		}
		
		return isPrime;
	}
}
