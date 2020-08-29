package day20_StringManipualtion_Part_2;

public class String_IndexOf {

	public static void main(String[] args) {

		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));

		System.out.println(word1.indexOf("java"));

		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of: " + i);

		System.out.println(url.charAt(i + 1));

		// find position of '-' and check if space is on on right and left side
		String title = "Java - Google Search";
		int x = title.indexOf("-");
		System.out.println(title.indexOf("-"));
		System.out.println(title.indexOf(" -"));
		System.out.println(title.indexOf("- "));
		System.out.println(title.charAt(x - 1));
		System.out.println(title.charAt(x + 1));

		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of States:" + states);

		String word2 = "java, c++, pyhton, tomcat, eclipse";
		if (word2.contains("c++")) {
			System.out.println("Word2 contains c++");
		} else {
			System.out.println("not contains c++");
		}

		System.out.println("Position of c++ is: " + word2.indexOf("c++"));
		
		
		if (word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
	}

}
