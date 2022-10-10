package deloitte.demo.day05.inherit;

class A {

}

class B {

}

class C extends A {

}

public class InheritDemo {

	public static void main(String[] args) {

		System.out.println("basic phone:");
		Phone phone1 = new Phone();
		phone1.call();
		phone1.sms();

		System.out.println("Feature phone:");
		FeaturePhone phone2 = new FeaturePhone();
		phone2.call();
		phone2.sms();
		phone2.music();

		System.out.println("Smart phone:");
		SmartPhone phone3 = new SmartPhone();
		phone3.call();
		phone3.sms();
		phone3.music();
		phone3.camera();

	}

}
