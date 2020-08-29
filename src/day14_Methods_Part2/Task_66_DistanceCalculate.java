package day14_Methods_Part2;

public class Task_66_DistanceCalculate {

	public static void main(String[] args) {

		double  distance =	distanceVehicle(85.5, 25);
		System.out.println(distance);
		//OR
		System.out.println(distanceVehicle(75, 10));
		
		if(distance>500) {
			System.out.println("you spend to more gas");
		}else {
			System.out.println("you spend enough gas");
		}
		
	}
	public static double distanceVehicle(double speed, double time) {
		double distance = speed * time;
		return distance;
	}

}
