package day26_Arrays_Part3;

public class StringManipulation_Arrays {

	public static void main(String[] args) {
	
		String [] myCars = {"Honda", "Mercedes", "BMW", "Toyota", " Ford  and Honda  "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2, 3));
		System.out.println(myCars[2].equalsIgnoreCase(myCars[3]));
		System.out.println(myCars[4]==myCars[2]);
		System.out.println("-------------------------------");
	
		for(int i=0; i<myCars.length;i++) {
			System.out.println((i+1) + ". car has " + myCars[i].length()+ " chars");
		}
		
		for(int i=0 ;i<myCars[0].length();i++) {
			System.out.println(myCars[0].charAt(i));
		}
		
		
	}

}
