package day20_StringManipualtion_Part_2;

import java.util.Scanner;

public class Task_82_LoginCheck {

	public static void main(String[] args) {
		String userName = "tenten";
		String password = "Tenten2252";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String userNameInput = scan.nextLine();
		System.out.println("Enter your password: ");
		String passwordInput = scan.nextLine();
		

		if (userNameInput.equals("") && (passwordInput.equals(""))) {
			System.out.println("User Name and Password cannot be empty");
		} else if (userNameInput.equals("") && !passwordInput.equals("")) {
			System.out.println("User name connot be empty");
		} else if (!userNameInput.equals("") && passwordInput.equals("")) {
			System.out.println("Password connot be empty");
		} else if (!userNameInput.equals(userName) || !passwordInput.equals(password)) {
			System.out.println("User name or Password not valid!!! Please verify");
		} else if (userNameInput.equals(userName) && passwordInput.equals(password)) {
			System.out.println("User login succesfully");
		}

	}

}
