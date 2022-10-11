package deloitte.demo.day06.col.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(104, "Monu", 95000));
		empList.add(new Employee(102, "Tonu", 80000));
		empList.add(new Employee(105, "Ponu", 99000));
		empList.add(new Employee(103, "Gonu", 85000));

		System.out.println("Original list:");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("List sorted by salary:");
		Collections.sort(empList, new EmployeeSalaryComparator());
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("List sorted by eid:");
		Collections.sort(empList, new EmployeeEidComparator());
		empList.forEach(e -> System.out.println(e.toString()));

	}

}
