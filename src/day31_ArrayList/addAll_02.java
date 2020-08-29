package day31_ArrayList;

import java.util.ArrayList;

public class addAll_02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums1 = new ArrayList<>();
		
		nums1.add(1);
		nums1.add(3);
		nums1.add(5);
		nums1.add(4);
		
		ArrayList<Integer> nums2 = new ArrayList<>(nums1);
		
		nums2.add(25);
		nums2.add(15);
		nums2.add(35);
		nums2.add(58);
		
		nums2.addAll(nums1);
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		nums1 = nums2;
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		nums2.set(nums2.size()-1, 1000);
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		System.out.println(nums1==nums2);
		nums2.addAll(nums1);
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		nums2.remove(nums2.indexOf(1));
		System.out.println(nums2.toString());
		
		System.out.println(nums2.containsAll(nums1));
		System.out.println(nums2.isEmpty());
		System.out.println(nums2.equals(nums1));
		
		
	}

}
