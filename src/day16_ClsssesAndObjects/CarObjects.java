package day16_ClsssesAndObjects;

public class CarObjects {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.printCarInfo();
		
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.currentSpeed = 55;
		car1.color = "Grey";
		car1.printCarInfo();
		
		car1.showCurrentSpeed(50);
		car1.showCurrentSpeed(80);
		
		car1.drive();
		
		System.out.println("before:" + car1.currentSpeed);
		
		car1.accelerate(20);
		
		System.out.println("after: "+ car1.currentSpeed);
		
		
		
		
		
		
		
		
		
		
		
	}

}
