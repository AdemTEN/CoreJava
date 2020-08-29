package day15_Method_Part3;

public class Task66_2 {

	public static void main(String[] args) {

		double travel = distance(85, 35);
		System.out.println(travel + " km/sa");
		
	}

	public static double distance (double speed, double time) {
		
		double distance = speed * time;
		return distance;
	}
}
