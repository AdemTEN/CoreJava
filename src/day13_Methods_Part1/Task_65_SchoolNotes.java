package day13_Methods_Part1;

public class Task_65_SchoolNotes {

	public static void main(String[] args) {
       int x= 10;
       int y =69;
       int z = 89;
		grade(100, 120, 100);
		grade(x, y, z);
		
	}
	
	public static void grade(int grade1 , int grade2, int grade3) {
		
		int average = (grade1 + grade2 + grade3) /3;
		if (average >= 90 && average<=100) {
			System.out.println("A");
		}else if(average>=80 && average<=89) {
			System.out.println("B");
		}else if(average>=70 && average<=79) {
			System.out.println("C");
		}else if (average >= 60 && average <=69) {
			System.out.println("D");
		}else if(average <=59) {
			System.out.println("F");
		}else {
			System.out.println("invalid grade!!!");
		}
	}

}
