package day16_ClsssesAndObjects;

public class Contact {
	
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling "  + name +  " .....");
	}

	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber  + " | name:" + name);
	}
	public void contactInfo() {
		System.out.println(name + " is Sending a message from " + phoneNumber);
	}
	
	public void sendEmail() {
		System.out.println("sending e-mail to " + email + "....");
	}
} 
