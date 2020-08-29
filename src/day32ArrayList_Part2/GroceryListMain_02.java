/*Press
	0 - To print choice option.
	1 - To print the list of the grocery items.
	2 - To add an item to the list
	3 - To modify an item in the list
	4 - To remove an item in the list
	5 - To search an item in the list
	6 - To quit the application

 * 
 */
package day32ArrayList_Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain_02 {

	static GroceryListClass_02 groceryList = new GroceryListClass_02();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		printList();
		int choice;

		do {
			System.out.print("Enter your choice:");
			choice = scan.nextInt();

			switch (choice) {
			case 0: printList();
				break;
			case 1: showGroceryList();
				break;
			case 2: enterGroceryItem();
				break;
			case 3: modifyGroceryItem();
				break;
			case 4: removeItemFromList();
				break;
			case 5: searchItemFromList();
				break;
//			

			}

		} while (choice != 6);
		
		System.out.println("************ GAMEOVER **********");

	}

	public static void printList() {

		System.out.println("Press\n" + "\t0 - To print choice option.\n"
				+ "\t1 - To print the list of the grocery items.\n" + "\t2 - To add an item to the list\n"
				+ "\t3 - To modify an item in the list\n" + "\t4 - To remove an item in the list\n"
				+ "\t5 - To search an item in the list\n" + "\t6 - To quit the application");

	}

	public static void showGroceryList() {

		groceryList.showList();

		}

	
	
	public static void enterGroceryItem(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the grocery item:");
		groceryList.addItem(scan.nextLine());
		
	}
	
	public static void modifyGroceryItem() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item number which you want to modify:");
		int itemNo = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your new item:");
		String newItem = scan.nextLine();
		groceryList.setItems(itemNo-1, newItem);
	}
	
	
	public static void removeItemFromList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item number which you want to remove:");
		int itemNo =  scan.nextInt();
		scan.nextLine();
		groceryList.removeItem(itemNo-1);
	}
	
	public static void searchItemFromList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item name which you want to search:");
		String itemName= scan.nextLine();
		groceryList.isContainsItem(itemName);
	}
	

}
