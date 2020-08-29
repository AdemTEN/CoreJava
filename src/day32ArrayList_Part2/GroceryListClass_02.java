package day32ArrayList_Part2;

import java.util.ArrayList;

public class GroceryListClass_02 {

	ArrayList<String> groceryItems = new ArrayList<>();

	public void showList() {

		System.out.println("You have " + groceryItems.size() + " items in your grocery list: ");
		for (int i = 0; i < groceryItems.size(); i++) {
			System.out.println((i + 1) + ". " + groceryItems.get(i));
		}
	}
	public void addItem(String item) {
		groceryItems.add(item);
	}
	public void setItems(int itemNo, String newItem) {
		groceryItems.set(itemNo, newItem);
	}
	public void removeItem(int itemNo) {
		groceryItems.remove(itemNo);
	}
	public void isContainsItem (String itemName) {
		if(groceryItems.contains(itemName)) {
			System.out.println(itemName + " has found in the grocery list");
		}else {
			System.out.println(itemName + " has  not found in the  grocery list");
		}
		
		
		
	}
}
