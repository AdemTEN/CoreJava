package day16_ClsssesAndObjects;

public class EmployeeObjects {

	public static void main(String[] args) {

		Employee person1 = new Employee();
		
		Employee person2 = new Employee();
		System.out.println("---------PERSON1-----------");
		person1.name = " Saim ";
		person1.jobTitle = " Tester ";
		person1.salary = 5000;
		
		person1.work();
		person1.attendMeeting();
		person1.introdue();
		System.out.println("---------PERSON2---------");
		person2.name ="Tarim";
		person2.jobTitle = " DEveloper";
		person2.salary = 3500;
		
		person2.work();
		person2.attendMeeting();
		person2.introdue();
	}

}
