package deloitte.demo.day06.ex;

public class ThrowDemo {

	static void checkEligibility(int age) throws RuntimeException {

		if (age >= 18) {
			System.out.println("You may vote.");
		} else {
			throw new RuntimeException("Illegal voting attempt!");
		}

	}

	public static void main(String[] args) {

		System.out.println("Start");
		ThrowDemo.checkEligibility(17);
		System.out.println("End");

	}

}
