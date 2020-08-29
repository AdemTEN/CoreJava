package day32ArrayList_Part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);
		System.out.println();

		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);

		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> randomList = getRandomList(20);
		System.out.println(randomList.toString());
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted = convertedToIntList(strNums);
		System.out.println(converted.toString());
		
		
		
	}

	public static void printList(ArrayList<Integer> nums) {

		for (Integer num : nums) {
			System.out.print(num + " ");
		}
	}
	
	public static double sumList(ArrayList<Double> prices) {
		
		double sum = 0;
		for(int i=0; i<prices.size();i++) {
		sum += prices.get(i);
		}
//		for(Double price : prices ) {
//			sum += price;
//		}
		return sum;
	}
	
	public static ArrayList<Integer> getList(int number ) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i<number; i++) {
			list.add(i+1);
		}
		return list;
		
	}
	
	public static ArrayList<Integer> getRandomList(int size){
		
		ArrayList<Integer> randomList = new ArrayList<>();
		Random rn = new Random();
		
		for(int i = 1; i<=size;i++) {
			randomList.add(rn.nextInt(100)+1);
		}
		
		return randomList;
	}
	
	public static ArrayList<Integer> convertedToIntList(ArrayList<String> strnums){
		
		ArrayList<Integer> converted = new ArrayList<>();
		
		for(int i=0;i<strnums.size();i++) {
			converted.add(Integer.parseInt(strnums.get(i)));
			
		}
		
		return converted;
	}

}
