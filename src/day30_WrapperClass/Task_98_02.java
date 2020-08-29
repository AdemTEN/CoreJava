package day30_WrapperClass;

import java.util.Arrays;

public class Task_98_02 {

	public static void main(String[] args) {

		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";

		String str2 = "N000000i%$!,n!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";

		System.out.println(decodeTheCode(str1));
		System.out.println(decodeTheCode(str2));

	}

	public static int decodeTheCode(String str) {
		str = str.toLowerCase();
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {
				newStr += str.charAt(i);
			}

		}

		String newStr2 = "";
		String[] array = newStr.split(" ");
		// System.out.println(Arrays.toString(array));
		for (String eachArray : array) {
			newStr2 += getNumber(eachArray);
		}
		int newStr2Number = Integer.parseInt(newStr2);
		return newStr2Number;

	}

	public static String getNumber(String str) {

		switch (str) {
		case "zero":
			return "0";
		case "one":
			return "1";
		case "two":
			return "2";
		case "three":
			return "3";
		case "four":
			return "4";
		case "five":
			return "5";
		case "six":
			return "6";
		case "seven":
			return "7";
		case "eight":
			return "8";
		case "nine":
			return "9";
		default:
			return "";
		}
	}

}
