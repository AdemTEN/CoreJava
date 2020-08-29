package day31_ArrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
	
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("App");
		list1.add("May");
		
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1;
		System.out.println(list2.toString());
		list1.remove(0);
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");

		System.out.println(months.toString());
		
		System.out.println(months.contains("July"));
		//is Feb in second index?
		System.out.println(months.indexOf("Feb"));
		
		if(months.indexOf("Feb") == 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println(months.get(1).equals("Feb"));
		
		if(months.containsAll(list1)) {
			System.out.println("Months contains all list1");
		}else {
			System.out.println("Some values are missing");
		}
	}

}
