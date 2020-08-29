package day27_Arrays_Part4_Lab;

import java.util.Arrays;

public class Pizza_2D_Array {

	public static void main(String[] args) {
	
		String[][] pizzas = {
				
				{"pinneapple","pepperoni"}, //row-0
				{"anchovies","mushroom","olives"}, //row-1
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
		
		System.out.println(Arrays.toString(pizzas[0]));
		System.out.println();
		
		System.out.println("####FOR EACH LOOP####");
		for(String [] pizzaEach : pizzas) {
			System.out.print(pizzaEach.length + "-");
		System.out.println(Arrays.toString(pizzaEach));
		}

		System.out.println("####FOR ITERATOR LOOP####");
		System.out.println();
		
		for(int i=0 ; i<pizzas.length;i++) {
			System.out.print("elements of "  + (i+1)+ ".row==> ");
			for(int j=0; j<pizzas[i].length;j++) {
				System.out.print( pizzas[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0;i<pizzas.length;i++) {
			
			System.out.print(pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
		System.out.println();
		for(String  pizzaEach : pizzas[3]) {
			System.out.println(pizzaEach);
			
		}
		
		
	}

}
