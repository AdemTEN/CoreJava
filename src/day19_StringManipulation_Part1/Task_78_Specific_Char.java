package day19_StringManipulation_Part1;

public class Task_78_Specific_Char {

	public static void main(String[] args) {

		String word = "abcabqcabc";
		int count = 0;
		for (int i = 0; i <=word.length()-1; i++) {
			if(word.charAt(i)== 'a') {
				count++;
			}
		}
		
		System.out.println("Number of a in this string: " + count);
	}

}
