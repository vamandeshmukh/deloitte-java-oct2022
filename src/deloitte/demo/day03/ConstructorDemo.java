package deloitte.demo.day03;

public class ConstructorDemo {

	public static void main(String[] args) {

		BankCustomer obj = new BankCustomer();
		obj.accountNumber = 12345;
		obj.customerName = "Sonu";
		obj.balance = 10.25;
		System.out.println(obj.toString());

		BankCustomer obj2 = new BankCustomer();
		obj2.accountNumber = 12346;
		obj2.customerName = "Monu";
		obj2.balance = 12.50;
		System.out.println(obj2.toString());
	}

}
