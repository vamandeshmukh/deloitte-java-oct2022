package deloitte.demo.day04;

public class ObjectDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(101, "Sonu", 10.5);

		System.out.println(emp1);
		System.out.println(emp2);

		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}

}
