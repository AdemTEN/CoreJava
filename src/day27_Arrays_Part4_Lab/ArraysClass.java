package day27_Arrays_Part4_Lab;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		//toString()
		
		int[] nums = {43,223,45,656,55};
		System.out.println(Arrays.toString(nums));
		
		//equals()
		int[] nums1 = {24,45,56,76,7,78};
		int[] nums2 = {24,45,56,76,7,78};
		System.out.println(Arrays.equals(nums1, nums2));
		
		// sort() : sort array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"Zulu", "Spanish", "Italian", "1Polish", "arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		//binarySearch();  give index number of the speciall element
		int [] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7));
		System.out.println(Arrays.binarySearch(numX, 55));
		System.out.println(Arrays.binarySearch(numX, 5)); // -2 ==> (- (insertionPointindex)-1
		System.out.println(Arrays.binarySearch(numX, 15));
		
		//CopyOf()
		
		double [] d1 = {2.3, 4.5, 12.4};
		double [] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 25.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		//double[] d3 = Arrays.copyOf(d2, d2.length);
		double[] d3 = Arrays.copyOf(d2, 5);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.3;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
	}

}
