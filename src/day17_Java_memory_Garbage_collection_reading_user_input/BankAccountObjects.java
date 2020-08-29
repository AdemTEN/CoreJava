package day17_Java_memory_Garbage_collection_reading_user_input;

public class BankAccountObjects {

	public static void main(String[] args) {

		BankAccounts acc1 = new BankAccounts();
		System.out.println(acc1);
		acc1.accountHolder = "Mike Smith";
		acc1.accountNumber = 12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		acc1.withdraw(100);
		acc1.showBalance();

		acc1.charge(50, "table");
		acc1.showBalance();
	}

}
