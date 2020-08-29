package day20_StringManipualtion_Part_2;

public class String_Replace2 {

	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!!";
		String WithNoSpace = sentence.replace(" ", "");
		System.out.println(WithNoSpace);
		//replace comma(), with !!!
		String withoutComma = sentence.replace(",", "!!!");
		System.out.println(withoutComma);
		
		String mixed ="&^@#ja-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("|$", "");
		System.out.println(mixed);
		mixed = mixed.replace("-", "").replace("|", "").replace("$", "");
		System.out.println(mixed);
		
		String result = "Yaklasik 5.410.000.000 sonuc bulundu (0,64 saniye)";
		result = result.replace("Yaklasik ", "").replace("sonuc bulundu (0,64 saniye)", "").replace(" ", ""); 
		System.out.println(result);
	}

}
