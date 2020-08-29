package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//create language ArrayList
		//print size Array List
		//Read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("Spanish");
		languages.add("Italianish");
		languages.add("German");
		
		languages.add(2, "Arabic");
		languages.remove(2);
		
		System.out.println("Size of ArrayList: " + languages.size());
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(languages.size()-1));
		
		
		for(String eachList : languages) {
			System.out.println(eachList);	
		}
		
		for(int i=0; i<languages.size();i++) {
			System.out.println(languages.get(i));
			
		}
		System.out.println(languages.toString());
		languages.add("Turkish");
		System.out.println(languages.toString());
		System.out.println("Number of size:" + languages.size());
	}

}
