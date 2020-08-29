package day30_WrapperClass;

import java.util.Arrays;

public class Tas_96WithSplit {

	public static void main(String[] args) {
		
		String str1 = "Today  and weather is sunny and 85 degree. It is a perfect day to practice java ";
		
		String []str = str1.split("and ");
		str = str[2].split(" degree");
		System.out.println(Arrays.toString(str));
		
		double degree = Double.parseDouble(str[0]);
		System.out.println(degree);
		
		double celcius  = (degree- 32) * (5.0/9);
		System.out.println(degree + " degree is equal to " + Math.round(celcius)+ " celcius");
		
		Double celcisusObject = celcius;
		System.out.println(celcisusObject);

	}

}
