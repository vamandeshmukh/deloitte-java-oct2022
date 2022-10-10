
package deloitte.demo.day05.abs;

//class SomeClass {

//
//	void someMethod() // method signature - what ?
//						// method body - how ?
//	{
//		// code
//	}
//
//	int addNums(int i, int j) {
//		return i + j;
//	}
//
//}

interface FinMin {

	public abstract void paySalary();
//	void paySalary();

}

abstract class Rbi { // abstract class

	abstract void doKyc(); // abstract method

	void payInterest() { // concrete method
		System.out.println("Paying 5% interest...");
	}

}

class HdfcBank extends Rbi implements FinMin { // concrete class

	@Override
	void doKyc() {
		System.out.println("HDFC : Submit Aadhaar copy ");
	}

	@Override
	public void paySalary() {
		System.out.println("Paying salary every month");
	}

}

class IciciBank extends Rbi implements FinMin {

	@Override
	void doKyc() {
		System.out.println("ICICI : Give thumb impression for Aadhaar");
	}

	@Override
	public void paySalary() {
		System.out.println("Paying salary every month");
	}

}

public class Bank {

	public static void main(String[] args) {

		System.out.println("HDFC");
		HdfcBank obj = new HdfcBank();
		obj.payInterest();
		obj.doKyc();
		obj.paySalary();
		System.out.println("ICICI");
		IciciBank obj2 = new IciciBank();
		obj2.payInterest();
		obj2.doKyc();
		obj2.paySalary();

//		Rbi obj3 = new Rbi();
//		FinMin obj4 = new FinMin();

	}
}
