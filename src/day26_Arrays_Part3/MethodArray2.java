package day26_Arrays_Part3;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {
	
		System.out.println(findCar(5, "Honda"));

	}
	public static String[] createCarArray(int arraySize) {
		
		
		String []carArray = new String[arraySize];
		
		extracted(carArray);
		return carArray;
		
	}
	public static void extracted(String[] carArray) {
		Scanner scan = new Scanner (System.in);
		for(int i = 0;i<carArray.length;i++) {
			System.out.print ("Enter your " + (i+1) + ". car:");
			carArray[i] = scan.next();
		}
	}
	public static boolean findCar(int number, String carName) {
		
		boolean flag = false;
		
		for (String cars : createCarArray(number)){
			if(cars.equalsIgnoreCase(carName)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			return true;
		}else {
			return false;
		}
		
	}

}
