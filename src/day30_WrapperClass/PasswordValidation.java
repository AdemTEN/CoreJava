/*
		 Write a return method that can verify if a password is valid or not
		 Requirements:
		 1-Password MUST be at least have 6 characters and should not contain space
		 2-Password should at least contain one upper case letter
		 3-Password should at least contain one lowercase letter
		 4-Password should at least contain one special character
		 5-Password should at least contain a digit
		 If All requirements above met, the method returns true, otherwise returns false 
 */
package day30_WrapperClass;

public class PasswordValidation {

	public static void main(String[] args) {
		
		String pass = "Gs3dfsgd%ffg";
		System.out.println(isValidPassWord(pass));
	}
	public static boolean isValidPassWord(String str) {
		boolean length = false;
		boolean space = true;
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean specialChar = false;
		boolean digit = false;
		
		if(str.length()>= 6) {
			length = true;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isSpaceChar(str.charAt(i))) {
				space = false;
				break;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upperCase = true;
				break;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				lowerCase = true;
				break;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isLetterOrDigit(str.charAt(i))&& !Character.isSpaceChar(str.charAt(i))) {
				specialChar = true;
				break;
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				digit = true;
				break;
			}
		}
		
		if(length && space && upperCase && lowerCase && specialChar && digit) {
			return true;
		}else {
			return false;
		}
		
	}

}
