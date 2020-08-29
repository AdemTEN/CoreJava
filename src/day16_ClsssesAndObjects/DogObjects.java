package day16_ClsssesAndObjects;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();
		
		dog1.age= 10;
		dog1.color = "Red";
		dog1.breed = "Maltese";
		dog1.name = "Rover";
		
		System.out.println(dog1.age );
		System.out.println(dog1.color);
		System.out.println(dog1.breed); 
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		dog2.age = 5;
		dog2.breed = "concord";
		dog2.color = "Black";
		dog2.name = "kangal";
		System.out.println(dog2.age);
		System.out.println(dog2.breed);
		System.out.println(dog2.color);
		System.out.println(dog2.name);
		
		
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		dog3.age = 5;
		dog3.breed = "Maya";
		dog3.color = "White";
		dog3.name = "Doberman";
		
		dog3.barking();
		dog3.hungry();
		dog3.sleeping();
		
		
	
		
		
		
		
		
		
		
		
	}

}
