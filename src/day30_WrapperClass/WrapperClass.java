package day30_WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		
		int n1 = 10;
		Integer n2 = new Integer(10);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("-----------------------------");
		double d1 = 44.5;
		Double d2 = new Double (44.5);
		Double d3 = new Double ("44.5");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3+n2);
		System.out.println("-----------------------------");
		char ch1 = 'a';
		Character ch2 = new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1+ch2);
		System.out.println("------------------------------");
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100);
		System.out.println(b1);
		System.out.println(b2); 
		System.out.println("############");
		
		Integer num1 = Integer.valueOf(1257);
		System.out.println(num1);
		
		Boolean bool1 = Boolean.valueOf(true);
		System.out.println(bool1);
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool2);
		
		
	}

}
