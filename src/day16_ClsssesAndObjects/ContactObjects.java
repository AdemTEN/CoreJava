package day16_ClsssesAndObjects;

public class ContactObjects {

	public static void main(String[] args) {

		Contact person1 = new Contact();
		
		Contact person2 = new Contact();
		
		person1.name = "Adem";
		person1.phoneNumber = "0177 158855";
		person1.email = "ademt@yahoo.com";
		
		person1.call();
		System.out.println("Number of the " + person1.name + " is: " + person1.phoneNumber);
		person1.contactInfo();
		System.out.println("-------PERSON2 INFOS--------");
		person2.name = "Sinem";
		person2.phoneNumber = "0212 53445";
		person2.email = "snmtn2406@gmail.com";
		
		person2.contactInfo();
		person2.call();
		person2.sendEmail();
		person2.sendMessage();
		
		
		
		
		
	}

}
