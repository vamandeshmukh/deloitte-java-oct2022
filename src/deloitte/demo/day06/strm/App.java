package deloitte.demo.day06.strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//		empList.forEach((e) -> {
//			if (e.getSalary() > 90000)
//				System.out.println(e.toString());
//		});

//		Stream<Employee> empStream = empList.stream();
//		empStream.filter(e -> e.getSalary() > 90000).forEach(e -> System.out.println(e.toString()));

		empList.stream() // convert to stream
				.filter(e -> e.getSalary() > 90000) // apply logic
				.collect(Collectors.toList()) // convert back to collection
				.forEach(e -> System.out.println(e.toString())); // use collection

		System.out.println("Only first three Employees:");
		empList.stream() // convert to stream
				.limit(3)// apply logic
				.collect(Collectors.toList()) // convert back to collection
				.forEach(e -> System.out.println(e.toString())); // use collection

		System.out.println("Skip the first three Employees:");
		empList.stream() // convert to stream
				.skip(3)// apply logic
				.collect(Collectors.toList()) // convert back to collection
				.forEach(e -> System.out.println(e.toString())); // use collection

		System.out.println("Increase salary by 10% for all Employees:");
		empList.stream() // convert to stream
				.map(e -> {
					e.setSalary(e.getSalary() + (e.getSalary() * 1.10));
					return e;
				}) // apply logic
				.collect(Collectors.toList()) // convert back to collection
				.forEach(e -> System.out.println(e.toString())); // use collection
	}

}
