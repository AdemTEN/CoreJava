package day11_NestedFor_WhileLoops_DoWhile;

public class Task_90_02 {

	public static void main(String[] args) {

		String[] carName = { "Bmw", "Toyota", "Porche", "Nissan", "Mercedes", "Ferrari" };

		boolean flag = false;

		for (int i = 0; i < carName.length; i++) {

			if (carName[i].equalsIgnoreCase("Honda")) {
				flag = true;
				break;
			}

		}
		System.out.println(flag);
		if(flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it");
		}
	}
}
