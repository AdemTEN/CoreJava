package day31_ArrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		cities.add("London");
		cities.add("Viriginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");

		System.out.println(cities.toString());
		System.out.println("####FOR EACH LOOP######");

		for (String ecahCities : cities) {
			System.out.print(ecahCities + " ");
		}
		System.out.println();
		System.out.println("#####ITERATION LOOP######");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		System.out.println("*****REMOVING BAKU IN THE ARRAY LIST******");
		
		cities.remove(3);
		cities.remove(cities.indexOf("Baku"));
		System.out.println(cities.toString());
		System.out.println();
		System.out.println("****ADD AGAIN BAKU*******");
		
		cities.add(3,"Baku");
		cities.add("Baku");
		System.out.println(cities.toString());
		
		String str = "Baku";
		cities.remove(str);
		System.out.println(cities.toString());
		
		cities.add(0,"Ankara");
		System.out.println(cities.toString());
		
		System.out.println("****************************");
		int idx = cities.indexOf("Bursa");
		System.out.println(idx);
		
		cities.set(0, "Ordu");
		System.out.println(cities.toString());
		System.out.println("*****************************");
		cities.clear();
		boolean bl = cities.isEmpty();
		System.out.println(bl);
		System.out.println(cities.isEmpty());

	}

}
