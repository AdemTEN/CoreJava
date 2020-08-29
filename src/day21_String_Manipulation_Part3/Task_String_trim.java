package day21_String_Manipulation_Part3;

public class Task_String_trim {

	public static void main(String[] args) {

		String str = " 342 ";
			str = str.replace(" ", "|");
			System.out.println(str);
			str = " 342 ";
			System.out.println("|" + str.trim() + "|");
			
	}

}
