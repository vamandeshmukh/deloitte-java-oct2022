package deloitte.demo.day06.lambda;

public class ImplementsDemo implements SomeInterface {

	@Override
	public void someMethod(int arg) {

		System.out.println("someMethod implemented " + arg);

	}

}
