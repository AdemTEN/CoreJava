package day19_StringManipulation_Part1;

public class String_CharAt {

	public static void main(String[] args) {

		String word = "Computer";
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
//		System.out.println(word.charAt(8));
		
		String word2 = "Apple";
		if(word2.charAt(0) == 'A') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String word3 = "civic";
		if (word3.charAt(0) == word3.charAt(word3.length() -1 )) {
			System.out.println("First and last character are same");
		}else {
			System.out.println("Firs and last character are not same");
		}
		
		
		
		char lastChar = word3.charAt(word3.length()-1);
		System.out.println(lastChar);
		
		System.out.println("Last character of" +word3 + "is: " + lastChar );
		
		
		
		
	}

}
