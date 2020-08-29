package day27_Arrays_Part4_Lab;

public class ForEachLoop2D {

	public static void main(String[] args) {
		
		int[][] student = {{4,5,6}, {12,13,8}, {23,45,67,67,12}};
		
		for(int [] group: student) { // iteration of each rows
			
			for(int studentID : group ) {// iteration of each column of row
				
				System.out.println(studentID);
			}
		}

	}

}
