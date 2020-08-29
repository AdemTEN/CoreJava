package day30_WrapperClass;

public class Boxing {

	public static void main(String[] args) {
	
		//AUTOBOXING
		Integer num1 = 1234;
		int n = 12;
		Integer num2 = n;
		System.out.println(num2);
		Integer n3 = new Integer("12");//NoBoxing:)
		
		//UNBOXING
		Double d1 = new Double (34.2);
		double d2 = d1;
		System.out.println(d1);
		System.out.println(d2);
		
		long l1 = new Long(600000L);
		long l3 = l1;//unboxing
	}

}
