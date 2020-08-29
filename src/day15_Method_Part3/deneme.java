package day15_Method_Part3;

public class deneme {

	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		
		if (isAvailable == false) {
			return false;
		}else if (isAvailable == true) {
			if (year == 2018) {
				if (month == 7) {
					if (day <= 8) {
						return false;
					}
				}
			}
		}else if (isAvailable == true) {
			if (year != 2018) {
				return false;
			}

		} 
		return true;
	}

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(true, 7, 2, 2018));
	}
}