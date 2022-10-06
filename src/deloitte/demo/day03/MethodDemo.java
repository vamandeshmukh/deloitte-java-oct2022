package deloitte.demo.day03;

public class MethodDemo {

	public static void main(String[] args) {

//		MethodDemo.hi("Sonu");
//		MethodDemo.hi2("Sonu", "Sood");

		MethodDemo.printTen();
		MethodDemo.getTenAndPrint(10);
		int i = MethodDemo.returnTen();
		System.out.println(i);
		int j = MethodDemo.getTenAndReturn(10);
		System.out.println(j);

	}

	static void printTen() { // No Arguments, No Return value - NANR
		System.out.println(10);
	}

	static void getTenAndPrint(int num) { // With Arguments, No return value - WANR
		System.out.println(num);
		;
	}

	static int returnTen() { // No Arguments, With Return value - NAWR
		return 10;
	}

	static int getTenAndReturn(int num) { // With Arguments, with return value - NWWR
		return num;
	}
//	static void hi(String userName) { // with arguments, without return value
//	System.out.println("Hi " + userName + "!");
//}
//
//static void hi2(String firstName, String lastName) { // with arguments, without return value
//	System.out.println("Hi " + firstName + " " + lastName + "!");
//}

}
