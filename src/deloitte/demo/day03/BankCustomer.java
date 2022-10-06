package deloitte.demo.day03;

public class BankCustomer {

	static String ifsc; // static - common for all objects - access with class reference
	int accountNumber; // non-static - unique for each object - access with object reference
	String customerName; // non-static - unique for each object - access with object reference
	double balance; // non-static - unique for each object - access with object reference

	public BankCustomer() {

	}

	void deposit() {

	}

	void withdraw() {

	}

	void transfer() {

	}

	void checkBalance() {

	}

	@Override
	public String toString() {
		return "BankCustomer [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance="
				+ balance + "]";
	}

}