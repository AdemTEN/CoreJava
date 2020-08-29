package day22_StringMaipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {

		String userName = " ";
		String password = "";
		
		if(userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
			
		}else {
			System.out.println("Username or password is not be empty");
		}
		System.out.println(userName.isBlank());
		System.out.println(userName.isEmpty());
		System.out.println(userName.isBlank());
		
		
		
		
		
		
	}

}
