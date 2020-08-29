package day31_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() ==0);
		
		nums.add(4);
		nums.add(45);
		nums.add(1);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		System.out.println(nums.remove(5));
		System.out.println(nums.toString());
		
		int remove5 = nums.indexOf(5);
		System.out.println(remove5);
		nums.remove(3);
		System.out.println(nums.toString());
		nums.remove(nums.indexOf(55));
		System.out.println(nums.toString());
		
		
		//to remove object 4 in ArrayList
		
		Integer n1 = new Integer("4");
		Integer n2 = Integer.valueOf(4);
		
		nums.remove(n1);
		System.out.println(nums.toString());
		
		nums.remove(new Integer(45));
		System.out.println(nums.toString());
		
		
		
		
		
	}

}
