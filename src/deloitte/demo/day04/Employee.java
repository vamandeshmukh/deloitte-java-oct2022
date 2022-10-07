package deloitte.demo.day04;

import java.util.Objects;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, firstName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(firstName, other.firstName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
