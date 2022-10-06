package deloitte.demo.day03;

public class ClassDemo {

	public static void main(String[] args) {

		BankCustomer.ifsc = "SBIN001234";

		BankCustomer obj = new BankCustomer();

		obj.accountNumber = 10203345;
		obj.customerName = "Sonu Sood";
		obj.balance = 10.75;

	}

}
