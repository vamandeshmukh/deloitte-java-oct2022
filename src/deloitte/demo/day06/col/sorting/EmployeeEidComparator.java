package deloitte.demo.day06.col.sorting;

import java.util.Comparator;

public class EmployeeEidComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		if (emp1.getEid() == emp2.getEid())
			return 0;
		else if (emp1.getEid() > emp2.getEid())
			return 1;
		else
			return -1;
	}

}
