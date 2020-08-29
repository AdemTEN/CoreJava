package day22_StringMaipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {

		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println("++++++++++++++++++");
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		
		String status = "";
		if (status.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(status.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(status.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if(status.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else if(status.isEmpty()) {
			System.out.println("No title");
		}
		
	}

}
