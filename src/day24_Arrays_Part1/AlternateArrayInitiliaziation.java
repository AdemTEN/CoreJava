package day24_Arrays_Part1;

public class AlternateArrayInitiliaziation {

	public static void main(String[] args) {
	
		int []myList = {10, 25, 34, 41, 59};
		
		String []myArray = {"Apple", "orange", "Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println(myList[4]);
		
		
		System.out.println(myArray[0]);
		System.out.println(myArray.length);
		System.out.println(myList.length);
		
		for ( int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i] );
		}
		
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] );
		}
		
		
	}

}
