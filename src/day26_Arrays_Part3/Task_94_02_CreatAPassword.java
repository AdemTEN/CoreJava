package day26_Arrays_Part3;

import java.util.Arrays;

public class Task_94_02_CreatAPassword {
	
	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with " +
				"anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with " +
				"anyone";
		
		String [] array1 = info1.split("password :");
		String [] array2 = info2.split("password :");
 		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		String pass1 = array1[1].split(". Please")[0];
		String pass2 = array2[1].split(". Please")[0];
		
		pass1 = pass1.substring(4, pass1.length()-4);
		pass2 = pass2.substring(4, pass2.length()-4);
		
		System.out.println("Password: " + pass1.trim().concat(pass2.trim()));
		
		
		
		
		
	}

}
