
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

abstract class Rbi { // abstract class

	abstract void doKyc(); // abstract method

	void payInterest() { // concrete method
		System.out.println("Paying 5% interest...");
	}

}

class HdfcBank extends Rbi { // concrete class

	@Override
	void doKyc() {
		System.out.println("HDFC : Submit Aadhaar copy ");
	}

}

class IciciBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("ICICI : Give thumb impression for Aadhaar");
	}

}

public class Bank {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.payInterest();
		obj.doKyc();
		IciciBank obj2 = new IciciBank();
		obj2.payInterest();
		obj2.doKyc();

	}
}
