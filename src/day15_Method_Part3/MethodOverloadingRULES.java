/*
  
 
1- Number of parameters
	add(int,int)
	add(int,int,int)
2-Data Type of Parameters
	add(int,int)
	add(int,float)
	
3- Sequence of data type parameters
	add(int,float)
	add(float,int)
	
4- Invalid Case - not overloading
	int add(int,int)
	float add(int,int)
	
*/
package day15_Method_Part3;

public class MethodOverloadingRULES {

	public static void main(String[] args) {
		
		int x = sum(3, 4);
		int y = sum(4, 5, 8 );
		int z = sum(5, 6, 9, 10);
		int g = sum(5,6);
		System.out.println(x + y +z + g);
		
		 
	}
	public static int sum (int a, int b) {
		return a+b;
	}

	public static int sum (int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum (int a, int b , int c, int d) {
		return a+b+c+d;
	}
	public static void sum() {
		System.out.println("hello world");
	}
}


