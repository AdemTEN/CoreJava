package day19_StringManipulation_Part1;

public class Tas_79_VowelinString {

	public static void main(String[] args) {

		String word = "CybertekSchoosdflhghdeuo";
//		char a = 'a';
//		char e = 'e';
//		char o = 'c';
//		char i = 'i';
//		char u = 'u';
		
		for(int i= 0; i<word.length(); i++) {
			char letter = word.charAt(i);
			if(letter=='a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u' ) {
			
				System.out.print(letter );
				if(i != word.length()-2){
					System.out.print(",");	
				}
				
				
			}
			
		}
	}

}
