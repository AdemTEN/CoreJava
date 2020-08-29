package day20_StringManipualtion_Part_2;

public class Task_80IndexOf {

	public static void main(String[] args) {

		String str1 = "Your order confirmation number is XYZ";
		String str2 = "confirmation";
		checkedString(str1, str2);		
	}

	public static void checkedString(String str1, String str2) {
		
		if(str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		}else {
			System.out.println("Not found");
		}
		
		
		
	}
}
