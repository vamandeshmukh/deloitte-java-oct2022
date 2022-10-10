package deloitte.demo.day05.encap;

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		System.out.println(emp.toString());
//		emp.salary = 10.5;
		System.out.println(emp.getSalary());
		emp.setSalary(10.5);
		System.out.println(emp.getSalary());

	}

}
