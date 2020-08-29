package day27_Arrays_Part4_Lab;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String name = "I have a car";
		String[] nameArray = name.split("a");
		System.out.println(Arrays.toString(nameArray));
		String one = nameArray[0].substring(0,1);
		System.out.println(one);
	} 

}
