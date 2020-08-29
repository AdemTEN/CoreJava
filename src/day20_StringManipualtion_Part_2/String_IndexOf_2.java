package day20_StringManipualtion_Part_2;

public class String_IndexOf_2 {

	public static void main(String[] args) {

		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println(secondDash);
		System.out.println(list.indexOf("-"));
		System.out.println(list.indexOf("ml" , 12));
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
		System.out.println(list.lastIndexOf("gr", 33));

		System.out.println(list.charAt(lastDash));
		
		int count = 0;
		for (int i = 0 ;i <list.length();i ++) {
			if(list.charAt(i)=='-') {
				count++;
			}
		}
		System.out.println(count);
	}

}
