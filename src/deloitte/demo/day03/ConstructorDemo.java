package deloitte.demo.day03;

// constructor - 
// is a special type of method 
// it does not have any return type 
// is needed to create an object 
// it's name is same as class name 
//a class can have one or more constructors 
// a no-args constructor is available by default 
// we can also create our own constructors 
// if we create our own constructor, the default constructor is not available 

public class ConstructorDemo {

	public static void main(String[] args) {

		BankCustomer obj = new BankCustomer();
		obj.accountNumber = 12345;
		obj.customerName = "Sonu";
		obj.balance = 10.25;
		System.out.println(obj.toString());

		BankCustomer obj2 = new BankCustomer();
		obj2.accountNumber = 12346;
		obj2.customerName = "Monu";
		obj2.balance = 12.50;
		System.out.println(obj2.toString());

//		BankCustomer obj3 = new BankCustomer(12347, "Tonu". 20.75);
//		System.out.println(obj3.toString());

	}

}
