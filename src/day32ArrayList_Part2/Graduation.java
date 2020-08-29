package day32ArrayList_Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Graduation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> groceryItems = new ArrayList<>();
		
		int choice;
		do {
			System.out.print("Enter your choice:");
			choice = scan.nextInt();
			if (choice == 0) {
				System.out.println("0 - To print choice option.\n" + "1 - To print the list of the grocery items.\n"
						+ "2 - To add an item to the list\n" + "3 - To modify an item in the list\n"
						+ "4 - To remove an item in the list\n" + "5 - To search an item in the list\n"
						+ "6 - To quit the application");

			} else if (choice == 1) {
				System.out.println("You have " + groceryItems.size() + " items in your grocery list");
				if (groceryItems.size() > 0) {
					for (int i = 0; i < groceryItems.size(); i++) {
						System.out.println((i + 1) + ". " + groceryItems.get(i));
					}
				}
			} else if (choice == 2) {
				System.out.println("Please enter the grocery item:");
				String enterItem = scan.next();
				groceryItems.add(enterItem);
			} else if (choice == 3) {
				System.out.println("Enter item number:");
				int itemNumber = scan.nextInt();
				System.out.println("Enter replacement item");
				String replacement = scan.next();
				groceryItems.set(itemNumber-1, replacement);
			} else if (choice == 4) {
				System.out.println("Enter item number:");
				int remove = scan.nextInt();
				groceryItems.remove(remove-1);
			} else if (choice == 5) {
				System.out.println("Item to search for:");
				String searchItem = scan.next();
				if (groceryItems.contains(searchItem)) {
					System.out.println("Found " + searchItem + " in your grocerylist");
				} else {
					System.out.println(searchItem + " cannot found in your grocery List");
				}
			}

		} while (choice != 6);
	}

}
