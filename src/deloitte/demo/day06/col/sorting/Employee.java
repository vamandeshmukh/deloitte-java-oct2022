package deloitte.demo.day06.col.sorting;

public class Employee {

	private int eid;
	private String firstName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

//package deloitte.demo.day06.col.sorting;
//
//public class Employee implements Comparable<Employee> {
//
//	private int eid;
//	private String firstName;
//	private double salary;
//
//	public Employee() {
//		super();
//	}
//
//	public Employee(int eid, String firstName, double salary) {
//		super();
//		this.eid = eid;
//		this.firstName = firstName;
//		this.salary = salary;
//	}
//
//	public int getEid() {
//		return eid;
//	}
//
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
//	}
//
//	@Override
//	public int compareTo(Employee employee) {
//		if (this.eid == employee.eid)
//			return 0;
//		else if (this.eid > employee.eid)
//			return 1;
//		else
//			return -1;
//	}
//
////	@Override
////	public int compareTo(Employee employee) {
////		if (this.salary == employee.salary)
////			return 0;
////		else if (this.salary > employee.salary)
////			return 1;
////		else
////			return -1;
////	}
//
//}
