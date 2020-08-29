package day30_WrapperClass;

public class Task_98 {

	public static void main(String[] args) {

		String str1 = "ni53453%&/(n&%/e Z457(54e%$678r/()o5 F87&&%ou32345r ";
		System.out.println(DecodeTheCode(str1));
	}

	public static String DecodeTheCode(String str) {
		str = str.toLowerCase();
		String newStr = "";
		String newStr2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				newStr = "";
			} else if (Character.isAlphabetic(str.charAt(i))) {
				newStr += str.charAt(i);
				switch (newStr) {
				case "zero":
					newStr2 += 0 + " ";
					break;
				case "one":
					newStr2 += 1 + " ";
					break;
				case "two":
					newStr2 += 2 + " ";
					break;
				case "three":
					newStr2 += 3 + " ";
					break;
				case "four":
					newStr2 += 4 + " ";
					break;
				case "five":
					newStr2 += 5 + " ";
					break;
				case "six":
					newStr2 += 6 + " ";
					break;
				case "seven":
					newStr2 += 7 + " ";
					break;
				case "eight":
					newStr2 += 8 + " ";
					break;
				case "nine":
					newStr2 += 9 + " ";
					break;

				}

			}
		}
		return newStr2;
	}

}
