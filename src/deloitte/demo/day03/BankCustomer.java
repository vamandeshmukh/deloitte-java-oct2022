package deloitte.demo.day03;

public class BankCustomer {

	static String ifsc; // static - common for all objects - access with class reference
	int accountNumber; // non-static - unique for each object - access with object reference
	String customerName; // non-static - unique for each object - access with object reference
	double balance; // non-static - unique for each object - access with object reference

	public BankCustomer() {
		System.out.println("default constructor called");
	}

	public BankCustomer(int accountNumber, String customerName) {
		System.out.println("2 parameterized constructor called");
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public BankCustomer(int accountNumber, String customerName, double balance) {
		System.out.println("all parameterized constructor called");
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankCustomer [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance="
				+ balance + "]";
	}

//	public void deposit() {
//
//	}
//
//	void withdraw() {
//
//	}
//
//	void transfer() {
//
//	}
//
//	void checkBalance() {
//
//	}
}