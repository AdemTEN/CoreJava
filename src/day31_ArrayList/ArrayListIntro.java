package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
	
		ArrayList<Integer> nums = new ArrayList<>();
		//Assigning values to arrayList
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Marry");
		
		nums.add(99);
		nums.add(45);
		nums.add(50);
		nums.add(new Integer("55"));
		
		// Reading values from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count:" + names.size());
		System.out.println("Nums count:" + nums.size());
		
		for(String each : names) {
			System.out.println(each);
		}
		System.out.println("-------------------");
		for(int i=0 ; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names.toString());
		System.out.println(nums.toString());
		
		String s = names.get(2);
		System.out.println(s);
	}
		
}
