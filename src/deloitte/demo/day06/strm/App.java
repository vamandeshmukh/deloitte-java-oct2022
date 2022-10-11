package deloitte.demo.day06.strm;

import java.util.ArrayList;
import java.util.List;

import deloitte.demo.day06.col.sorting.Employee;

public class App {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(104, "Monu", 95000));
		empList.add(new Employee(102, "Tonu", 80000));
		empList.add(new Employee(105, "Ponu", 99000));
		empList.add(new Employee(103, "Gonu", 85000));
		
		System.out.println("All employees list:");
		empList.forEach(e -> System.out.println(e.toString()));
		
		System.out.println("Employees with salary > 90K:");


	}

}
