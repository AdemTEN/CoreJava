package day15_Method_Part3;

public class repl_176 {

	

		public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		   
			if((isAvailable == false) && (year== 2018 ) && (month == 7)
					&& (1<=day && day <=7) ){
				return false;
			}else {
				return true;
			}
				
			}
		     
		public static void main (String []args){
		    
		    System.out.println(simpleRoomBook(false, 2, 1, 2018));
		  }
}


