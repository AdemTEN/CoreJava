package day11_NestedFor_WhileLoops_DoWhile;

public class Task_90_CarArray {

	public static void main(String[] args) {

		String[] carName = { "Bmw", "Toyota", "Porche", "Nissan", "Mercedes", "Ferrari" };
		int count = 0;
		
		for (int i = 0; i < carName.length; i++) {

			if (carName[i].equalsIgnoreCase("Honda")) {
				System.out.println("I found your car Honda in this array");
				break;
			} else {
				count++;
				if (count == carName.length) {
					System.out.println("I could not found your car Honda in this array");
				}
			}

		}
	}

}
