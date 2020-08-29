package day30_WrapperClass;

public class VariableArguments {

	public static void main(String[] args) {
		
		System.out.println(
				
				concat("Adem ", "Ozcan ", "Burhan " ,"Volkan ", "Erdal"));
		int sum = sum(2,4,5,64,4,79);
		System.out.println(sum);
		
		int i = Integer.MAX_VALUE;
		System.out.println(i);// Unboxing
	}
	public static String concat(String... str) {
		
		String newStr = "";
		
		for(String strEach : str) {
			
			newStr += strEach.charAt(3); 
		}
		return newStr;
	}
	
	public static int sum (int... numbers) {
		
		int sum = 0;
		for(int each : numbers) {
			
			sum += each;
		}
		return sum;
	 
 }
	
	

}
