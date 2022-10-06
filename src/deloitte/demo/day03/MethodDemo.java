package deloitte.demo.day03;

public class MethodDemo {

	public static void main(String[] args) {

		MethodDemo.hello();
		MethodDemo.hi("Sonu");

	}

	static void hello() {
		// lot of code
		System.out.println("Hello world!");
	}

	static void hi(String userName) {
		System.out.println("Hi " + userName + "!");
	}

}
