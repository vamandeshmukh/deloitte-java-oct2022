package deloitte.demo.day06.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		ImplementsDemo obj = new ImplementsDemo();
		obj.someMethod(10);

//		SomeInterface obj2 = new SomeInterface();

//		SomeInterface obj2 = (arg) -> {
//			System.out.println("someMethod implemented " + arg);
//		};

		SomeInterface obj2 = (arg) -> System.out.println("someMethod implemented " + arg);

		obj2.someMethod(20);

	}

}
