package day16_ClsssesAndObjects;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	
	
	
	public void work() {
		
		System.out.println(name + " is working hard....");
	}
	public void attendMeeting() {
		System.out.println(name + " is attending  meeting....");
		
	}
	public void introdue() {
		System.out.println("Name:" + name + " Job title:" + jobTitle + " Salary: " + salary);
	}
}
