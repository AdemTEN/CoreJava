package day32ArrayList_Part2;

import java.util.ArrayList;

public class equalMethod {

	public static void main(String[] args) {
		
		ArrayList<String> friends1 = new ArrayList<>();
		ArrayList<String> friends2 = new ArrayList<>();
		
		friends1.add("Adem");
		friends1.add("Yavuz");
		
		friends2.add("Adem");
		friends2.add("Yavuz");
		
		System.out.println(friends1.equals(friends2));
		System.out.println(friends1==friends2);
	}

}
