package day17_Java_memory_Garbage_collection_reading_user_input;

public class BMW {
	
	String make ="BMW";
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i": price = 40250;break;
		case "740i": price = 85000;break;
		case "m3"  : price = 65000;break;
		default : System.out.println(model + "is not avaiable");
		price = 0.0;
		
		}
		System.out.println("price: " + price);
	}

}
