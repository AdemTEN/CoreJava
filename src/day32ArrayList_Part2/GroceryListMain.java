package day32ArrayList_Part2;

import java.util.Scanner;

public class GroceryListMain {

	static GroceryList groceryList = new GroceryList();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice;

		while (!quit) {
			System.out.print("Enter your choice:");
			choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit = true;
				break;
			}

		}

	}

	public static void printInstruction() {
		System.out.println("Press\n" + "\t0 - To print choice option.\n"
				+ "\t1 - To print the list of the grocery items.\n" + "\t2 - To add an item to the list\n"
				+ "\t3 - To modify an item in the list\n" + "\t4 - To remove an item in the list\n"
				+ "\t5 - To search an item in the list\n" + "\t6 - To quit the application");

	}
	
	public static void addItem() {
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryListItem(scan.nextLine());
	}
	public static void modifyItem() {
		System.out.println("Enter the item number");
		int itemNo = scan.nextInt();
		System.out.println("enter your replacment item");
		scan.nextLine();
		String newItem = scan.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	public static void removeItem() {
		System.out.println("Enter item number");
		int itemNo = scan.nextInt();
		scan.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
			
		}
	public static void searchItem() {
		System.out.println("Item to search for:");
		String searchItem = scan.nextLine();
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found" + searchItem + "in your grocery List");
		}else {
			System.out.println(searchItem + "can not found in your gricery List");
		}
	}
}
