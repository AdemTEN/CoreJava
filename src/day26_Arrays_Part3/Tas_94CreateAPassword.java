package day26_Arrays_Part3;

public class Tas_94CreateAPassword {

	public static void main(String[] args) {

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with " + 
				"anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with " +
				"anyone";
		
		String[] array1 = info1.split("xxx");
	
		
		String[]array2 = info2.split("xxx");
	
		
		System.out.println(array1[1].concat(array2[1]));
	}

}
