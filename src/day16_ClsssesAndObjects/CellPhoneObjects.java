package day16_ClsssesAndObjects;

public class CellPhoneObjects {

	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone();
		
		cell1.newInfo();
		
		cell1.brand = "Nokia";
		cell1.color = "White";
		cell1.price = 500;
		cell1.screenSize = 16.2;
		
		cell1.newInfo();
		
		System.out.println(cell1.brand + " brand " + cell1.color + " color " 
		+ cell1.price + " $" + " and " + cell1.screenSize + " inches" );
		
		cell1.call();
		cell1.messagge();
		cell1.takeaPhoto();
		System.out.println("CELL2 VALUES\n---------------------------------------");
		CellPhone cell2 = new CellPhone(); 
		
		System.out.println(cell2.brand);
		cell2.brand = "Apple";
		cell2.color = "White";
		cell2.price = 450;
		cell2.screenSize = 2;
		
		cell2.call();
		cell2.newInfo();
		cell2.messagge();
	}

}
