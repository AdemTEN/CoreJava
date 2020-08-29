package day16_ClsssesAndObjects;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void newInfo() {
		System.out.println("Brand " + brand + " screenSize " + screenSize);
	}
	public void call() {
		
		System.out.println(brand + " is calling");
	}
	
	public void messagge() {
		System.out.println(brand + "is sending txt message");
	}
	
	public void takeaPhoto() {
		System.out.println(brand + " is taking a photo");
	}
	
}
