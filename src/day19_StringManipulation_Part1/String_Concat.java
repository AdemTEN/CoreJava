package day19_StringManipulation_Part1;

public class String_Concat {

	public static void main(String[] args) {

		String word = "Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		System.out.println(word);
		word = word.concat("+eclipse");
		System.out.println(word);
		
		word = word.concat(" Automation");
		System.out.println(word);
		
		//word = word.concat(123)this will not work. concat execute only string
		
		//but
		word = word + 123;
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);
		word = word.concat("hey").concat("How are you").concat(" good");
		System.out.println(word);
		word = "java";
		System.out.println(word);
	
	}

}
