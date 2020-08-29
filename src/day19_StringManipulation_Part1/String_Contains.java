package day19_StringManipulation_Part1;

public class String_Contains {

	public static void main(String[] args) {

		String str = "Hello mike,  welcome  to cybertek  world";
		boolean bool = str.contains("w");
		System.out.println(bool);
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, toatoes, eggs, milk, bread, cereal, meat, apples";
		
		if (list.contains("apples")) {
			System.out.println("apples is in your list");
		}
		boolean isEggsInList = list.contains("eggs");
		System.out.println("Contains eggs: " + isEggsInList);
		
		boolean isCucumberInList = list.contains("Cucumbers");
		System.out.println("Contains cucumbers:" + isCucumberInList);
		
		email = "name@yahoo.com";
		if(email.contains("yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("gmail")){
			System.out.println("Gmail accoount");
		}else if(email.contains("hotmail")){
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Car | Etsy";
		if (etsyTitle.contains("|")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("pipe is not dedected");
		}
		
		
	}

}
