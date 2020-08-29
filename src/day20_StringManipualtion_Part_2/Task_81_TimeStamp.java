package day20_StringManipualtion_Part_2;

public class Task_81_TimeStamp {

	public static void main(String[] args) {
//		String date = "10/10/2019 14:59:00";
//		String timeStamp = timeStamp(date);
//		System.out.println(timeStamp);
		
		String  date = "10/10/2019 " + timeCurrent(); 
		date = date.replace("/", "").replace(":", "").replace(" ", "");
		System.out.println(date);
	}
	public static String timeCurrent() {
		long currentTotalTime = System.currentTimeMillis();
		long curentTotalSecond = currentTotalTime / 1000;
		long curentSecond = curentTotalSecond % 60;
		long curentMinute = curentTotalSecond / 60 % 60;
		long currentHour = curentTotalSecond /60 /60 % 24;
		String  time = (currentHour + ":" + curentMinute + ":" + curentSecond );
		return time;
	}

}
