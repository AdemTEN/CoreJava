package day30_WrapperClass;

public class ParsingValues {

	public static void main(String[] args) {
		
		String str = "2018";
		System.out.println(str);// String
		
		int number = Integer.parseInt(str);
		System.out.println(number);//int
		
		str += 1;
		number +=1;
		
		System.out.println(str);
		System.out.println(number);
		
		double number2 = Double.parseDouble(str);
		System.out.println(number2);
		
		short number3 = Short.parseShort(str);
		System.out.println(number3);
		
		//Int to String
		int i = 10;
		String s = String.valueOf(i);
		System.out.println(i);
		
		String s2 = Integer.toString(i);
		System.out.println(s2);
		
		
		
		

	}

}
