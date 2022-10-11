package deloitte.demo.day06.col.sorting;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		if (emp1.getSalary() == emp2.getSalary())
			return 0;
		else if (emp1.getSalary() > emp2.getSalary())
			return 1;
		else
			return -1;
	}

}
