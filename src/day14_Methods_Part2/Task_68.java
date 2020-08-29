package day14_Methods_Part2;

public class Task_68 {

	public static void main(String[] args) {
		String name = "Mike";
		
		System.out.println(yearsRetirment(name, 1990));

	}
	public static int age (int birth) {
		
		return 2020 -birth;
		
	}
	public static String yearsRetirment(String name, int birth) {
		
		int retirment =  67-age(birth);
		String str = name + " retires in " + retirment + " years";
		return str;
	}

}
