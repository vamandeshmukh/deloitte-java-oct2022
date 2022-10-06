package deloitte.demo.day03.pc1;

public class Access {

	public static int num1 = 10; // accessible everywhere
	protected static int num2 = 20; // accessible only within the package and within subclasses
	static int num3 = 30; // accessible only within the package
	private static int num4 = 40; // accessible only in the class

	public static void main(String[] args) {

		System.out.println(Access.num1);
		System.out.println(Access.num2);
		System.out.println(Access.num3);
		System.out.println(Access.num4);

	}

}
