package day30_WrapperClass;

public class Task_96DegreeToCelcius {

	public static void main(String[] args) {
	
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java ";
		
		String str2 = str1.substring(str1.indexOf("72"), str1.indexOf(" degree"));
		double degree = Double.parseDouble(str2);
		
		double celcius = (degree - 32) * (5.0 / 9);
		System.out.println(degree + " degree is equal to " + (int)(celcius*100)/100.0 + " celcius");
		
	}

}
