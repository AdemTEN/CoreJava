package day19_StringManipulation_Part1;

import java.util.Scanner;

public class Task77_EmojiProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your emojis:");
		String emoji = scan.next();

		if (emoji.length() != 2) {
			System.out.println("Invalid Imoji");
			return;//stop execution
		} else if (emoji.charAt(0) == ':') {
			if (emoji.charAt(1) == ')') {
				System.out.println("Smile");
			} else if (emoji.charAt(1) == '(') {
				System.out.println("Sad");
			} else if (emoji.charAt(1) == '/') {
				System.out.println("Upset");
			} else if (emoji.charAt(1) == 'p') {
				System.out.println("Playful");
			} else {
				System.out.println("Invalid emoji");
			}
		} else if (emoji.charAt(0) == ';') {
			if (emoji.charAt(1) == ')') {
				System.out.println("Wink");
			} else if (emoji.charAt(1) == '0') {
				System.out.println("Surprised");
			} else {
				System.out.println("Invalid emoji");
			}

		}else {
			System.out.println("invalid emoji");
		}

	}

}
