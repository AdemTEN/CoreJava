package day30_WrapperClass;

public class Task_97 {

	public static void main(String[] args) {
	
		String s = "(((We&()&§lc7956746/%%o6442~³6]me&&7989 to <>Ja>>v24435357a";
		System.out.println(isLetter(s));
	}
	public static String isLetter(String str) {
		
		String newStr = "";
		for(int i=0; i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				newStr +=  str.charAt(i);
				
			}else if(str.charAt(i)==' ') {
				newStr += " ";
			}
		}
		return newStr;
	}

}
