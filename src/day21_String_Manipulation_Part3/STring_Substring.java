package day21_String_Manipulation_Part3;

public class STring_Substring {

	public static void main(String[] args) {

		
		String sentence = "Java String Manipulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));//5,27==>27 is not include
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		String newWord = chars.substring(0,2).concat(word).concat(chars.substring(2));
		System.out.println(newWord);
		System.out.println(word.toLowerCase());
		 
	}

}
